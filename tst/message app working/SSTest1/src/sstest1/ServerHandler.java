/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sstest1;

import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/**
 *
 * @author n0647507
 */
public class ServerHandler extends Thread{
    Socket Client;
    DataInputStream inFromUser;
    DataOutputStream outToUser;
    boolean diconnected = false;
    //int arrayRef;
    
    ServerHandler(Socket _client) throws IOException{
        Client = _client;
        inFromUser = new DataInputStream(Client.getInputStream());
        outToUser = new DataOutputStream(Client.getOutputStream());
        //arrayRef = UDPServer.ref;
    }
    
    @Override
    public void run(){
        try{
            while(diconnected == false)
                {
                    String text = inFromUser.readUTF();
                    System.out.println("In from user to text");
                    System.out.println(text);
                    if (text == "AEOv5JKpYv3EjsMv8c9p"){
                        diconnected = true;
                    }
                    //outToUser.writeUTF(text);
                    //System.out.println("Out to user");
                    for (int i =0; i < UDPServer.socketNum; i++){
                       outToUser = new DataOutputStream(UDPServer.clientOutputStreams[i].getOutputStream());
                       outToUser.writeUTF(text);
                    }
                }
        }catch(IOException e){
        
        }
    }
            
}
