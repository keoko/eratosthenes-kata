(ns eratosthenes-kata.core-test
  (:use midje.sweet)
  (:use [eratosthenes-kata.core]))

(facts "about sieve"
  (fact "base case: 2"
    (sieve 2) => [2]))
