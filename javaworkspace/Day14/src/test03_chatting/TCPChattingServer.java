package test03_chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� �� ...");
		Socket socket = serverSocket.accept();
		System.out.println("Ŭ���̾�Ʈ ������ !!"+socket.getInetAddress());
	////////////////////////////////////////////////////////////	
		SpeakThread st = new SpeakThread(socket);
		ListenThread lt = new ListenThread(socket);
		
		st.start();
		lt.start();
	}
}
