package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("�����˿ںţ�8888");
			Socket s = ss.accept();
			System.out.println("�����ӹ�����" + s);
			
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
