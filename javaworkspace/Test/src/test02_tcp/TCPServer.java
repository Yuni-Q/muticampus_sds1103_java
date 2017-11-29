package test02_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		serverSocket = new ServerSocket(3333);
		
		System.out.println("server wait.......");
		socket = serverSocket.accept(); // 요청이 들어오면 소켓 생성!
		System.out.println("client request coming!" + socket.getInetAddress());
		
		// 소켓에서 InputStream과 OutputStream을 얻은 다음에
		// 쓰기 편하게 Reader/Writer 클래스 객체로 포장하기.
		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));

		Scanner sc = new Scanner(System.in);
		
		while(true){
			// 메세지 수신 부분
			System.out.println("메세지 기다리는중...");
			String receiveMsg = br.readLine();
			System.out.println("수신 메세지 : " + receiveMsg);

			if(receiveMsg.equals("bye"))
				break;
			
			// 메세지 송신 부분
			System.out.print("보낼 메세지 >> ");
			String sendMsg = sc.nextLine();

			bw.write(sendMsg + "\n");
			bw.flush();
		}
		
		// 프로그램 종료하기 전에 사용한 자원 반납하기.
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();

	}
}







