/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24sec03.s572818assignment02;

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

public class Book {
    
  private String title;
  private String author;
  private double price;
  private double taxPercentage ;
  private final double DISCOUNT=10.0;
  private double totalPrice;
  private double finalPrice;

    public Book(String title, String author, double price, double taxPercentage) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.taxPercentage = taxPercentage;
    }

    public Book() {
        this.title="unkown";
        this.author="unkown";
        this.price=0.0;
        this.taxPercentage=0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
public double calcTotalPrice(){
    this.totalPrice=this.price +(this.price * this.taxPercentage/100);
    return totalPrice;
}    
  public double calcFinalPrice(){
      this.finalPrice=this.totalPrice-(this.totalPrice* DISCOUNT/100);
      return finalPrice;
  }

    @Override
    public String toString() {
        return  "Title of the Book :" + title + "\n Author of the Book :" + author  + "\n TaxPercentage :" + taxPercentage + "\n DISCOUNT :" + DISCOUNT + "\n Total Price of the Book including tax :$" + totalPrice + "\n Final Price of the Book after Discount :$" + finalPrice;
    }
  
}
