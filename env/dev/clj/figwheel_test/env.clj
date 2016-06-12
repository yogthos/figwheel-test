(ns figwheel-test.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [figwheel-test.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[figwheel-test started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[figwheel-test has shutdown successfully]=-"))
   :middleware wrap-dev})
