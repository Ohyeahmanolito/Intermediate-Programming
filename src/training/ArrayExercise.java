/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author ITRO
 */
public class ArrayExercise {

    public static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    public static void exerOne(int arr[][]) {
        System.out.println("BEFORE:");
        printArr(arr);
        System.out.println("");

        for (int row = 1; row < arr[0].length; row += 2) {
            for (int col = 0; col < arr[0].length; col++) {
                int up = arr[row - 1][col];
                arr[row - 1][col] = arr[row][col];
                arr[row][col] = up;
            }
        }
        System.out.println("AFTER: ");
        printArr(arr);
    }

    public static void exerTwo(int arr[][]) {
        System.out.println("BEFORE:");
        printArr(arr);
        System.out.println("");

        for (int row = 1; row < arr[0].length; row += 2) {
            for (int col = 1; col < arr[0].length; col += 2) {
                int upLeft = arr[row - 1][col - 1];
                int upRight = arr[row - 1][col];

                // upLeft and downRight
                arr[row - 1][col - 1] = arr[row][col];
                arr[row][col] = upLeft;

                // upRight and downLeft
                arr[row - 1][col] = arr[row][col - 1];
                arr[row][col - 1] = upRight;
            }
        }

        System.out.println("AFTER: ");
        printArr(arr);
    }

    public static void exerThree(int[][] arr) {
        System.out.println("BEFORE:");
        printArr(arr);
        System.out.println("");
        
        int row = arr.length;

        for (int counter = 0; counter < arr[0].length; counter++) {
            int temp = arr[0][counter];
            arr[0][counter] = arr[row - 1][counter];
            arr[row - 1][counter] = temp;
        }

        System.out.println("AFTER: ");
        printArr(arr);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
        {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };

        exerThree(arr);
    }
}
