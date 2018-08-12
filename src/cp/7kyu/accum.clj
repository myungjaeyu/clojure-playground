(ns cp.7kyu.accum)

; (accum "abcd")    ; "A-Bb-Ccc-Dddd"

; (accum "RqaEzty") ; "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"

; (accum "cwAt")    ; "C-Ww-Aaa-Tttt"

; https://clojuredocs.org/clojure.core/map-indexed

; https://clojuredocs.org/clojure.string/capitalize

(defn accum [s]
  (->> s
      (map-indexed #(repeat 
                           (inc %1)
                           %2))
      (map #(apply str %))
      (map clojure.string/capitalize)
      (clojure.string/join "-")))