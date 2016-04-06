package echoserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class EchoServerMain {
    
    
    public static void main(String[] args){
    
        EchoServer server = new EchoServer();
        server.startServer();
    }
}
