(ns figwheel-test.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[figwheel-test started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[figwheel-test has shutdown successfully]=-"))
   :middleware identity})
