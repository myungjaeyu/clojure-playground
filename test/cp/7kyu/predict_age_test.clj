(ns cp.7kyu.predict-age-test
  (:use [cp.7kyu [predict-age]])
  (:require [clojure.test :refer :all]))

(deftest predit-age-test1
  (is (= (predict-age 65 60 75 55 60 63 64 45) 86)))

(deftest predit-age-test2
  (is (= (predict-age 32 54 76 65 34 63 64 45) 79)))