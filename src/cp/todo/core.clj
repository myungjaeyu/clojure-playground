(ns cp.todo.core)

(def p-key-count (atom 0))
(def todos (atom {}))

(defrecord Todo [title success])

(defn create-todo [title]
  (let [todo (->Todo title false)]
    (dosync
      (swap! p-key-count inc)
      (swap! todos assoc @p-key-count todo))))

(defn toggle-todo [id]
  (swap! todos update-in [id :success] not))

(defn remove-todo [id]
  (swap! todos dissoc id))

(defn remove-all-todos []
  (dosync
    (reset! p-key-count 0)
    (reset! todos {})))