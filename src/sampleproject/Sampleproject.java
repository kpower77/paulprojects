/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Kenneth
 */
public class Sampleproject {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("WOOHOO!!");
       
       /*
           Methods in the main class must be static.
           Meaning they can be called without instantiating the class.
           See the method signiture below.
       */
       printHello();
       
       /*
       There are print messages in the constructor so you can see when it's called
       */
       MessagePrinter printer = new MessagePrinter();
       /*
        Printing a message from another class
       */
       printer.printMessage();
       printer.printMenuOptions();
       
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String in = reader.readLine();
            printer.printSelection(in);
        } catch (IOException ex) {
         System.out.println("An IOException occurred! ");
        }
    }
    
    
    private static void printHello(){
        System.out.println("Hello from static method!");
    }
}
