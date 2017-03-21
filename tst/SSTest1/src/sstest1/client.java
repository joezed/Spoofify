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
       
public class client {
       public static void main(String[] args) throws IOException {
            
        InetAddress address = InetAddress.getByName("localhost");
        Socket server = new Socket(address,9090);
        
        DataInputStream welcomeServer = new DataInputStream(server.getInputStream());
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());     
        DataInputStream inFromServer = new DataInputStream(server.getInputStream());
        
        while (true) { 

        String welcomeServerText = welcomeServer.readUTF();
        System.out.println(welcomeServerText);
                  
        String sendMessage = inFromUser.readLine();

        outToServer.writeUTF(sendMessage);
        String text = inFromServer.readUTF();   

        System.out.println("message is: " + text);
        
         }
        }
  
}
