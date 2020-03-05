package ex18jdbc.prepared;

import java.sql.SQLIntegrityConstraintViolationException;

import ex18jdbc.connect.IconnectImpl;

public class DeleteSQL extends IconnectImpl{
	@Override
	public void execute() {
		try {
			//1. DB연결
			connect("korea", "1234");
			//2. 쿼리 작성 query
			String query = " DELETE FROM member WHERE id = ? ";
			//3. query를 인자로 prepared 객체 psmt 생성 
			psmt = con.prepareStatement(query);
			//4. 인파라미터 생성
			psmt.setString(1, scanValue("삭제할 아이디"));
			//5. 결과값 반환/출력
			System.out.println(psmt.executeUpdate()+"개 행이 삭제되었습니다.");
			
		} catch (SQLIntegrityConstraintViolationException e) {
			// TODO: handle exception
			System.out.println("들어올 땐 마음대로였지만 나갈 땐 아니란다.");
		}catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			close();
		}
	
	}
	
	public static void main(String[] args) {
		new DeleteSQL().execute();
		
	}

}
