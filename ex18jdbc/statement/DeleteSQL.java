package ex18jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQL {
	Connection con; //db연결 위한 객체
	Statement stmt; // 쿼리 전송 및 실행 하기 위한 객체
	
	//생성자: DB 연결 처리
	public DeleteSQL() {

		try {
			//1. 오라클 드라이버를 메모리에 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("@오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("@알 수 없는 예외 발생");
		}		
	} // end of InsertSQL
	
	private void connect() {
		try {
			//2. 실제 연결 진행/커넥션 객체 활용
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"korea",
					"1234");//앞으로는 복붙
			System.out.println("!!오라클 DB 연결 성공!!");
		} catch (SQLException e) {
			System.out.println("@DB 연결 실패");
			e.printStackTrace();
		}
	}
	//실제 쿼리작성 ㅁ및 실행 위한 메소드
	private void execute() {
	//3.Statement 계열의 객체를 생성하여 쿼리 실행 준비
		connect();//DB연결
		try {
			stmt = con.createStatement();
		//4. 딜리트 쿼리 작성
			String sql = "DELETE FROM MEMBER WHERE ID = 'test1' ";
			
			//5. 쿼리 실행 및 반환값 받기
			int affected = stmt.executeUpdate(sql);
			System.out.println("!! "+affected+"개 행 삭제!!");
		} catch (SQLException e) {
			System.out.println("@쿼리실행 중 문제발생");
		} finally { //finally try구문 진입시 예외와 상관없이 마지막에 수행
		//6.연결된 자원 반납
			close();
		}		
	}//end of execute
	//자원 반납 위한 메소드
	private void close() {
		try {
			if (stmt != null) stmt.close();
			if (con != null) con.close();
			System.out.println("!!DB 자원 반납 완료!!");
			
		} catch (SQLException e) {
			System.out.println("@DB 자원 반납 과정에서 오류발생");
		}
	}//end of close
	public static void main(String[] args) {
//		실행방법 1 참조변수 없이 객체생성과 동시에 메소드 호출
//		new InsertSQL().execute(); 아래 문장과 같다
//		실행방법 2: 객체생성후 참조변수에 대입하여 메소드 호출
		DeleteSQL insertSQL = new DeleteSQL();
		insertSQL.execute();
		
	}//end of main
	
}
