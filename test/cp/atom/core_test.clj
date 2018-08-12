(ns cp.atom.core-test
  (:require [clojure.test :refer :all]
            [cp.atom.core :refer :all]))

(deftest atom-test1
  (is (= 0 (get-val))))

(deftest atom-test2
  (is (= 1 (add-val)))
  (is (= 1 (get-val))))

(deftest atom-test3
  (is (= 0 (fn-val))))

(deftest atom-test4
  (is (= 0 (reset-val))))

(deftest atom-test5
  (is (= {:name "u4bi" :info { :level 17 } } (get-user))))

(deftest atom-test6
  (is (= {:name "u4bi" :info { :level 11 } } (set-user-level 11))))

(deftest atom-test7
  (is (= {:name "u4bi" :info { :level 0 } } (reset-user))))