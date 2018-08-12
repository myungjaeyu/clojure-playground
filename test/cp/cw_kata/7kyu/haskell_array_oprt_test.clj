(ns cp.cw-kata.7kyu.haskell_array_oprt-test
  (:use [cp.cw-kata.7kyu [haskell_array_oprt]])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (head [5 1]) 5)
  (is (tail [1]) [])
  (is (init [1 5 7 9]) [1 5 7])
  (is (last_ [7 2]) 2))