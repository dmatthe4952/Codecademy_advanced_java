import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {

        try{
            ServerSocket serverSocket = new ServerSocket(9696);
            Socket socketConnection = serverSocket.accept();
            DataInputStream inputStream = new DataInputStream(socketConnection.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socketConnection.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String string1 = "", string2 = "";
            while ((string1 = inputStream.readUTF()) != "done"){
                System.out.println(string1);
                string2 = br.readLine();
                outputStream.writeUTF(string2);
                outputStream.flush();
            }

            inputStream.close();
            socketConnection.close();
            serverSocket.close();

        } catch(Exception e){
            System.out.println("An Exception occurred " + e.getMessage());
        }
    }
}