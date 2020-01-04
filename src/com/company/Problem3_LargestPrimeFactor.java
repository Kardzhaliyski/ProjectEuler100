package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3_LargestPrimeFactor {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        var givenNum = 600851475143.0;
        var maxNum = (int) Math.sqrt(givenNum);
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

            if(currNum > 5000) { //Added to reduce the time running
                break;
            }
//            if (currPosition % 100 == 0)
//                System.out.println("Prime Counter: " + nums.size() + " Current Num: " + currNum + " Last Num: " + nums.get(nums.size() -1));
        }

        for (int i = primes.size() - 1; i >= 0; i--) {
            if (givenNum % primes.get(i) == 0) {
                System.out.println(primes.get(i));
                break;
            }
        }
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
