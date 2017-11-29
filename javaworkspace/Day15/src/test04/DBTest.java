package test04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds1103";
			con = DriverManager.getConnection(url,id,pw);
			
			String sql = "SELECT BOOK_NUM,TITLE,PUBLISHER,YEAR,PRICE FROM BOOKS";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();	// 명령어 실행함!
			
			List<BookVO> bookList = new ArrayList<>();
			
			while(rs.next()){
				BookVO book = new BookVO();
				book.setBookNum(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getInt(5));
				
				bookList.add(book);
			}
			
			for(BookVO b: bookList){
				System.out.println(b);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생");
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
