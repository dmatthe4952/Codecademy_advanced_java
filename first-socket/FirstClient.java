import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class FirstClient{
  public static void main(String[] args) {

    Socket clientSocket;
    DataOutputStream dataStreamOut;
    try {
      clientSocket = new Socket("localhost",6868);
      dataStreamOut = new DataOutputStream(clientSocket.getOutputStream());
      dataStreamOut.writeUTF("Happy Coding!");
      dataStreamOut.flush();
      dataStreamOut.close();
      clientSocket.close();
    } catch (UnknownHostException e) {
        System.out.println("Exception thrown " + e.getMessage());
    } catch (IOException e) {
        System.out.println("Exception thrown " + e.getMessage());
    }

  }
}
