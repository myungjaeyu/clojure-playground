(ns cp.data-structure.hash-set)

(defn get-hash-set []
  #{1 2 3})

(defn get-hash-set-2 []
  (hash-set 1 2 3))

(defn get-conj []
  (conj (get-hash-set) 4))

(defn get-disj []
  (disj (get-hash-set) 3))