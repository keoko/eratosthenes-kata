(ns eratosthenes-kata.core)


(defn composite-of? [x y]
  (== 0 (mod x y)))

(defn sieve [n]
 (let [ns (range 2 (inc n))
       n' (first ns)]
   (cons n' (remove #(composite-of? % n') ns)))) 
