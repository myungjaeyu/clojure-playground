(ns cp.7kyu.average-test
  (:use [cp.7kyu [average]])
  (:require [clojure.test :refer :all]))

(deftest average-test1
  (is (= (average []) 0)))

(deftest average-test2
  (is (= (average [3]) 3)))

(deftest average-test3
  (is (= (average [5 3 3 5]) 4)))

(deftest average-test4
  (is (= (average [7 8 9 10]) 8)))
