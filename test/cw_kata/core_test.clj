(ns cw-kata.core-test
  (:require [clojure.test :refer :all]
            [cw-kata.common.core :refer :all]))

(deftest a-test
  (testing "hello unit test"
    (is (= (hello) "Hello World"))))
