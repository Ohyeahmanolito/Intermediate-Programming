/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.calendar.regex;

/**
 *
 * @author ITRO
 */
public class RegExDemo {

    public static void main(String[] args) {

        String value = "cat.cat";
        //String pattern = "[aeioumM]"; // remove specific values
        //String pattern = "[a-f]"; // remove a-f only
        //String pattern = "[a-zA-Z]"; // remove all letters.
        //String pattern = "[0-9]"; //remove number.
        //String pattern = "\\."; // remove period
        String pattern = "."; // any one character

        String temp = value.replaceAll(pattern, "");
        System.out.println("temp: " + temp);

    }
}
