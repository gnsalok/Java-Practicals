
import java.net.*;
import  java.io.*;
public class Client {
    public static void main(String[] args)
    {
        try{
            Socket ss=new Socket("Localhost",7777);
            DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
            dos.writeUTF("Hello Server!!");

            dos.close();
            ss.close();
        }catch (Exception e)
        {
            System.out.println("Error happens!!");
        }
    }

}