(ns cp.cw-kata.7kyu.sum)

; 모든 arguments의 합을 반환

(defn sum [& args]
  (->> args
      (apply +)))