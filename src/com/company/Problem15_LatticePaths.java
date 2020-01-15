package com.company;

public class Problem15_LatticePaths {
    private static Long pathCount = 0L;

    public static void main(String[] args) {

        int gridSize = 7;
        int[][] matrix = new int[gridSize + 1][gridSize + 1];
        var pathCount = travel(matrix,0, 0);
        System.out.println(pathCount);

    }

    public static Long travel(int[][] matrix, int row, int col) {
            if(row < matrix.length - 1) {
                travel(matrix, row + 1, col);
            }

            if(col < matrix[0].length - 1){
                travel(matrix, row, col + 1);
            }
//        }

        if(row == matrix.length  -1 && col == matrix[row].length -1) pathCount++;

        return pathCount;
    }
}
