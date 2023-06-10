(defproject rh-api-clojure "0.1.0-SNAPSHOT"
  :description "API em Clojure para conexão em banco de dados Postgres"
  :url ""
  :license {:name "MIT"
    :url "https://github.com/Gibenuthe/rh-api-clojure/blob/main/LICENSE"}
  :dependencies [
    [org.clojure/clojure "1.10.0"]
    [org.clojure/data.json "0.2.6"]
    [org.clojure/java.jdbc "0.7.12"]
    [org.postgresql/postgresql "42.1.4"]
    [ring/ring-defaults "0.3.2"]
    [ring/ring-devel "1.6.3"]
    [ring/ring-json "0.5.0"]
    [compojure "1.6.1"]
    [http-kit "2.3.0"]
    [lynxeyes/dotenv "1.0.2"]]
  :main ^:skip-aot rh-api-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:main rh-api-clojure.core/-dev-main}})
