(ns cp.7kyu.vowel-indeices)

; 모음의 인덱스를 리스트에 반환

;  a e i o u y

; https://clojuredocs.org/clojure.core/keep-indexed

(def vowels #{\a \e \i \o \u \y})

(defn vowel-indeices [s]
  (->> s
       clojure.string/lower-case
       (keep-indexed #(when (vowels %2)
                    (inc %1)))
       vec))
