(ns figwheel-test.app
  (:require [figwheel-test.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
