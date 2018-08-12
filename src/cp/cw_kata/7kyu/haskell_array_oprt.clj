(ns cp.cw-kata.7kyu.haskell_array_oprt)

; haskell 기반 느낌의 head tail, init, last_ 오퍼레이터 구현

; GHCi, version 7.6.3: http://www.haskell.org/ghc/
; λ head [1,2,3,4,5]
; 1
; λ tail [1,2,3,4,5]
; [2,3,4,5]
; λ init [1,2,3,4,5]
; [1,2,3,4]
; λ last [1,2,3,4,5]
; 5

(defn head [x]
           (first x))

(defn tail [x]
           (rest x))

(defn init [x]
           (drop-last x))

(defn last_ [x]
            (last x))
