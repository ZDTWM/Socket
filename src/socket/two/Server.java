package socket.two;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		try {
			
			ServerSocket ss = new ServerSocket(8888);
			
			System.out.println("监听在端口号:8888");
			Socket s = ss.accept();
			
			//打开输入流
			InputStream is = s.getInputStream();
			
			int msg = is.read();
			
			System.out.println(msg);
			
			is.close();
			s.close();
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
