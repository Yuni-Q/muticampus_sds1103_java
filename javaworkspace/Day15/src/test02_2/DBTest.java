package test02_2;

import java.sql.*;
import java.util.Scanner;

public class DBTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
//		1. ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
//		2. Ŀ�ؼ� ����
			String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
			String DB_ID = "root";
			String DB_PW = "sds1103";
			
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
//		3. SQL �ۼ�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����>");
			String title = sc.nextLine();
			System.out.print("���ǻ�>");
			String pub = sc.nextLine();
			System.out.print("���ǿ���>");
			String year = sc.next();
			System.out.print("����>");
			int price = sc.nextInt();
			
			sql = "INSERT INTO BOOKS(YEAR,PRICE,TITLE,PUBLISHER) "
					+ "VALUES(?,?,?,?)";
//		4. Statement �Ǵ� PreparedStatement ��ü
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, year);
			pstmt.setInt(2, price);
			pstmt.setString(3, title);
			pstmt.setString(4, pub);
			
//		5. SQL ����
//		 5.1 ����� insert, update, delete �� ���
			int result = pstmt.executeUpdate();
			
//		6. ����� ó��
			System.out.println("SQL ���� ���:"+result);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL ���� �߻�. Ŀ�ؼ� �Ǵ� sql ����");
			e.printStackTrace();
		} finally {
//		7. ����� �ڿ� �ݳ� close
			
		}
	}
}
