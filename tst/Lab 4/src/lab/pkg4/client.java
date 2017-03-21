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

public class client {
        public static void main(String[] args) throws IOException {
            
         InetAddress address = InetAddress.getByName("localhost");
         Socket server = new Socket(address,9090);
         
         BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
         String sendMessage = inFromUser.readLine();
         
         DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());
         outToServer.writeUTF(sendMessage);
         
      
         
         DataInputStream inFromServer = new DataInputStream(server.getInputStream());
         String text = inFromServer.readUTF();   
         
         System.out.println("message is: " + text);
  

         
        }
}



