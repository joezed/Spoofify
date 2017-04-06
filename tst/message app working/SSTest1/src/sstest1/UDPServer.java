/*
This is ChatSystem5
*/
package sstest1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class UDPServer 
{
    public static Socket clientOutputStreams[] = new Socket[10];
    public static int socketNum = 0;
    public static void main(String[] args) throws Exception 
    { 
        ServerSocket ss;
        Socket s;
        DataOutputStream outToUser;
        DataInputStream inFromUser;
        String text;
        Boolean diconnected = false;
        ss = new ServerSocket(5000);
        while(true)
        {
            
            System.out.println("Connection");
            //Handshake connection
            s = ss.accept();
            System.out.println("SS accept");
            clientOutputStreams[socketNum] = s;
            socketNum++;
            ServerHandler SH = new ServerHandler(s);
            SH.start();
            
           //Start setup stream
            outToUser = new DataOutputStream(s.getOutputStream());
            outToUser.flush();
            System.out.println("out To User");
            inFromUser = new DataInputStream(s.getInputStream());
            System.out.println("in from user");}}}
            //End of setup stream
      