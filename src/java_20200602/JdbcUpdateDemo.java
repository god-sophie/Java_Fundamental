package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		// 2. 데이터 베이스 연결 => Connection 객체를 생성한다.
		// localhost : 데이터베이스 설치 ip
		// 3306 : 데이터베이스 포트
		// kpc : 데이터베이스 명
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",	// url
					"kpc12",							// user
					"kpc1234");							// password
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member");
			sql.append("SET NAME = ?, addr = ?");
			sql.append("WHERE num = ?");
			
			pstmt = con.prepareStatement(sql.toString());		// string 버퍼를 문자열로 바꿔줌
			
			// 4. 바인딩 변수 처리
			int index = 0;
			pstmt.setString(++index, "샤넬2");
			pstmt.setString(++index, "프랑스2");
			pstmt.setInt(++index, 9);
			
			// 5. SQL문 전송
			// resultCount : 업데이트된 행의 수를 반환함.
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("전송결과 : "+resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con!=null) con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
