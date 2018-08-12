(ns cp.cw-kata.7kyu.last-val)

; 주어진 값의 마지막 인수를 반환

; (defn last-val [lst]
;   (first (reverse lst)))

; (defn last-val [lst]
;   (->> lst
;        reverse
;        first))

(defn last-val [lst]
  (last lst))