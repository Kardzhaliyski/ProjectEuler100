package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7_nthPrime {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        var maxNum = 120000;

        primes.add(2);
        for (int i = 3; i <= maxNum; i += 2) {
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

            if (currNum > 5000) { //Added to reduce the time running
                break;
            }
        }

        System.out.println(primes.get(10000));
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
