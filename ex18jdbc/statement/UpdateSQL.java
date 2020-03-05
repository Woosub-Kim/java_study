package ex18jdbc.statement;

import java.sql.SQLException;

import ex18jdbc.connect.IconnectImpl;

public class UpdateSQL extends IconnectImpl {

	public UpdateSQL(String user, String pass) {
		super(user, pass);
	}
	
	@Override
	public void execute() {
		
		
		try {
			stmt = con.createStatement();
			String sql = 
					" UPDATE member SET pass = '2222' " +
					" WHERE id = 'test2' ";
			//디버깅 위한 쿼리문 출력
			System.out.println("!!입력sql:  " + sql+ ";   !!");
			int affected = stmt.executeUpdate(sql);
			System.out.println("!! " +affected+"개 행이 업데이트 됨!!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("@쿼리오류");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("@알 수 없는 오류 발생");
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	public static void main(String[] args) {
		new UpdateSQL("korea", "1234").execute();
	}

}
