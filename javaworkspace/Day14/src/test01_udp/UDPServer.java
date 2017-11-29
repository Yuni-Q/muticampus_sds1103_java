package test01_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// ���� ������Ѽ� Ŭ���̾�Ʈ�� ��Ŷ�� ��ٸ��� ���� ���α׷� ����
public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		
		byte[] receiveData = new byte[512]; // ���� ������ ũ��;
		
		try {
			socket = new DatagramSocket(1111); // 1111��Ʈ�� ���� �ȱ�
			// �����͸� �ޱ� ���� �� ��Ŷ �����
			packet = 
				new DatagramPacket(receiveData, receiveData.length);
			while (true) {
				System.out.println("������ ��ٸ�����....");
				socket.receive(packet);
				System.out.println("�޾���!:" + new String(receiveData));
			}
		} catch (SocketException e) {
			System.out.println("���� ���� �߻�!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException �߻�!");
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}
}
