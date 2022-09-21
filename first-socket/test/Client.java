import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 9696)) {
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String string1 = "", string2 = "";
            while((string1 = br.readLine()) != "done"){
                outputStream.writeUTF(string1);
                outputStream.flush();
                string2 = inputStream.readUTF();
                System.out.println(string2);
            }
        } catch (IOException e) {
            System.out.println("An Exception occured " + e.getMessage());
        }
        
    }    
}
