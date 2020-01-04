package com.company;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Problem2_EvenFibonacciNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> fibNums = getFibNumsTo(4000000);
        System.out.println(fibNums.stream().mapToInt(n -> n).filter(n -> n % 2 == 0).sum());
    }

    private static ArrayList<Integer> getFibNumsTo(int maxNum) {
        ArrayList<Integer> fibNums = new ArrayList<>();
        fibNums.add(1);
        fibNums.add(1);
        for (int i = 2, currNum = 0; currNum < maxNum; i++) {
            currNum = fibNums.get(i - 1) + fibNums.get(i - 2);
            if(currNum >= maxNum) break;
            fibNums.add(currNum);
        }


        return fibNums;
    }
}
