(ns rh-api-clojure.lib.api
  (:require 
    [compojure.core :refer :all]
    [compojure.route :as route]
    [clojure.pprint :as pp]
    [clojure.string :as str]
    [clojure.data.json :as cjson]
    [rh-api-clojure.lib.db :as db])
  (:gen-class))

(defn get-funcionarios
  "Recupera a lista de funcionarios"
  []
  (db/select :funcionarios [:id :nome :cargo :salario :departamento_id]))

(defn add-funcionario
  "Adiciona um funcionario"
  [{ nome :nome cargo :cargo salario :salario departamento_id :departamento_id :as record }]
  (db/insert :funcionarios record))

(defn get-departamentos
  "Recupera a lista de departamentos"
  []
  (db/select :departamentos [:id :nome]))

(defn add-departamento
  "Adiciona um departamento"
  [{ nome :nome :as record }]
  (db/insert :departamentos record))
  
(defn get-funcionarios-full
  "Recupera a lista de funcionarios com departamento"
  []
  (db/select-all [:funcionarios :departamentos] 
                 (concat [:funcionarios.*] 
                         [(str "departamentos.nome AS departamento_nome")])
                 "funcionarios.departamento_id = departamentos.id"))