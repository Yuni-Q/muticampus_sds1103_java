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
		socket = serverSocket.accept(); // ��û�� ������ ���� ����!
		System.out.println("client request coming!" + socket.getInetAddress());
		
		// ���Ͽ��� InputStream�� OutputStream�� ���� ������
		// ���� ���ϰ� Reader/Writer Ŭ���� ��ü�� �����ϱ�.
		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));

		Scanner sc = new Scanner(System.in);
		
		while(true){
			// �޼��� ���� �κ�
			System.out.println("�޼��� ��ٸ�����...");
			String receiveMsg = br.readLine();
			System.out.println("���� �޼��� : " + receiveMsg);

			if(receiveMsg.equals("bye"))
				break;
			
			// �޼��� �۽� �κ�
			System.out.print("���� �޼��� >> ");
			String sendMsg = sc.nextLine();

			bw.write(sendMsg + "\n");
			bw.flush();
		}
		
		// ���α׷� �����ϱ� ���� ����� �ڿ� �ݳ��ϱ�.
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();

	}
}







