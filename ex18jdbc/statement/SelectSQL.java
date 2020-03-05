package ex18jdbc.statement;

import java.sql.ResultSet;
import java.sql.SQLException;

import ex18jdbc.connect.IconnectImpl;

public class SelectSQL extends IconnectImpl {

	public SelectSQL(String url, String user, String pass) {
		super(url, user, pass);
	}
	
	@Override
	public void execute() {
		
		
		try {
			stmt = con.createStatement();
			
			String query = 
					" SELECT id, pass, name, " +
//					" to_char(regidate, 'yyyy.mm.dd hh24:mi') AS date_form1 " +
					" regidate " +
					" FROM member " + 
					" WHERE id != 'korea' " + 
					" ORDER BY regidate DESC ";
			
			rs = stmt.executeQuery(query);
/*
 * excuteUpdate(): 쿼리문이 insert, delete, update와 같이 
 * 기존 레코드에 영향을 미치는 쿼리를 실행할 때 사용
 * 실행 후 영향을 받은 행의 갯수가 반환된다
 * 
 * executeQuery(): 쿼리문이 select일때 호출하는 메소드
 * 레코드에 영향을 미치지 않는 쿼리를 실행한다. 즉, 조회만 진행한다.			
 */
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				/*
				 *데이트형 자료를  to_char로 수정해서 받아서 출력하는 경우
				 */
//				String regidate = rs.getString("date_form1");
				
				/*
				 * 데이트형 자료를 문자열 형태(getString()메소드)로 받아서 출력하면 
				 * 2020-02-28 15:52:03 의 형태로 출력된다.
				 */
//				String regidate = rs.getString(4);
				
				/*
				 * 데이트형 자료를 getDate() 메소드로 받아와서 출력하면 
				 * 2019-08-12 형태로 출력된다 
				 */
				java.sql.Date regidate = rs.getDate(4);
				
//				데이트 자료 받아오는 방법: to_char로 수정해서 받는 방법, 그냥 문자열로 받는 방법, 그냥 데이트형으로 받는방법
				
				
				System.out.printf("%-8s %-8s %-8s %s %n", id, pw, name, regidate);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("@쿼리오류");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("@알 수 없는 오류 발생");
			e.printStackTrace();
		}finally {
			close();//자원반납
		}
		
	}
	/*
	 * resultSet 클래스
	 * select문 실행시 쿼리의 실행결과가 ResultSet 객체에 저장된다
	 * 결과로 반환된 레코드의 처음부터 마지막까지 next() 메소드를 통해 확인 후 반복하면서 추출하게 된다
	 * 
	 * getXXX()계열의 메소드
	 * 
	 * Oracle의 자료형이
	 * 	number 타입: getInt()
	 * 	char/varchar2 타입: getString()
	 * 	date 타입: getDate() 
	 * 메소드로 각 컬럼을 추출한다
	 * 
	 * 인자는 select절의 컬럼 순서대로 인덱스 값을 사용하거나 컬럼명, 별칭(alias)을 사용할 수 있다
	 * 단 자료형에 상관없이 모두 getString() 메소드로 추출할 수 있다.
	 * 
	 */
	public static void main(String[] args) {
		SelectSQL selectSQL = new SelectSQL(ORACLE_URL, "korea","1234");
		selectSQL.execute();
	}

}
