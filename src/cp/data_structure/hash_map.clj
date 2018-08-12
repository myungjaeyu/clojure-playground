(ns cp.data-structure.hash-map)

(defn get-hash-map []
  {:a 1 :b 2 :c 3})

(defn get-hash-map-2 []
  (hash-map :a 1 :b 2 :c 3))

(defn get-assoc []
  (assoc (get-hash-map) :d 4))

(defn get-assoc-update []
  (assoc (get-hash-map) :c "updated"))

(defn get-dissoc []
  (dissoc (get-hash-map) :c 3))

(defn get-assoc-in []
  (assoc-in {:a {:name "u4bi" :level 17}} [:a :level] 100))

(defn get-update-in []
  (update-in {:a {:name "u4bi" :level 17}} [:a :level] inc))

(defn get-dissoc-in []
  (update-in {:a {:name "u4bi" :level 17}} [:a] dissoc :name))