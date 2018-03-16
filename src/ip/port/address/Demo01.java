package ip.port.address;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * 获取本机IP地址
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("本机ip地址：" + ip);
	}
}
