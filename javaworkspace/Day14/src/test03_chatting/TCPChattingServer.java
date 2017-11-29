package test03_chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("클라이언트를 기다리는 중 ...");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 접속함 !!"+socket.getInetAddress());
	////////////////////////////////////////////////////////////	
		SpeakThread st = new SpeakThread(socket);
		ListenThread lt = new ListenThread(socket);
		
		st.start();
		lt.start();
	}
}
