package sstest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n0623631
 */

import java.io.*;
import java.net.*;

public class server {
// sending message from client, server converting message to upper case and sending back to client
    public static void main(String[] args) throws IOException {
       ServerSocket server = new ServerSocket(9090);
       
       System.out.println("Server Online");
       System.out.println("Waiting for messages...");
       
    while (true) {

        Socket client = server.accept();
        DataInputStream inFromServer = new DataInputStream(client.getInputStream());
        DataOutputStream serverWelcome = new DataOutputStream(client.getOutputStream());
        DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
         
        serverWelcome.writeUTF("You are connected to Chat Room 1");
        String text = inFromServer.readUTF();
        String textupper = text.toUpperCase();
        
        System.out.println(client.getInetAddress() + ": " + text);
        boolean service = true;
        
        while (service == true){
        if (text == "exit")    
            text = inFromServer.readUTF();
            textupper = text.toUpperCase();
            client.close();   
             service = false;
            System.out.println("client disconnected");
                 }
        outToServer.writeUTF(textupper);
        System.out.println("Response: " + textupper);

        
        }
    }
}