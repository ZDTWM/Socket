package socket.two;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("127.0.0.1", 8888);
			//打开输出流
			OutputStream os = s.getOutputStream();
			
			os.write(110);
			os.close();
			
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
