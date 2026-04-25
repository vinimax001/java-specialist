package com.algaworks.javaspecialist.execoes.nelioAlves.class02.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();
        System.out.println("End of program");

    }

    public static void method1() {

        System.out.println("        **** METHOD 01 START ****");
        method2();
        System.out.println("        **** METHOD 01 END ****");

    }

    public static void method2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("*** METHOD 02 START ***");
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error.");
            e.printStackTrace();
        }

        System.out.println("*** METHOD 02 END ***");

        sc.close();
    }
}
