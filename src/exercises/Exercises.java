/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Arrays;

/**
 *
 * @author Exercises: 9-27 - 2018
 */
public class Exercises {

    public static int[] revArr(int[] arr) {

        int[] new_arr = new int[arr.length];
        int anotherCounter = 0;

        for (int counter = arr.length - 1; counter >= 0; counter--) {
            new_arr[anotherCounter] = arr[counter];
            anotherCounter++;
        }

        return new_arr;
    }

    private static boolean contains(int[] a, int x) {
        for (int counter : a) {
            if (counter == x) {
                return true;
            }
        }
        return false;
    }

    private static int arrayEleven(int[] nums, int index) {
        {
            if (index >= nums.length) {
                return 0;
            }
            if (nums[index] == 11) {
                return 1 + arrayEleven(nums, index + 1);
            } else {
                return arrayEleven(nums, index + 1);
            }
        }
    }

    public static boolean contains(int[] array, int index, int check) {
        if (index < array.length) {
            if (array[index] == check) {
                return true;
            } else {
                return contains(array, index + 1, check);
            }
        }
        return false;
    }
    
        public static int countHi(String input) {
        if (input.length() < 2) {
            return 0;
        }
        if (input.substring(0, 2).equals("hi")) {
            return 1 + countHi(input.substring(2));
        }
        return countHi(input.substring(1));
    }

    public static int maxVal(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int maxVal(int[] arr, int index, int max) {
        int largest = max;
        while (index < arr.length - 1) {

            if (index == 0) {
                largest = arr[0];
            }
            if (largest < arr[index + 1]) {
                largest = arr[index + 1];
            }
            maxVal(arr, index + 1, largest);
        }
        return largest;
    }

    public static boolean charPalindrome(char[] arr, int startIndex) {
        if (startIndex < arr.length) {
            if (arr[startIndex] == arr[arr.length - 1 - startIndex]) {
                return charPalindrome(arr, startIndex + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean stringPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return stringPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static int fact(int n) {

        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);

    }

    public static void method1(int counter, int arr[]) {
        if (counter <= arr.length - 2) {
            int temp = 0;
            temp = arr[counter];
            arr[counter] = arr[counter + 1];
            arr[counter + 1] = temp;

            method1(counter + 2, arr);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        method1(0, arr);
        System.out.println("end");

        System.out.println(Arrays.toString(arr));
    }

}
