(ns eratosthenes-kata.core-test
  (:use midje.sweet)
  (:use [eratosthenes-kata.core]))

(facts "about sieve"
  (fact "sieve of 2 (base case)"
    (sieve 2) => [2])
  (fact "sieve of 3"
    (sieve 3) => [2 3])
  (fact "sieve of 5 - remove compositeof 2"
    (sieve 5) => [2 3 5]))
