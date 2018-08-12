(ns cw-kata.7kyu.average)

; 배열에 담긴 값들의 평균 값을 반환

(defn average [data]
  (if (empty? data)
      0
      (int (/ 
             (reduce + data)
             (count data)))))

; (defn average [data]
;   (if (empty? data)
;       0
;       (int (/ 
;              (apply + data)
;              (count data)))))
