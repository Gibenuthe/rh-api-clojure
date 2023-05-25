(ns rh-api-clojure.lib.routes
  (:require
    [compojure.core :refer :all]
    [compojure.route :as route]
    [clojure.pprint :as pp]
    [clojure.string :as str]
    [clojure.data.json :as json]
    [rh-api-clojure.lib.api :as api])
  (:gen-class))

(defn echo-route 
  "Echo back the request"
  [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (-> (str "GET '/' " req))})

(defn get-funcionarios-route 
  "Echo back a name"
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/get-funcionarios))})

(defn add-funcionario-route 
  "Endpoint para adicionar funcionario"
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/add-funcionario (req :params)))})

(defn get-departamentos-route 
  "Echo back a name"
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/get-departamentos))})

(defn add-departamento-route 
  "Endpoint para adicionar departamento"
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/add-departamento (req :params)))})

(defn get-funcionarios-full-route 
  "Echo back a name"
  [req]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (-> (api/get-funcionarios-full))})