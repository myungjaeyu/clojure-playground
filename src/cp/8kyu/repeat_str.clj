(ns cp.8kyu.repeat-str)

; 문자열을 주어진 수 만큼 반복하여 반환

(defn repeat-str [n s]
  (->> (repeat n s)
       (apply str)))