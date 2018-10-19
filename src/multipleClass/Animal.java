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
        // method WITHOUT 'static' on same class
        Animal littleAnimal = new Animal(); //instantiation
        littleAnimal.method2();

        // method WITH 'static' on same class
        method1(1, 2);
        Animal.method1(1, 2);

        Plant littlePlant = new Plant(); // instantiate
        littlePlant.helloPlant();
        int temp = littlePlant.add(4, 6);
        System.out.println("the sum is: " + temp);

    }

    public static void method1(int x, int y) {
        System.out.println("method 1 here.");
    }

    public void method2() {
        System.out.println("method 2 here.");
    }

    public void method3() {
        System.out.println("im here.");
    }
}
