(ns eratosthenes-kata.core
  (:require [clojure.core.match :refer [match]]))

(defn- composite-of? [x y]
  (== 0 (mod x y)))

(defn- remove-composites-of [x xs]
  (remove #(composite-of? % x) xs))

(defn sieve' [xs]
  (match [(vec xs)]
         [([] :seq)] []
         [([x & xs'] :seq)] (cons x 
                                  (sieve' (remove-composites-of x xs')))))

(defn sieve [x]
  (let [xs (range 2 (inc x))]
    (sieve' xs))) 
