package ex18jdbc.prepared;

import java.sql.Date;
import java.util.Scanner;

import ex18jdbc.connect.IconnectImpl;
/*
 * preparedStatment 객체를 이용한 JDBC 프로그래밍  순서
 * 1.쿼리를 준비한다
 * 1-1 인파라미터가 없는 쿼리
 * 1-2 인파라미터가 있는 쿼리
 * 아래 쿼리문처럼 값이 채워져야 할 부분을 ?로 대체 작성 후 setXXX()계열 메소드를 톨해 값을 입력한다
 * "insert into 테이블 values (?,?,?,?);"
 * 2.쿼리실행을 위한 preparedStatment 객체 생성하기
 * 객체 생성시 쿼리문을 먼저 전달한다. 이때 전달된 쿼리문은 먼저 parsing되고
 * 차후 값을 입력받는다
 * 3. 인파라미커 설정
 * 인파라미터가 없는 쿼리: 값설정없이 바로 실행가능
 * 인파라미터가 있는 쿼리: 실행전 값을설정해야 한다
 * 					?가 있는 부분에 인덱스로 접근해서 설정한다
 * 					자료형이 number면 setInt, 문자열이면 setString 사용
 * 
 * 
 */

public class InsertSQL extends IconnectImpl {

	public InsertSQL() {
		super(ORACLE_URL, "korea", "1234");
	}
	@Override
	public void execute() {
		try {
			//1. 쿼리 준비
			String query = "INSERT INTO member VALUES (?,?,?,?)";
			//2.프리페어 객체생성: 쿼리문을 인자로서
			psmt = con.prepareStatement(query);
			//3.db에 입력할 값을 받는다
			Scanner scan = new Scanner(System.in);
			
			System.out.print("아이디:");
			String id = scan.nextLine();
			
			System.out.print("비밀번호:");
			String pw = scan.nextLine();
			
			System.out.print("성함:");
			String name = scan.nextLine();
			//4.인파라미터 설정하기
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
//			날짜를 문자열 형태로 입력하는 경우 java에서 생성한후 그대로 입력한다.
//			psmt.setString(4, "2018-11-20");
			
/*
 * 			현재 날짜를 자바에서 입력하는 경우 먼저 util패키지의 date객체로 현재 날짜를 가져온 후 sql의 date객체로
 * 			변환 후 오라클에 입력해야 한다.
 */
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());		
			psmt.setDate(4, sqlDate );
			
			//5.쿼리실행
			int affected = psmt.executeUpdate();
			System.out.println(affected +"개 행이 입력됨");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public static void main(String[] args) {
		
		new InsertSQL().execute();
	}

}
