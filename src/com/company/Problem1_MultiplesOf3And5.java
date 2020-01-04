package com.company;

public class Problem1_MultiplesOf3And5 {
    public static void main(String[] args) {

        var number = 1000;
        var countOf3 = (number - 1) / 3;
        var countOf5 = (number - 1) / 5;
        var countOf15 = (number - 1) / 15;
        var sumOfNumDivBy3 = sumOfANum(3, countOf3);
        var sumOfNumDivBy5 = sumOfANum(5, countOf5);
        var sumOfNumDivBy15 = sumOfANum(15, countOf15);
        System.out.println(sumOfNumDivBy3 + sumOfNumDivBy5 - sumOfNumDivBy15);

    }

    private static int sumOfANum(int num, int count) {
        if(count % 2 == 0) {
            return  (num * count + num) * (count / 2);
        }
        else {
            return  (num * (count - 1) + num) * (count / 2) + (count * num);
        }
    }
}
