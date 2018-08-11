(ns cw-kata.8kyu.star-sort)

; 문자열이 들어간 벡터를 알파벳 순으로 정렬한 후 첫번째 값을 반환 받고 반환 값의 사이에 ***가 존재

(defn star-sort [arr]
  (->> (sort arr)
       (first)
       (clojure.string/join "***")))
