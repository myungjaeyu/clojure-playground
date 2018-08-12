(ns cp.cw-kata.7kyu.reverse-longer-test
  (:use [cp.cw-kata.7kyu [reverse-longer]])
  (:require [clojure.test :refer :all]))

(deftest sample-tests
  (is (= (reverse-longer "first" "abcde") "abcdetsrifabcde" ))
  (is (= (reverse-longer "hello" "bau") "bauollehbau"))
  (is (= (reverse-longer "abcde" "fghi") "fghiedcbafghi"))
  (is (= (reverse-longer "abc" "123") "123cba123"))
  (is (= (reverse-longer "" "123") "321"))
  (is (= (reverse-longer "abc" "") "cba")))