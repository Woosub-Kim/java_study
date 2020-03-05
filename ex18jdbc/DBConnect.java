package ex18jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * JDBC란?
 * JDBC: java언어로 데이터베이스를 연결해서 CRUD를 할 수 있도록 해주는 기술
 * CRUD: Create, Read, Update, Delete 즉, db의 기본 기능
 */
public class DBConnect {

	public static void main(String[] args) {
		try {
//	1] 드라이버 로딩
//	자바의 JDBC API 인터페이스를 구현한 드라이버 클래스를 찾아 객체를 생성한다.
//	드라이버 클래스 객체 생성할 때에는 new를 사용하지 않는다.	
//	class.forName(패키지 포함 클래스명)
//	new 사용 없이 클래스명으로 직접 찾아서 객체생성 후 메모리에 로드하는 메소드
//	drivermanager클래스에 로드된다		
			Class.forName("oracle.jdbc.OracleDriver");
//  2]오라클 드라이버 로드
//	접속위한 계정아이디, 비밀번호(패스워드), 커넥션url을 미리 지정해둔다.	
//	jdbc:oracle:thin:// 어느 환경에서나 동일
//	서버환경에 따라 ip주소, 포트, sid는 변경될 수 있다		
			String url = "jdbc:oracle:thin://@localhost:1521:orcl";
			String userid = "hr";
			String userpw = "1234";
/*
 * 2-1]
 * DriverManager클래스의 getConnection()메소드를 호출하여 오라클에 연결을 시도한다
 * 성공할 경우 주소를 반환한다
 */			
			Connection con = DriverManager.getConnection(url,userid, userpw);
			
			if (con!=null) {
				System.out.println("!!DB연결 성공!!");
/*
 * 3] 쿼리문 작성
 * 쿼리문을 작성할 때 주의할 점은 줄바꿈을 할때 앞뒤로 띄어주는게 좋다. 그렇지 않으면 syntax에러가
 * 발생할 수 있다
 * 세미콜론은 String에 포함되지 않는다
*/
 
//				String sql = "select" 
//			    + " employee_id, first_name, last_name, to_char(hire_date, 'yyyy-mm-dd'), to_char(salary, '999,000')" 
//			    + " from employees where department_id = 50"
//			    + " order by employee_id asc"; 

				String sql = "select" 
						+ " employee_id, first_name, last_name, hire_date, salary" 
						+ " from employees where department_id = 50"
						+ " order by employee_id asc"; 
				
				System.out.println("sql: " + sql);//sql 내용 확인
/*
 * 4] 쿼리문 전송을 위해 Statement계열의 객체를 생성한다.				
 */
				java.sql.Statement stmt = con.createStatement();
/*
 * 5] Statement객체의 execueQuery()메소드를 호출하여 오라클로 쿼리를 전송한다
 * 쿼리 실행후 오라클은 Java쪽으로 결과를 반환한다. 				
 */
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
/*
 * 오라클이 반환해준 ResultSet객체의 갯수만큼 반복하면소 콘솔에 출력한다. 
 * getXXX() 계열의 함수의 인자로 select절의 순서대로 인덱스를 사용할 수 있고
 * 컬럼명을 써도 상관없다					
 */
					
//					String emp_id = rs.getString(1);
//					String f_name = rs.getString(2);
//					String l_name = rs.getString(3);
//					String h_date = rs.getString(4);
//					String sal = rs.getString(5);
					
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString(3);
					java.sql.Date h_date = rs.getDate("hire_date");
					int sal = rs.getInt("salary");
					
					System.out.printf("%-5s %-10s %-13s %-13s %-5s\n", emp_id, f_name, l_name, h_date, sal);	
				}
/*
 * 6]
 * 자원반납
 * 모든 작업을 마친 후에는 메모리 절약을 위해 연결했던 자원을 반납한다				
 */
				rs.close();
				stmt.close();
				con.close();
					
			}else {
				System.out.println("db연결실패");
			}//if문의 종료
			
		} catch (Exception e) {
			System.out.println("db연결 예외 발생");
		}
//	try~catch문 종료 
		
		
		
		
		
	}
}
