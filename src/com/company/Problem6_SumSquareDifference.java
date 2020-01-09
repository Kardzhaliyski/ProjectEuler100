package com.company;

public class Problem6_SumSquareDifference {
    public static void main(String[] args) {

        var sumOfTheSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfTheSquares += i * i;
        }

        var squareOfTheSum = 0;
        squareOfTheSum = ((1 + 100) * 50) * ((1 + 100) * 50) ;

        System.out.println(squareOfTheSum - sumOfTheSquares);

    }
}
