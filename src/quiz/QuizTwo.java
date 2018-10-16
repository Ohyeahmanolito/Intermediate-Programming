/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Arrays;

/**
 *
 * @author ITRO
 */
public class QuizTwo {

    public static int wrongFibonacci(int start) {
        int a = 2, b = 1, c;
        if (start == 0) {
            return a;
        }
        for (int i = 2; i <= start; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void numberOne() {
        int fibo = wrongFibonacci(3);
        System.out.println(fibo);
    }

    public static void numberTwo() {
        int[] arr = {1, 2, 3};
        //int fibo = wrongFibonacci(arr);
    }

    public static int add(int array[], int size, int index) {
        if (index < size) {
            return array[index] + add(array, size - 1, index + 1);
        } else {
            return 0;
        }
    }

    public static void numberTwoo() {
        int[] arr = {1, 4, 3, 0, 1, 6, 9};
        int sum = add(arr, arr.length, 1);
        System.out.println("sum: " + sum);
    }

    public static void numberOnee() {
        int sum = 0;
        int counter = ++sum;

        if (sum == 0) {
            counter++;
        }
        sum++;

        if (sum == 2) {
            counter++;
        }

        ++sum;

        for (int anotherCounter = 0; anotherCounter < 3; anotherCounter++) {
            sum = counter * anotherCounter;
        }
        counter *= 3;

        System.out.println("sum: " + sum);
        System.out.println("counter " + counter);
    }

    public static int wrngEvnCtr(int arr[], int sIdx, int eIdx) {
        if (sIdx == eIdx) {
            if (arr[sIdx] % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (arr[sIdx] % 2 == 0) {
            return wrngEvnCtr(arr, sIdx + 2, eIdx);
        } else {
            return 1 + wrngEvnCtr(arr, sIdx + 1, eIdx);
        }
    }

    public static void numberFive() {
        int[] numberList = {2, 3, 4, 5, 6, 2, 3, 4};
        int output = wrngEvnCtr(numberList, 1, numberList.length - 1);
        System.out.println(output);
    }

    public static void main(String[] args) {
        numberFive();
    }
}
