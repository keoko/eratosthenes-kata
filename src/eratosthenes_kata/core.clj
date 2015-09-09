(ns eratosthenes-kata.core)


(defn- composite-of? [x y]
  (== 0 (mod x y)))

(defn- remove-composites-of [x xs]
  (remove #(composite-of? % x) xs))

(defmulti sieve' identity)

(defmethod sieve' [] [_] [])
(defmethod sieve' :default [[x & xs]]
  (cons x (sieve' (remove-composites-of x xs))))

(defn sieve [x]
  (let [xs (range 2 (inc x))]
    (sieve' xs))) 
