
package sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @date April 2016
 * @author Kenneth Power
 */
public class Sampleproject {

    public static void main(String[] args) {
       System.out.println("WOOHOO!!");
       DummyAuthentication auth = new DummyAuthentication();
       auth.loginUser();
//              */
//       printHello();
//       
//       /*
//       There are print messages in the constructor so you can see when it's called
//       */
//       MessagePrinter printer = new MessagePrinter();
//       /*
//        Printing a message from another class
//       */
//       printer.printMessage();
//       printer.printMenuOptions();
//       
//       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String in = reader.readLine();
//            printer.printSelection(in);
//        } catch (IOException ex) {
//         System.out.println("An IOException occurred! ");
//        }
    }
    
    
    private static void printHello(){
        System.out.println("Hello from static method!");
    }
}
