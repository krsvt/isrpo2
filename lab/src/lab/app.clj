(ns lab.app
  ;; (:require
  ;;  [com.biffweb :as biff :refer [q]]
  ;;           [com.biffweb.example.postgres.middleware :as mid]
  ;;           [com.biffweb.example.postgres.ui :as ui]
  ;;           [com.biffweb.example.postgres.settings :as settings]
  ;;           [com.biffweb.example.postgres.util.postgres :as util-pg]
  ;;           [next.jdbc :as jdbc]
  ;;           [rum.core :as rum]
  ;;           [ring.adapter.jetty9 :as jetty]
  ;;           [cheshire.core :as cheshire])
  )
(defn add-patient [ctx]
  {:status 200})

(defn get-patients [{:keys [biff/db] :as ctx}]
  {:status 200
   :body {:hello "world"}})

(defn get-patient [ctx]
  (let [id (-> ctx :path-params :id)]
    {:status 200}))

(defn update-patient [ctx]
  (let [id (-> ctx :path-params :id)
        pat (-> ctx :body)]
    {:status 200}))

(defn delete-patient [ctx])

(def module
  {:api-routes [["/api/patient"
                 ["" {:post add-patient
                      :get get-patients}]

                 ["/:id"
                  {:get get-patient
                   :put update-patient
                   :delete delete-patient}]]]})
