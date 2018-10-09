/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class DemoClass {

    public static void main(String[] args) {
//        //For method1()
//        int x = 4;
//        int y = 0;
//        System.out.println("main x: " + x + " y: " + y);
//        method1(x, y);
//        System.out.println("main x: " + x + " y: " + y);

//         For getUserInput()
//        String[] x = getUserInput();
//        System.out.println("display");
//
//        for (String name : x) {
//            System.out.println(name);
//        }
//          For add()
//        int addition = add(4, 4);
//        System.out.println("sum is: " + addition);
//          For multipRet
//        int temp = multipRet(4);
//        System.out.println("temp: " + temp);
//        String[] temp = {"mano", "lito"};
//        swapVal(temp);
//        System.out.println("Inside values of array");
//        for (String x : temp) {
//            System.out.println(x);
//        }
    }

    public static void method1(int x, int y) {
        int temp = y;
        y = x;
        x = temp;
        System.out.println("inside method x: " + x + " y: " + y);
    }

    public static String[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for (int counter = 0; counter < names.length; counter++) {
            System.out.println("Enter username:");
            String temp = sc.nextLine();
            names[counter] = temp;
        }
        return names;
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int multipRet(int number) {

        if (number < 4) {
            return 1;
        } else if (number == 5) {
            return 2;
        }
        return 0;
    }

    public static void swapVal(String[] arr) {
        arr[0] = "HAHA";
    }
}
