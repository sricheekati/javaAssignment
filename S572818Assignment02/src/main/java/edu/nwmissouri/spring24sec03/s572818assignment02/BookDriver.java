/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24sec03.s572818assignment02;

import java.util.Scanner;
//import java.util.*;

/**
 *
 * @author S572818 SRILAKSHMI CHEEKATI
 */
/**
 * Class: 44542-03 Object-Oriented Programming
 *
 * @author SRILAKSHMI CHEEKATI 
 * Description: Making sure everything works 
 * Due: 01/24/2024
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student, internet, or any other source. 
 * I will not share my source code with anyone under any circumstances.
 */

public class BookDriver {

    public static void main(String[] args) {
        Scanner bookScanner = new Scanner(System.in);
        System.out.println("Enter the Title of the Book :");
        String t = bookScanner.nextLine();
        System.out.println("Enter the Author of the Book :");
        String a = bookScanner.nextLine();
        System.out.println("Enter the Price of the Book :");
        Double p = bookScanner.nextDouble();
        System.out.println("Enter the Tax of the Book in Percentage :");
        Double tp = bookScanner.nextDouble();
        System.out.println("*****The details of book1 are as follows :*****");
        Book book1 = new Book(t, a, p, tp);
        System.out.println(book1.toString());
        System.out.println("Total Price is : " + book1.calcTotalPrice());
        System.out.println("Final Price is : " + book1.calcFinalPrice());
        Book book2 = new Book();
        System.out.println("*****The details of the book2 are as follows*****");
        System.out.println(book2.toString());
        System.out.println("Total Price is : " + book2.calcTotalPrice());
        System.out.println("Final Price is : " + book2.calcFinalPrice());
        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(250);
        book2.setTaxPercentage(8.11);
        System.out.println("*****The details of the book2 are as follows*****");
        System.out.println(book2.toString());
        System.out.println("Total Price of the Book including Tax : " + book2.calcTotalPrice());
        System.out.println("Final Price of the Book after discount : " + book2.calcFinalPrice());

    }
}
