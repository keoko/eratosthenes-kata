(ns eratosthenes-kata.core-test
  (:use midje.sweet)
  (:use [eratosthenes-kata.core]))

(facts "about sieve"
  (fact "sieve of 2 (base case)"
    (sieve 2) => [2])
  (fact "sieve of 3"
    (sieve 3) => [2 3])
  (fact "sieve of 5 - remove composite of 2"
    (sieve 5) => [2 3 5])
  (fact "sieve of 11 - remove composite of 2 and 3"
    (sieve 11) => [2 3 5 7 11]))
