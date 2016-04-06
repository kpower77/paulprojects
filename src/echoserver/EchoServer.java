package echoserver;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paul
 */
public class EchoServer {

    private ServerSocket serverSocket;
    private boolean running = true;

    public EchoServer() {

    }

    public void startServer() {
        try {

            //create a new server socket, taking a port number as an example
            serverSocket = new ServerSocket(40000);

            // serverSocket should be in a loop, otherwise the application 
            // will shut down after the first client has disconnected
            while (running) {
                // This is a blocking call, serverSocket.accept() will block the main thread
                // until a client connects
                System.out.println("Echo Server is waiting for clients...");
                Socket client = serverSocket.accept();
                
                // get an InputStream from the client socket to read incoming data
                InputStream in = client.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                // get an OutputStream from the client to send data to the client
                OutputStream out = client.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
                

                while(!client.isClosed()){
                    // Not sure if reader.readLine() is a blocking call or not.
                    String message = reader.readLine();
                    if(message != null){
                        System.out.println("Server Received: " + message);
                        writer.write(message);
                        // the method flush() makes sure all bytes have been sent to the client
                        // Sometimes the writer will wait to fill the buffer before sending.
                        writer.flush();
                    }
                }
                
                client.close();
            }
        } catch (IOException ex) {
            System.out.println("An IOException occurred");
            ex.printStackTrace();
        }
    }
}
