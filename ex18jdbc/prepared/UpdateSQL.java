package ex18jdbc.prepared;

import ex18jdbc.connect.IconnectImpl;

public class UpdateSQL extends IconnectImpl{
	public UpdateSQL() {
		super(ORACLE_URL, "korea", "1234");
	}
	
	@Override
	public void execute() {
		//1.쿼리 생성
		String sql = 
			"UPDATE member SET name = ?, pass = ?  WHERE id = ?";
		
		try {
//			2. 객체생성
			psmt = con.prepareStatement(sql);
//			3. exit 입력 전까지는 무한 반복
			while (true) {
//				4. 인파라미터 설정
				psmt.setString(3, scanValue("아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("비밀번호"));
//				5. 쿼리실행 및 값 반환
				int affected = psmt.executeUpdate();
				System.out.println(affected+"개 행이 업데이트 되었습니다.");
			}
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateSQL().execute();
		
	}

}
