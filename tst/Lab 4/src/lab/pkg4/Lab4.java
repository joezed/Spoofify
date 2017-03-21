/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;
import java.io.*;
import java.net.*;
/**
 *
 * @author Paul
 */
public class Lab4 {
// sending message from client, server converting message to upper case and sending back to client
    public static void main(String[] args) throws IOException {
       ServerSocket server = new ServerSocket(9090);
    while (true) {
        System.out.println("i am server");
        System.out.println("Waiting...");
        Socket client = server.accept();
        System.out.println("Client with IP: " + client.getInetAddress());
        
        DataInputStream inFromServer = new DataInputStream(client.getInputStream());
        String text = inFromServer.readUTF();
        System.out.println("The client send: " + text);
        
        String textupper = text.toUpperCase();
        
         DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
         outToServer.writeUTF(textupper);
         System.out.println("sever is sending back the message: " + textupper);
        
        
        }
    }
    
}
