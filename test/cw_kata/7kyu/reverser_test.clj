(ns cw-kata.7kyu.reverser-test
  (:use [cw-kata.7kyu [reverser]])
  (:require [clojure.test :refer :all]))

(deftest reverser-test1
  (is (= (reverser "How now brown cow") "woH won nworb woc")))

(deftest reverser-test2
  (is (= (reverser "racecar.") ".racecar")))

(deftest reverser-test2
  (is (= (reverser " go away ") " og yawa ")))

(deftest reverser-test2
  (is (= (reverser "I like noodles") "I ekil seldoon")))

(deftest reverser-test2
  (is (= (reverser "The red pen wrote on the wall") "ehT der nep etorw no eht llaw")))

(deftest reverser-test2
  (is (= (reverser "Green trucks drive fast") "neerG skcurt evird tsaf")))

(deftest reverser-test2
  (is (= (reverser "Pink trucks drive slow") "kniP skcurt evird wols")))

(deftest reverser-test2
  (is (= (reverser "Be happy") "eB yppah")))