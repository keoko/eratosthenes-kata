(ns eratosthenes-kata.core-test
  (:use midje.sweet)
  (:use [eratosthenes-kata.core]))

(facts "about sieve"
  (fact "base case: 2"
    (sieve 2) => [2])
  (fact "sieve of 3"
    (sieve 3) => [2 3]))
