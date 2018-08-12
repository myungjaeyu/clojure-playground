(ns cp.data-structure.hash-map-test
  (:use [cp.data-structure.hash-map :refer :all])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= (get-hash-map) {:a 1 :b 2 :c 3}))
  (is (= (get-hash-map-2) {:a 1 :b 2 :c 3}))
  (is (= (get-assoc) {:a 1 :b 2 :c 3 :d 4}))
  (is (= (get-assoc-update) {:a 1 :b 2 :c "updated"}))
  (is (= (get-dissoc) {:a 1 :b 2}))
  (is (= (get-assoc-in) {:a {:name "u4bi" :level 100} }))
  (is (= (get-update-in) {:a {:name "u4bi" :level 18} }))
  (is (= (get-dissoc-in) {:a {:level 17}})))