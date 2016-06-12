(ns user
  (:require [mount.core :as mount]
            [figwheel-test.figwheel :refer [start-fw stop-fw cljs]]
            figwheel-test.core))

(defn start []
  (mount/start-without #'figwheel-test.core/repl-server))

(defn stop []
  (mount/stop-except #'figwheel-test.core/repl-server))

(defn restart []
  (stop)
  (start))


