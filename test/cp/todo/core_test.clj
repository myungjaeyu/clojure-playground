(ns cp.todo.core-test
  (:require [clojure.test :refer :all]
            [cp.todo.core :refer :all]))

(deftest create-todo-test
  (is (= 0 (count @todos)))
  (create-todo "할 일")
  (is (= 1 (count @todos))))

(deftest remove-todo-test
  (create-todo "할 일")
  (is (= 1 (count @todos)))
  (let [id (first (keys @todos))]
       (remove-todo id))
  (is (= 0 (count @todos))))

(deftest remove-all-todos-test
  (create-todo "할일 1")
  (create-todo "할일 2")
  (is (= 2 (count @todos)))
  (remove-all-todos)
  (is (= 0 (count @todos)))
  (is (= 0 @p-key-count)))