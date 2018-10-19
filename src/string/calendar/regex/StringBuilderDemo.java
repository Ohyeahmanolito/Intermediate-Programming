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
public class StringBuilderDemo {

    public static void main(String[] args) {

        String userInput = "Java";
        StringBuffer sbuff = new StringBuffer(userInput);
        //StringBuilder sbuild = new StringBuilder(userInput);

        sbuff.insert(3, "123");
        sbuff.reverse();
        sbuff.append("D");
        System.out.println("output: " + sbuff);

    }
}
