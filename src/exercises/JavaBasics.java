/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class JavaBasics {

    // if statement review code
    public static void review1() {

        int counter = 0;
        if (counter < 4) {
            System.out.println("less than 4");
        } else if (counter == 4) {
            System.out.println("equal to 4");
        } else {
            System.out.println("greater than 4");
        }
    }

    //shortcut notation
    public static void review2() {
        int x = (4 < 5) ? 6 : 7;
        System.out.println(x);
    }

    //switch review
    public static void review3() {

        char letter = 'a';
        int counter = 0;
        int anotherCounter = 0;
        switch (letter) {

            case 'a':
                counter++;
                anotherCounter = --counter;
                System.out.println(anotherCounter);
            case 'b':
                counter++;
                anotherCounter = --counter;
                anotherCounter++;
                System.out.println(anotherCounter);
                break;
            default:
                System.out.println(anotherCounter);
        }
    }

    // review in while loop
    public static void review4() {
        int counter = 0;

        while (counter < 5) {
            counter++;
            System.out.println(counter);
            break;
        }
    }

    //String review
    public static void review5() {
        String yourName = "Manolito";
        String anotherName = "Java";

        System.out.println(yourName.charAt(anotherName.length() - 1));

    }

    public static void review6() {
        Scanner input = new Scanner(System.in);
        System.out.println("get user input: ");
        String temp = input.nextLine();
        System.out.println("the input is: " + temp);

    }

    //enhance loop
    public static void review7() {
        int[] preDefinedValue = {1, 2, 3, 4, 5};
        System.out.println("> " + Arrays.toString(preDefinedValue));
        for (int x : preDefinedValue) {
            System.out.println(x);
            int temp = x + 2;
            System.out.println("here: " + temp);

        }
    }

    public static void review8(int temp) {

        if (temp == 100) {
        } else {
            System.out.println(temp);
            review8(temp + 1);
        }

    }

    //review on 2-d array.
    public static void review9() {
        int[][] myArray = {
            {0, 1, 2, 3},
            {3, 2, 1, 0},
            {3, 5, 6, 1}
        };
        for (int counter = 0; counter < myArray[1].length; counter++) {
            System.out.println(myArray[1][counter]);
        }
    }

    public static String method1() {
        int numb1 = 4;
        int numb2 = 5;

        if (numb1 < numb2) {

            System.out.println("HELLO");
        } else if (numb1 == numb2) {
            return "HI";
        }
        return "NONE";
    }

    public static double method(int x, int numb2, String name) {
        int sum = x + numb2;
        System.out.println(name + " the sum is: " + sum);
        return sum;
    }

    public static void bark() {
        System.out.println("aw aw");
        meow();
        System.out.println("aw aw");
    }

    public static void meow() {
        System.out.println("meow meow");
    }

    public static void main(String[] args) {
        System.out.println("main");
        bark();
        System.out.println("main again");
    }
}
