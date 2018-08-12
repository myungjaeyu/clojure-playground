(ns cp.cw-kata.7kyu.reverse-longer)

; 짧은 + reverse(긴) + 짧은 

; a와 b의 길이가 같다면 b + reverse(a) + b

(defn reverse-longer [a b]
  (let [a-len(count a)
        b-len(count b)]
        (if (< a-len b-len)
            (str a (clojure.string/reverse b) a)
            (str b (clojure.string/reverse a) b))))