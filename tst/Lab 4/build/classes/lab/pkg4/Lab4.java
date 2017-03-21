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
       
       System.out.println("Server Online");
       System.out.println("Waiting for messages...");
       
    while (true) {

        Socket client = server.accept();
        
        DataOutputStream serverWelcome = new DataOutputStream(client.getOutputStream());
        serverWelcome.writeUTF("You are connected to Chat Room 1");
        
        DataInputStream inFromServer = new DataInputStream(client.getInputStream());
        String text = inFromServer.readUTF();

        System.out.println(client.getInetAddress() + ": " + text);
        
        String textupper = text.toUpperCase();
        DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
        
        outToServer.writeUTF(textupper);
        System.out.println("Response: " + textupper);
        
        }
    }
    
}
