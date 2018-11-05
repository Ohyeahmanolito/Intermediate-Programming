/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.calendar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mvoctavianojr
 */
public class RegExDemoAdvanced {

    public static void main(String[] args) {
        matcherClassDemoThree();
    }

    public static void metaCharDemo() {
        String pattern = "";
        //pattern = "\\d"; // short for [0-9]
        //pattern = "\\w"; // short for [a-zA-Z_0-9]
        pattern = "\\b"; // word boundary where a word character is [a-zA-Z0-9_]
        String value = "Mano  lito.Occcctavia  no12oo3.jr";
        String temp = value.replaceAll(pattern, "-");
        System.out.println("temp: " + temp);
    }

    public static void quantifierDemo() {

        String pattern = "";
        //pattern = "oo*";
        //pattern = "oo";
        //pattern = "c{2}";
        pattern = "li?to";
        String value = "Mano  lito.Occcctavia  no12oo3.jr";
        String temp = value.replaceFirst(pattern, "-");
        //String temp = value.replaceAll(pattern, "-");
        System.out.println("temp: " + temp);
    }

    public static void groupDemo() {
        String pattern = "(M.*no.* l)(ito\\.)(.*)";
        String value = "Mano  lito.Occcctavia  no12oo3.jr";
        String temp = value.replaceFirst(pattern, "$1 XXX $3");
        System.out.println(temp);
    }

    public static void matcherClass() {
        String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";
        Pattern pattern = Pattern.compile("\\w+");

        Matcher matcher = pattern.matcher(EXAMPLE_TEST);

        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));
    }

    public static void matcherClassDemoTwo() {
        String value = "HexxxxHexxxHe";
        Pattern pattern = Pattern.compile("He");
        Matcher matcher = pattern.matcher(value);

        int count = 0;
        int index = 0;
        while (matcher.find()) {
            count++;
            System.out.println("start index: " + matcher.start());
            System.out.println("end index: " + matcher.end());
        }

        System.out.println(count);
    }

    public static void matcherClassDemoThree() {
        String value = "HexxxxHexxxHe";
        Pattern pattern = Pattern.compile("xx");
        Matcher matcher = pattern.matcher(value);

        int count = 0;
        int index = 0;
        while (matcher.find(index)) {
            count++;
            System.out.println("start index: " + matcher.start());
            System.out.println("end index: " + matcher.end());
            index = matcher.start() + 1;
        }

        System.out.println(count);
    }

}
