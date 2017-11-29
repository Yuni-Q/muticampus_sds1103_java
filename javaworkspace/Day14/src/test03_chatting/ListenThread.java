package test03_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListenThread extends Thread{
	private BufferedReader br;
	
	public ListenThread(Socket socket){
		// 쓰레드 객체 외부에서 전달받은 socket 객체를 이용하여
		// 메세지 받는데 필요한 BufferedReader 초기화 작업
		try {
			br = new BufferedReader(new InputStreamReader
					(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("Listen inputstream exception!!");
			e.printStackTrace();
		}
	}
//////////////////////////////////////////////////////////////////
	// Listen 쓰레드는 메세지 받는 작업만 반복함.
	public void run() {
		try {
			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("받은 메세지:" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("연결 종료됐나봐요. 채팅 종료됨");
			e.printStackTrace();
		}
	}
}
