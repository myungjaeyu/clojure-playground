(ns cw-kata.8kyu.chromosome-check)

; 반환 값이 XY일 시 Congratulations! You're going to have a son.

; 반환 값이 XX일 시 Congratulations! You're going to have a daughter.

(defn chromosome-check [sperm]
  (if (= sperm "XY")
    "Congratulations! You're going to have a son."
    "Congratulations! You're going to have a daughter."))