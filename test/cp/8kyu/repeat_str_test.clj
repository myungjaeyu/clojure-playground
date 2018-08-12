(ns cp.8kyu.repeat-str-test
  (:use [cp.8kyu [repeat-str]])
  (:require [clojure.test :refer :all]))

(deftest a-test1
  (testing "Test1"
    (is (= (repeat-str 4 "a") "aaaa"))))

(deftest a-test2
  (testing "Test2"
    (is (= (repeat-str 3 "hello ") "hello hello hello "))))

(deftest a-test3
  (testing "Test3"
    (is (repeat-str 2 "abc") "abcabc")))