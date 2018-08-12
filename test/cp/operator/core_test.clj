(ns cp.operator.core-test
  (:use [cp.operator.core :refer :all])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= (get-map) [2 3 4 5]))
  (is (= (get-map-2) [ {:a 1} 
                       {:b 2}
                       {:c 3}]))
  (is (= (get-filter) [2 4]))
  (is (= (get-filter-2) {:x [:b 2]}))
  (is (= (get-keep) [ {:b 2} ]))
  (is (= (get-reduce) 15))
  (is (= (get-reduce-2) 15)))