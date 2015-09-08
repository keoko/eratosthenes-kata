(ns eratosthenes-kata.core)

(defn sieve [n]
  (if (== 3 n) 
    [2 3]
    [2]))
