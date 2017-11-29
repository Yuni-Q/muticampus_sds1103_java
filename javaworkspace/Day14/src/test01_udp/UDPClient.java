package test01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

// ������ �������̶�� ���� �Ͽ� ��Ŷ�� 1�� �����ϴ� ���α׷� ����
public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramPacket sendPacket = null;
		
		try {
			sendSocket = new DatagramSocket();
			String sendMsg = "������ �ȳ��ϼ���~";
			// String �����͸� byte �迭���·� �����
			byte[] sendByte = sendMsg.getBytes();
			
			// ������, ������ũ��, IP�ּ�, ��Ʈ
			sendPacket = new DatagramPacket
					(sendByte, sendByte.length, 
						InetAddress.getByName("70.12.111.144"), 1111);
			
			sendSocket.send(sendPacket); // send!
			System.out.println("������!");
			
		} catch (SocketException e) {
			System.out.println("���� ���� �߻�!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("���� �� �������� �𸣰ڳ�");
			e.printStackTrace();
		} finally {
			sendSocket.close();
		}
	}
}
