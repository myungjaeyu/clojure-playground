(ns cp.data-structure.hash-set-test
  (:use [cp.data-structure.hash-set :refer :all])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= (get-hash-set) #{1 2 3}))
  (is (= (get-hash-set-2) #{1 2 3}))
  (is (= (get-conj) #{1 2 3 4}))
  (is (= (get-disj) #{1 2})))