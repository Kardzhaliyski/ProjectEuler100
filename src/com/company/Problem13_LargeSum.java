package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem13_LargeSum {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
            List<int[]> numbers = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                numbers.add(bfr.readLine().chars().map(Character::getNumericValue).toArray());
            }

            var sum = new ArrayList<Integer>();
            var aNumberLength = 50;

            int remainingFromLastCol = 0;
            for (int col = aNumberLength - 1; col >= 0; col--) {
                int currSum = remainingFromLastCol;
                for (int row = 0; row < numbers.size(); row++) {
                    currSum += numbers.get(row)[col];
                }

                sum.add(currSum % 10);
                remainingFromLastCol = currSum / 10;
            }

            while (remainingFromLastCol != 0) {
                sum.add(remainingFromLastCol % 10);
                remainingFromLastCol /= 10;
            }

            for (int i = sum.size() - 1; i >= 0; i--) {
                System.out.print(sum.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        var num1 = "37107287533902102798797998220837590246510135740250".chars().map(Character::getNumericValue).toArray();
    }
}
