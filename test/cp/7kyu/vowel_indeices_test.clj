(ns cp.7kyu.vowel-indeices-test
  (:use [cp.7kyu [vowel-indeices]])
  (:require [clojure.test :refer :all]))

(deftest vowel-indeices-test1
  (is (= (vowel-indeices "mmmm") [])))

(deftest vowel-indeices-test2
  (is (= (vowel-indeices "super") [2,4])))

(deftest vowel-indeices-test3
  (is (= (vowel-indeices "apple") [1,5])))

(deftest vowel-indeices-test4
  (is (= (vowel-indeices "yomama") [1,2,4,6])))