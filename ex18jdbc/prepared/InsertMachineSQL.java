package ex18jdbc.prepared;

import java.util.Scanner;

import ex18jdbc.connect.IconnectImpl;

public class InsertMachineSQL extends IconnectImpl {

	public InsertMachineSQL() {
		super(ORACLE_URL, "korea", "1234");
	}
	@Override
	public void execute() {
		try {
			String query = "INSERT INTO uselessText(WRID, TITLE, CONTENT, ID) VALUES (?,?,?,?)";
			psmt = con.prepareStatement(query);
			int affected;
			for (int i = 151; i <= 400; i++) {	
				psmt.setInt(1, i);
				psmt.setString(2, "심심해서 도배한다"+i);
				psmt.setString(3, "제곧내");
				psmt.setString(4, "test3");
				affected = psmt.executeUpdate();
				System.out.println(affected +"개 행이 입력됨");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public static void main(String[] args) {
		
		new InsertMachineSQL().execute();
	}

}
