/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.calendar.regex;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ITRO
 */
public class CalendarClassDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR));  // get value of HOUR field 
//        System.out.println(c.get(Calendar.SECOND)); // get value of SECOND field 
//        System.out.println(c.get(Calendar.AM_PM)); // get value of AM_PM field 
//        System.out.println(c.get(Calendar.YEAR)); // get value of YEAR field 
//        System.out.println("time: " + c.getTime());

    }

    /**
     * Write a Java program to get a date before and after 1 year compares to
     * the current date.
     */
    public static void method1() {
        Calendar cal = Calendar.getInstance();
        //Date cdate = cal.getTime();
        // get next year
        cal.add(Calendar.YEAR, 1);
        Date nyear = cal.getTime();

        //get previous year
        cal.add(Calendar.YEAR, -2);
        Date pyear = cal.getTime();

        //System.out.println("\nCurrent Date : " + cdate);
        System.out.println("\nDate before 1 year : " + pyear);
        System.out.println("\nDate after 1 year  : " + nyear + "\n");
    }

    /**
     * Write a Java program to get a date after 2 weeks.
     */
    public static void method2() {

        //two weeks
        int noOfDays = 14;
        Calendar cal = Calendar.getInstance();
        //Date cdate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = cal.getTime();
        //System.out.println("\nCurrent Date: " + cdate + "\n");
        System.out.println("Day after two weeks: " + date + "\n");
    }

    /**
     * Write a Java program to get year and months between two dates.
     */
    public static void method3() {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between " + userday + " and " + today + ": "
                + diff.getYears() + " Year(s) and " + diff.getMonths() + " Month()s\n");

    }
}
