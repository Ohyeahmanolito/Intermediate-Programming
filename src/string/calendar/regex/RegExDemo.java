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

        String value = "Manolito.o425ctaviano.Jr.13";
        //String pattern = "[aeiouAEIOU]"; // remove specific values

        //String pattern = "[a-z]"; // remove a-f only
        //String pattern = "[aeiou]"; // remove all letters.
        //String pattern = "[a-fp-z]"; //remove number.
        String pattern = "[.a-z]"; // remove period
        //String pattern = "."; // any one character

        String temp = value.replaceAll(pattern, "-");
        System.out.println("temp: " + temp);
        

    }
}
