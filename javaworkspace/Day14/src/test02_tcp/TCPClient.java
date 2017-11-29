package test02_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("70.12.111.144", 3333);
		System.out.println("서버와 소켓 하나씩 획득함!");

		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 메세지 송신부분
			System.out.print("보낼 메세지 >> ");
			String sendMsg = sc.nextLine();

			bw.write(sendMsg + "\n");
			bw.flush();

			// 메세지 수신 부분
			String receiveMsg = br.readLine();
			System.out.println("서버로부터 : " + receiveMsg);
			
			if(receiveMsg.equals("bye"))
				break;
		}
		// 프로그램 종료하기 전에 사용한 자원 반납하기.
		br.close();
		bw.close();
		socket.close();
	}
}
