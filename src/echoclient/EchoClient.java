/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoclient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @date April 2016
 * @author Kenneth Power
 */
public class EchoClient {
    private Socket clientSocket;
    
    public void runClient(){
        try{
            clientSocket = new Socket("localhost", 40000);
            System.out.println("Connect to Server on port 40000");
            
            ObjectOutputStream out;
            out = new ObjectOutputStream(clientSocket.getOutputStream());
            out.flush();
            ObjectInputStream in;
            in = new ObjectInputStream(clientSocket.getInputStream());
            
        }
        catch(IOException ex){
            System.out.println("An IOExcepion occured");
            ex.printStackTrace();
        }
    }
    
}
