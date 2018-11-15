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
public class RegExDemoBasic {

    public static void main(String[] args) {

        String value = "ManoManolito o425c. taviano1234Mano";
        //String pattern = "[aeiouAEIOU]"; // remove specific values

        //String pattern = "[a-z]"; // remove a-f only
        //String pattern = "[aeiou]"; // remove all letters.
        //String pattern = "[a-fp-z]"; //remove number.
        //String pattern = "[.a-z]"; // remove period
        //String pattern = "."; // any one character
        //String pattern = "Mano$";
        //System.out.println(value.replaceAll(pattern, "-"));
        String pattern = "o";
        String[] temp = value.split(pattern);
        for (String x : temp) {
            System.out.println(x);

        }
    }
}
