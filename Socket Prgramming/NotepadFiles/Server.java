
import java.net.*;
import  java.io.*;
public class Server {
    public static void main(String[] args)
    {
        try{
            ServerSocket ss=new ServerSocket(7777);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println(str);

            dis.close();
            s.close();

        }catch (Exception e)
        {
            System.out.println("Error happens!!");
        }
    }
}