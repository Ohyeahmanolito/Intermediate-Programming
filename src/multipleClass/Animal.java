/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleClass;

/**
 *
 * @author ITRO
 */
public class Animal {

    public static void main(String[] args) {
        // method WITHOUT 'static'
        Animal littleAnimal = new Animal();
        littleAnimal.method2();

        // method WITH 'static'
        method1();
        Animal.method1();

        Plant littlePlant = new Plant();
        littlePlant.helloPlant();
    }

    public static void method1() {
        System.out.println("method 1 here.");
    }

    public void method2() {
        System.out.println("method 2 here.");
    }

    public void method3() {
        System.out.println("im here.");
    }
}
