package com.company;

public class Problem9_SpecialPythagoreanTriplet {
    public static void main(String[] args) {

        for (int c = 993; c > 2 ; c--) {
            for (int b = 2; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if(a + b + c == 1000) {
                        if((a * a) + (b * b) == c * c){
                            System.out.println(a * b * c);
                        }
                    }
                }

            }
        }

    }
}
