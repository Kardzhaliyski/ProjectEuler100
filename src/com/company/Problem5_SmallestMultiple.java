package com.company;

public class Problem5_SmallestMultiple {
    public static void main(String[] args) {
        var currentNum = 20;
        while (true) {
            for (int i = 2; i <= 20; i++) {
                if (currentNum % i != 0) {
                    break;
                }

                if (i == 20) {
                    System.out.println(currentNum);
                    return;
                }
            }

            currentNum += 20;
        }
    }
}
