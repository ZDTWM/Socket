package ip.port.address;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * ��ȡ����IP��ַ
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("����ip��ַ��" + ip);
	}
}
