/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zadanie;

/**
 *
 * @author inf154015
 */

final class Owner{
    int DogCount;
    String OwnerName;
}

final class Dog{
    int DogIndex;
    String DogName;
    String DogColour;
    Owner DogOwner;
    
    void count(){
        System.out.print("This dog has a name: " + DogName +"\n");
        System.out.print("Owner of this dog is: " + DogOwner.OwnerName + "\n");
    }
}

public class Zadanie {

    public static void main(String[] args) {
        Owner newDogOwner = new Owner();
        newDogOwner.DogCount = 3;
        newDogOwner.OwnerName = "Tom";
        Dog myNewDog = new Dog();
        myNewDog.DogIndex = 44;
        myNewDog.DogName = "Cookie";
        myNewDog.DogColour = "white";
        myNewDog.DogOwner = newDogOwner;
        
        myNewDog.count();
        
    }
}
