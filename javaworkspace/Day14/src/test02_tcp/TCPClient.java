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
		System.out.println("������ ���� �ϳ��� ȹ����!");

		BufferedReader br = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		Scanner sc = new Scanner(System.in);

		while (true) {
			// �޼��� �۽źκ�
			System.out.print("���� �޼��� >> ");
			String sendMsg = sc.nextLine();

			bw.write(sendMsg + "\n");
			bw.flush();

			// �޼��� ���� �κ�
			String receiveMsg = br.readLine();
			System.out.println("�����κ��� : " + receiveMsg);
			
			if(receiveMsg.equals("bye"))
				break;
		}
		// ���α׷� �����ϱ� ���� ����� �ڿ� �ݳ��ϱ�.
		br.close();
		bw.close();
		socket.close();
	}
}
