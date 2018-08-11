(ns cw-kata.7kyu.predict-age)

; 증조부가 죽을 때마다 연령대를 기록하여 반환

; 각 번호를 곱

; 모두 한 배열 내에 추가

; 반환값의 재곱근

; 2로 나눕니다.

; 정수

(defn predict-age [& ages]
  (->> ages
    (map #(Math/pow % 2))
    (apply +)
    (Math/sqrt)
    (#(/ % 2))
    int))