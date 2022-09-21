import java.io.*;
import java.net.*;

public class FirstServer {
  public static void main(String[] args)
  {
    try{
      ServerSocket firstServerSocket = new ServerSocket(6868);
      Socket socketConnection = firstServerSocket.accept();
      DataInputStream dataStreamIn = new DataInputStream(socketConnection.getInputStream());
      String readString = dataStreamIn.readUTF();
      System.out.println(readString);
      firstServerSocket.close();
    } catch (IOException e){
        System.out.println("IOException Thrown");
    }
  }
}
