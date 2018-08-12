(ns cp.conditional.core-test
  (:use [cp.conditional.core :refer :all])
  (:require [clojure.test :refer :all]))

(deftest simple-tests
  (is (= (get-if) "true!"))
  (is (= (get-when) "true!"))
  (is (= (get-cond) "C"))
  (is (= (get-case) "C"))
  (is (= (get-if-let) "u4bi"))
  (is (= (get-when-let) "u4bi")))