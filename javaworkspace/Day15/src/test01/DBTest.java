package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
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
			sql = "INSERT INTO BOOKS(YEAR,PRICE,TITLE,PUBLISHER,BOOK_NUM) "
					+ "VALUES('2017', 32000, 'POWER', 'SDS', 102)";
//			sql = "UPDATE BOOKS SET PRICE=25000";
//		4. Statement �Ǵ� PreparedStatement ��ü
			stmt = con.createStatement();
//		5. SQL ����
//		 5.1 ����� insert, update, delete �� ���
			int result = stmt.executeUpdate(sql);
			
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
