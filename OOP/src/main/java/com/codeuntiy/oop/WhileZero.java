/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeuntiy.oop;

import java.util.Scanner;

/**
 *
 * @author Who Am I
 */
public class WhileZero {
    public static void while_zero() {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        while ((n = in.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Enter another number: ");
        }
        System.out.println("You enterd Zero");
        in.close();
    }

}
