(ns cw-kata.7kyu.reverser)

; 반환하는 문장값을 뒤집어라

; https://clojuredocs.org/clojure.string/split

(defn reverser [s]
  (->> (clojure.string/split s #" ")
       (map clojure.string/reverse)
       (clojure.string/join #" ")))
