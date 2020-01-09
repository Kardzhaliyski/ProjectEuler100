package com.company;

public class Problem4_LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int num1 = 999; num1 >= 100 ; num1--) {
            for (int num2 = 999; num2 >= 100; num2--) {
                int currNum = num1 * num2;
                if((currNum / 100000) == currNum % 10) {
                    if((currNum % 100000) / 10000 == (currNum % 100) / 10) {
                        if((currNum % 10000) / 1000 == (currNum % 1000) / 100) {
                            if(currNum > largestPalindrome) {
                                largestPalindrome = currNum;
                            }
                            break;
                        }
                    }
                }
            }

        }

        System.out.println(largestPalindrome);
    }
}
