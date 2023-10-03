(ns conjblog.core
  (:require [toucan.db :as db]
            [toucan.models :as models]
            [ragtime.jdbc :as jdbc])
  (:use [toucan.models]))


;; First the database must exist, then we use Toucan to connect to it.
;; then (toucan.db/connection) is used as in (ragtime.jdbc/sql-database (db/connection))
;; as the datastore!

;; Toucan jdbc connection
(db/set-default-db-connection!
 {:classname "org.postgresql.Driver"
  :subprotocol "postgresql"
  :subname "//localhost:5432/tlehman-blog-db"
  :user "tobi"})


;; Ragtime jdbc config (tells Ragtime where the database and the migrations are)
(def migration-config
  {:datastore (jdbc/sql-database (db/connection))
   :migrations (jdbc/load-resources "migrations")})


(repl/migrate migration-config)


(defmodel User :users
  IModel
  (types [this]
         {:status :keyword}))

(db/insert! User :name "Tobi" :status :new)


(Class/forName "org.postgresql.Driver")

