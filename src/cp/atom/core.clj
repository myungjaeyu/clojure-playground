(ns cp.atom.core)

(def atom-val (atom 0))

(defn get-val [] @atom-val)

(defn add-val []
  (swap! atom-val inc))

(defn fn-val []
  (swap! atom-val (fn [n] n)))

(defn reset-val []
  (reset! atom-val 0))

(def user
  (atom {:name "u4bi"
         :info {:level 17 }}))

(defn get-user [] @user)

(defn set-user-level [level]
  (swap! user assoc-in [:info :level] 11))

(defn reset-user []
  (reset! user {:name "u4bi"
                :info {:level 0 }}))