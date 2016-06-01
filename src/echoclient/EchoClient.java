/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @date April 2016
 * @author Kenneth Power
 */
public class EchoClient{
    private Socket clientSocket;
    private String message;
    public void runClient(){
        try{
            clientSocket = new Socket("localhost", 40000);
            System.out.println("Echo Client has connected to Server");
            
            // send an OutputStream to the server to send data
            OutputStream out = clientSocket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            
            // get an InputStream from the server to read incoming data
            InputStream in = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            writer.write("Hello from Echo Client");
            writer.newLine();
            
            writer.flush();
            
            message = reader.readLine();
            System.out.println(message);
                        
            //in.close();
            //out.close();
            clientSocket.close();
            
            
        }
        catch(IOException ex){
            System.out.println("An IOExcepion occured");
        }
    }
    
}
