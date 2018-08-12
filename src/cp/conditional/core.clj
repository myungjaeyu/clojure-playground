(ns cp.conditional.core)

(defn get-if []
  (if (= 1 1) "true!" "false!"))

(defn get-when []
  (when (= 1 1) "true!"))

(defn get-cond []
  (let [n 3]
    (cond
      (= n 1) "A"
      (= n 2) "B"
      (= n 3) "C"
      (= n 4) "D"
      :else "F")))

(defn get-case []
  (let [n 3]
    (case n
      1 "A"
      2 "B"
      3 "C"
      4 "D"
      "F")))

(defn get-if-let []
  (let [m {:name "u4bi"}]
    (if-let [v (:name m)]
            v
            "not value")))

(defn get-when-let []
  (let [m {:name "u4bi"}]
    (when-let [v (:name m)]
              v)))