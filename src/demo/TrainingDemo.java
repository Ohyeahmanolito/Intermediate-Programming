/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ITRO
 */
public class TrainingDemo {

    public static void main(String[] args) {
        TrainingDemo demo = new TrainingDemo();

        demo.fileReading();
    }

    public void fileReading() {
        File file = null;
        BufferedReader br = null;
        try {
            String temp = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\assignment\\Test.txt";
            file = new File(temp);
            br = new BufferedReader(new FileReader(file));
            String text = "";
            while ((text += br.readLine()) != null) {
                System.out.println(text);
            }

        } catch (Exception e) {
            System.out.println("irrur");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void betterPractice() {
        String filePath = "C:\\Users\\ITRO\\Documents\\NetBeansProjects\\Intermediate-Programming\\src\\assignment\\Test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
