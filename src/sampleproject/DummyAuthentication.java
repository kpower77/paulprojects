/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class DummyAuthentication {
    
    private String userName;
    private String password;
    private BufferedReader reader;
    
    public DummyAuthentication(){
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    public void loginUser(){
        
        try {
            System.out.println("Enter User Name: ");
            userName = reader.readLine();
            System.out.println("Enter Password: ");
            password = reader.readLine();
            
            if(userName.equals("Ken") && password.equals("1234")){
                System.out.println("Login successful!! Hello " + userName);
                /*
                return the app page here
                */
            }else{
                 System.out.println("Login Failed! please try again!");
                 /*
                 do something else here
                 */
            }
        } catch (IOException ex) {
            System.out.println("An IOException occurred");
        }
    
    }
}
