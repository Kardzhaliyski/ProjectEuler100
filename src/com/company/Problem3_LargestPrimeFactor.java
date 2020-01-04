package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem3_LargestPrimeFactor {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        var givenNum = 600851475143.0;
        var maxNum = (int) Math.sqrt(givenNum);
        for (int i = 3; i <= maxNum; i += 2) {
            nums.add(i);
        }

        var currPosition = 0;
        var currNum = nums.get(currPosition);
        while (currPosition < nums.size()) {
            nums = test(nums, currNum);
            currPosition++;

            if (currPosition < nums.size()) {
                currNum = nums.get(currPosition);
            }

//            if (currPosition % 100 == 0)
//                System.out.println("Prime Counter: " + nums.size() + " Current Num: " + currNum + " Last Num: " + nums.get(nums.size() -1));
        }

        System.out.println("Primes found.");
        System.out.println("Loading prime factors ...");

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (givenNum % nums.get(i) == 0) {
                System.out.println(nums.get(i));
            }
        }

        System.out.println();

    }

    private static List<Integer> test(List<Integer> list, int num) {
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
