package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Problem14_LongestCollatzSequence {
    public static void main(String[] args) {
        Function<Long, Long> calculateNextCollatzNumber = n -> n % 2 == 0 ?
                n / 2 :
                3 * n + 1;
        int numberCap = 1_000_000;
        int maxSequenceCount = 1;
        int maxSequenceCountNumber = -1;
        Map<Integer, Integer> numbersSequenceCountPairs = new HashMap<>();
        for (int i = 1; i < numberCap; i++) {
            var currSequenceCount = 1;
            Long currNum = 1L * i;
            while (currNum != 1 && !numbersSequenceCountPairs.containsKey(currNum)) {
                currNum = calculateNextCollatzNumber.apply(currNum);
                currSequenceCount++;
//                if(i > 113382) {
//                    System.out.println(currNum);
//                }
            }

            if (currNum != 1) {
                currSequenceCount += numbersSequenceCountPairs.get(currNum) - 1;
            }

            numbersSequenceCountPairs.put(i, currSequenceCount);


            if (currSequenceCount > maxSequenceCount) {
                maxSequenceCount = currSequenceCount;
                maxSequenceCountNumber = i;
            }

        }

        System.out.println(maxSequenceCountNumber + " - " + maxSequenceCount);

    }
}
