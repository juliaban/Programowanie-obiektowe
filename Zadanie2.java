/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zadanie2;

/**
 *
 * @author inf154015
 */

final class Jeans {
    int jeansPrice;
    String jeansColour;
    String jeansSize;
        
    public Jeans(int price, String colour, String size) {
    this.jeansPrice = price;
    this.jeansColour = colour;
    this.jeansSize = size;
    }
    
    public Jeans(String price, String colour, String size) {
        this(Integer.parseInt(price), colour, size);
    }
    
    public Jeans(int price, String colour){
        this(price, colour, "one size");
    }
    
    void itemInfo(){
        System.out.println("Price is: " + jeansPrice + "\nColour is: " + jeansColour + "\nSize is: " + jeansSize);
    }

}

public class Zadanie2 {

    public static void main(String[] args) {
        Jeans newItem = new Jeans("34", "black", "skinny jenas");
        Jeans noSize = new Jeans (20, "blue");
        newItem.itemInfo();
        noSize.itemInfo();
    }
}
