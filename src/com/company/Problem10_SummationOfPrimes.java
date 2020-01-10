package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem10_SummationOfPrimes {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        var maxNum = 2000000;
        primes.add(2);

        for (int i = 3; i < maxNum; i += 2) {
            primes.add(i);
        }

        var currPosition = 0;
        var currNum = primes.get(currPosition);

        while (currPosition < primes.size()) {
            primes = removeNotPrimeNumDividedBy(primes, currNum);
            currPosition++;

            if (currPosition < primes.size()) {
                currNum = primes.get(currPosition);
            }

            if(currNum > 5000) { //Added to reduce the time running
                break;
            }
        }

        Long primeSum = 0L;

        for (Integer prime : primes) {
            primeSum += prime;
        }

        System.out.println(primeSum);

    }

    private static List<Integer> removeNotPrimeNumDividedBy(List<Integer> list, int num) {
        return list
                .stream()
                .filter(n -> {
                    if (num == n) {
                        return true;
                    } else {
                        return n % num != 0;
                    }
                })
                .collect(Collectors.toList());
    }
}
