package com.company;

public class Problem12_HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        int currNum = 0;
        var nextNumToAdd = 1;
        var maxCount = 0;
        while(true) {
            currNum += nextNumToAdd;
            var currDivisorsCount = findDivisorsCount(currNum);
            if(currDivisorsCount > maxCount) {
                maxCount = currDivisorsCount;
                System.out.println(maxCount + " - " + currNum);
            }

            if(currDivisorsCount > 500) {
                System.out.println(currNum);
                break;
            } else {
                nextNumToAdd++;
            }
        }
    }

    private static int findDivisorsCount(int currNum) {
        var count = 0;
        for (int i = 1; i <= currNum / 2; i++) {
            if(currNum % i == 0) count++;
        }

        count++;

        return count;
    }
}
