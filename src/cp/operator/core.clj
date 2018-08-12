(ns cp.operator.core)

(defn get-map []
  (map inc [1 2 3 4]))

(defn get-map-2 []
  (map (fn [ [key value] ]
           (hash-map key value))
       { :a 1 :b 2 :c 3 }))

(defn get-filter []
  (filter even? [1 2 3 4]))

(defn get-filter-2 []
  (let [x (filter (fn [ [key value] ]
                      (even? value))
              { :a 1 :b 2 :c 3 })]
              (hash-map :x (first x))))

(defn get-keep []
  (keep (fn [ [key value] ]
            (when (even? value)
            (hash-map key value)))
        { :a 1 :b 2 :c 3 }))

(defn get-reduce []
  (reduce + [1 2 3 4 5]))

(defn get-reduce-2 []
  (reduce
    (fn [acc cur]
        (+ acc cur))
    [1 2 3 4 5]))