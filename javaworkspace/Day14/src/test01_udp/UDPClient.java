package test01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

// 서버가 실행중이라는 전제 하에 패킷을 1번 전송하는 프로그램 예제
public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramPacket sendPacket = null;
		
		try {
			sendSocket = new DatagramSocket();
			String sendMsg = "지수씨 안녕하세요~";
			// String 데이터를 byte 배열형태로 만들기
			byte[] sendByte = sendMsg.getBytes();
			
			// 데이터, 데이터크기, IP주소, 포트
			sendPacket = new DatagramPacket
					(sendByte, sendByte.length, 
						InetAddress.getByName("70.12.111.144"), 1111);
			
			sendSocket.send(sendPacket); // send!
			System.out.println("보냈음!");
			
		} catch (SocketException e) {
			System.out.println("소켓 예외 발생!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("뭐야 뭔 예외인지 모르겠네");
			e.printStackTrace();
		} finally {
			sendSocket.close();
		}
	}
}
