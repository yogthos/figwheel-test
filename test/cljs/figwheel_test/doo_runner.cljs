(ns figwheel-test.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [figwheel-test.core-test]))

(doo-tests 'figwheel-test.core-test)

