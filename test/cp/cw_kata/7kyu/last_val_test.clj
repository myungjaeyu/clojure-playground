(ns cp.cw-kata.7kyu.last-val-test
  (:use [cp.cw-kata.7kyu [last-val]])
  (:require [clojure.test :refer :all]))

(deftest last-val-test1
  (is (= (last-val [1 9 13 1 99 9 9 13]) 13)))

(deftest last-val-test2
  (is (= (last-val "\"I suppose I should learn Lisp, but it seems so foreign.\" - Paul Graham, Nov 1983") \3)))