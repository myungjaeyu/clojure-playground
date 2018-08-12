(ns cp.cw-kata.8kyu.number-to-string-test
  (:use [cp.cw-kata.8kyu [number-to-string]])
  (:require [clojure.test :refer :all]))

(deftest a-test1
  (testing "Test1"
    (is (= (number-to-string 0) "0"))))

(deftest a-test2
  (testing "Test2"
    (is (= (number-to-string 50) "50"))))

(deftest a-test3
  (testing "Test3"
    (is (= (number-to-string 144) "144"))))