package ip.port.address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� Runtime.getRuntime().exec() ��������һ��windows��exe����
 * ��ͼ��ʹ��java���� ping 192.168.2.106�������������ַ���
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) throws IOException {
		
		Process p = Runtime.getRuntime().exec("ping " + "172.16.200.18");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null){
			if(line.length() != 0)
				sb.append(line + "\r\n");
		}
		System.out.println("����ָ��ص���Ϣ�ǣ�");
		System.out.println(sb.toString());
	}

}
