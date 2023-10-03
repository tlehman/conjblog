(ns conjblog.core
  (:require [toucan.db :as db]
            [toucan.models :as models])
  (:use [toucan.models]))

(db/set-default-db-connection!
 {:classname "org.postgresql.Driver"
  :subprotocol "postgresql"
  :subname "//localhost:5432/tlehman-blog-db"
  :user "tobi"})

(defmodel User :users
  IModel
  (types [this]
         {:status :keyword}))


(db/insert! User :name "Tobi" :status :new)


(Class/forName "org.postgresql.Driver")

