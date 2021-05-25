import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(54862);
        Socket s= ss.accept();

        System.out.println("client connected");

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hello");
        pr.flush();


        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);


        String str = bf.readLine();
        System.out.println("client: " +str);

    }
}
