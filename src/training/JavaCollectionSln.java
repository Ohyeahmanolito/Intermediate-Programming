/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ITRO
 */
public class JavaCollectionSln {

    /**
     * TO-DO code here the logic that sorts an array starting from index 2.
     *
     * @param arr the list of integer that will be sorted.
     *
     */
    public void sortArray(int[] arr) {
        Arrays.sort(arr, 1, arr.length);
        System.out.println("sorted: " + Arrays.toString(arr));
    }

    /**
     * TO-DO code here the logic that checks if the specified element exists in
     * the given array or not.
     *
     * @param list the list of string from user.
     * @param find the element that will be search from the list
     *
     */
    public void javaCollectionExerOne(String[] list, String find) {

        List<String> arrList = new ArrayList<>();

        for (String perLine : list) {
            for (String perWord : perLine.split(" ")) {
                arrList.add(perWord);
            }
        }
        if (arrList.contains(find)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

    /**
     * TO-DO code here the logic that displays all the unique words in the list.
     *
     * @param list the list of string from user.
     */
    public void javaCollectionExerTwo(String[] list) {
        Set<String> hSet = new HashSet<>();

        for (String perLine : list) {
            for (String perWord : perLine.split(" ")) {
                hSet.add(perWord);
            }
        }

        for (String word : hSet) {
            System.out.println(word);
        }

    }

    /**
     * TO-DO code here the logic that displays all the unique words in the list
     * and its corresponding frequency.
     *
     * @param list the list of string from user.
     */
    public void javaCollectionExerThree(String[] list) {
        Map<String, Integer> hMap = new HashMap<>();

        for (String perLine : list) {
            for (String perWord : perLine.split(" ")) {
                if (hMap.containsKey(perWord)) {
                    hMap.put(perWord, hMap.get(perWord) + 1);
                } else {
                    hMap.put(perWord, 1);
                }
            }
        }

        for (String key : hMap.keySet()) {
            System.out.println(key + " - " + hMap.get(key));
        }
    }

    /**
     * TO-DO code here the logic that displays all the unique words and its
     * corresponding frequency from unique sentences inside a text file. Ignore
     * the case.
     *
     * The first line of the input gives the number of test cases, T. Each T
     * contains a line, A, that defines the number sentences. The next A lines
     * are the sentences of each T.
     *
     * @param filePathOne Path of the file that will be read.
     *
     */
    public void javaCollectionExerFive(String filePath) {
    }

    /**
     * TO-DO check the TO-DO.pdf for the task.
     */
    public void javaCollectionExerFour() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /* Save numbers in 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        ArrayList<String> answers = new ArrayList<>();
        /* Answer the queries */
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x - 1);
            if (y <= list.size()) {
                answers.add(String.valueOf(list.get(y - 1)));
            } else {
                answers.add("ERROR!");
            }
        }

        for (String sol : answers) {
            System.out.println(sol);
        }

    }

    public static void main(String[] args) {

        JavaCollectionSln training = new JavaCollectionSln();
        /*int[] numList = {4, 2, 1, 5, 3, 2};
        training.sortArray(numList);

        String[] list = {"the dog barks", "the cat love to eat"};
        training.javaCollectionExerOne(list, "dog");
        training.javaCollectionExerTwo(list);
        training.javaCollectionExerThree(list);
         */
        training.javaCollectionExerFour();
    }
}
