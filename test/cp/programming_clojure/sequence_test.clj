(ns cp.programming-clojure.sequence-test
  (:use [cp.programming-clojure.sequence :refer :all])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= (get-first) 1)))