/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author tanjil
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner object to get input value
        Scanner getValues = new Scanner(System.in);
        
        // Asks for the name
        System.out.println("Enter your name: ");
        String getName = getValues.nextLine();
        
        // Asks for the age
        System.out.println("Good morning " + getName + "! How old are you!");
        int getAge = getValues.nextInt();
        
        // Create if statement
        if(getAge > 18){
            System.out.println("Congratulations, you are now an adult!");
        } else if(getAge>=21){
            System.out.println("Hey, you are a real adult now!");
        } else if(getAge<15) {
            System.out.println("You are young!");  
        } else if(getAge<18){
            System.out.println("You are close to be an adult!");
        } 
    }
    
}
