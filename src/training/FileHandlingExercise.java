/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class FileHandlingExercise {

    public static void main(String[] args) {

        exerThree();
    }

    // include discussion of the ff:
    // java method documentation
    // splitting
    // parsing
    public static void exerOne() {

        String filePath = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\training\\testFile";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                int numb1 = Integer.parseInt(split[0]);
                int numb2 = Integer.parseInt(split[1]);
                System.out.println("Total: " + (numb1 + numb2));
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // count all letter a e i o u
    public static void exerTwo() {
        String filePath = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\training\\testFileTwo";
        int counter;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            counter = 0;
            while ((line = reader.readLine()) != null) {
                counter += line.replaceAll("[^aeiou]", "").length();
            }
            System.out.println("counter: " + counter);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    /**
     * The first line of the input gives the number of test cases, T. Each test
     * cases has two lines. First line is list of integer value. Second line is
     * an integer value.
     *
     * Task: For each test cases, display TRUE if the sum of first line is equal
     * to the second.
     */
    public static void exerThree() {
        String filePath = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\training\\testFileTwo";
        int counter;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    /**
     * The first line of the input gives the number of test cases, T. Each test
     * cases T follows with two integers N and K. The next line is the number of
     * N character/s. And, K more lines of sentences follows.
     *
     * Task: For each test cases, display the sentences of each T wherein the N
     * character/s is removed from K sentences
     */
    public static void exerFour() {
        String filePath = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\training\\testFileTwo";
        int counter;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
