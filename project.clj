(defproject conjblog "0.1.0-SNAPSHOT"
  :description "ConjBlog is a blogging framework written in Clojure"
  :url "https://github.com/tlehman/conjblog"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.postgresql/postgresql "42.3.1"]
                 [toucan "1.18.0"]]
  :repl-options {:init-ns conjblog.core})
