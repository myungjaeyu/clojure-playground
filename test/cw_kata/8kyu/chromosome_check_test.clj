(ns cw-kata.8kyu.chromosome-check-test
  (:use [cw-kata.8kyu [chromosome-check]])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= "Congratulations! You're going to have a son." (chromosome-check "XY")))
  (is (= "Congratulations! You're going to have a daughter." (chromosome-check "XX"))))