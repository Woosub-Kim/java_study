package ex18jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IconnectImpl implements IConnect{

	public Connection con;//DB연결을 위한 객체
	public Statement stmt;//정적 쿼리 처리를 위한 객체
	public ResultSet rs;//select의 결과를 처리하기 위한 객체
	public PreparedStatement psmt; //동적 쿼리 처리를 위한 객체
	
	//기본생성자: 하는 일 없음
	public IconnectImpl() {
		System.out.println("!!기본생성자!!");
	}
	//인자(2)생성자
	public IconnectImpl(String user, String pass) {
		System.out.println("!!인자(2)생성자 호출!!");
		try {
			//1. 오라클 드라이버를 메모리에 로드
			Class.forName(ORACLE_DRIVER);
			//2. DB연결
			connect(user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("@오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("@알 수 없는 예외 발생");
		}
		
	}
	//인자(3)생성자
		public IconnectImpl(String url, String user, String pass) {
			System.out.println("!!인자(3)생성자 호출!!");
			try {
				//1. 오라클 드라이버를 메모리에 로드
				Class.forName(ORACLE_DRIVER);
				//2. DB연결
				connect(url,user, pass);
			} catch (ClassNotFoundException e) {
				System.out.println("@오라클 드라이버 로딩 실패");
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println("@알 수 없는 예외 발생");
			}
			
		}
		
		
	//실제 DB연결을 처리하는 멤버 메소드
	@Override
	public void connect(String url, String user, String pass) { //connect메소드 (인자 3개 짜리)
		try {
			//2. 실제 연결 진행/커넥션 객체 활용
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("!!오라클 DB 연결 성공!!");
		} catch (SQLException e) {
			System.out.println("@DB 연결 실패");
			e.printStackTrace();
		}
		
	}
	@Override
	public void connect(String user, String pass) { //connect메소드 (인자 2개 짜리)
		try {
			//2. 실제 연결 진행/커넥션 객체 활용
			con = DriverManager.getConnection(ORACLE_URL,user,pass);
			System.out.println("!!오라클 DB 연결 성공!!");
		} catch (SQLException e) {
			System.out.println("@DB 연결 실패");
			e.printStackTrace();
		}
		
	}
	/*
	 * 오버라이딩의 목적으로만 정의한 메소드로 실제 쿼리에 대한 처리는 해당 업무를 진행하는 클래스에서 진행한다
	 */
	@Override
	public void execute() {
	
		//몸체없음 오버라이딩 처리
	}

	//DB작업을 모두 마친 후 사용했던 자원을 반납하는 메소드
	@Override
	public void close() {
		try {
			//Statement객체 자원 반납
			if (stmt != null) stmt.close();
			//Connection객체 자원 반납
			if (con != null) con.close();
			//resultSet객체 자원 반납
			if (rs != null) rs.close();
			System.out.println("!!DB 자원 반납 완료!!");
			//prepared객체 자원 반납
			if (psmt != null) psmt.close();
			System.out.println("!!DB 자원 반납 완료!!");
		} catch (SQLException e) {
			System.out.println("@DB 자원 반납 과정에서 오류발생");
		}	
	}
	
	
	@Override
	public String scanValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.println(title + "을(를) 입력(exit->종료)");
		String inputStr = scan.nextLine();
		//equals는 대소문자를 구분하지만, equalsIgnoreCase는 무시한다
		if ("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close();//자원반납
			//프로그램 자체의 종료
			System.exit(0);
		}
		return inputStr;
	}

}
