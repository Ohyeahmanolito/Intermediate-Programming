/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author mvoctavianojr
 */
public class QuizOneSetA {

    public static void main(String[] args) {
        numberSeven();

    }

    public static void numberOne() {
        int numberOne = 10;
        int numberTwo = 5;
        int temporary = 3;

        temporary = ++numberOne - numberTwo / 5;
        numberOne = numberTwo + 2 * 3;
        numberTwo = ++temporary + numberOne--;

        System.out.println("temporary: " + temporary);
        System.out.println("numberOne: " + numberOne);
        System.out.println("numberTwo: " + numberTwo);
    }

    public static void numberTwo() {
        int number = 4;
        int anotherNumber = 0;
        do {
            anotherNumber = anotherNumber + 1;
            //number = number + 1;
            number = anotherNumber % number;
        } while (number != 6);

        System.out.println("number: " + number);
    }

    public static void numberThree() {
        int[] arrayOne = {1, 2, 1, 0};
        int[] arrayTwo = {3, 1, 0, 1};
        int count = 1;
        int sum = 0;

        for (;;) {
            count++;
            sum = arrayOne[count] + arrayTwo[count - 1];
            if (count % 2 == 1) {
                count = --count;
                break;
            }
        }

        System.out.println("count: " + count);
        System.out.println("sum: " + sum);
    }

    public static void numberFour() {

        double[][] arrValue = {{1.0, 4.0},
        {2.0, 5.0},
        {3.0, 7.0}};

        double number1 = arrValue[2][arrValue[0].length - 1];

        double number2 = arrValue[arrValue.length - 2][1]++;

        double number3 = ++arrValue[0][0];

        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
    }

    public static void numberFive() {
        int counter = 4;
        while (true) {
            while (!false) {
                if (counter == 7) {
                    break;
                }
                counter++;
            }
            if (counter == 4) {
                break;
            }
            counter = 4;
            System.out.println("infinite?");
        }

        System.out.println("counter: " + counter);
    }

    public static void numberSix() {
        int coffee = 1;
        for (int counter = 1; counter < 4; counter++) {
            while (true) {
                coffee /= counter;
                break;
            }
        }
        System.out.println(coffee);
    }

    public static void numberSeven() {
        int sum = 1;
        for (int counter = 1; counter < 4; counter++) {
            sum++;
        }
        sum *= 2;

        System.out.println(sum);
    }
}
