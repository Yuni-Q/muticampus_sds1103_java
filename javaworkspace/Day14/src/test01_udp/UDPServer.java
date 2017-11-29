package test01_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// 먼저 실행시켜서 클라이언트의 패킷을 기다리는 서버 프로그램 예제
public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		
		byte[] receiveData = new byte[512]; // 대충 적당한 크기;
		
		try {
			socket = new DatagramSocket(1111); // 1111포트에 소켓 꽂기
			// 데이터를 받기 위한 빈 패킷 만들기
			packet = 
				new DatagramPacket(receiveData, receiveData.length);
			while (true) {
				System.out.println("서버가 기다리는중....");
				socket.receive(packet);
				System.out.println("받았음!:" + new String(receiveData));
			}
		} catch (SocketException e) {
			System.out.println("소켓 예외 발생!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException 발생!");
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}
}
