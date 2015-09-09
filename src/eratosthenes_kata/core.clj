(ns eratosthenes-kata.core)


(defn composite-of? [x y]
  (== 0 (mod x y)))

(defn remove-composites-of [x ns]
  (remove #(composite-of? % x) ns))

(defn sieve' [[primes xs]]
  (cons 
   (conj primes (first xs)) 
   [(remove-composites-of (first xs) xs)]))

(defn sieve [x]
  (let [xs (range 2 (inc x))]
    (loop [n [[] xs]] 
      (let [[primes xs'] (sieve' n)] 
        (if (empty? xs') 
          primes 
          (recur [primes xs'])))))) 
