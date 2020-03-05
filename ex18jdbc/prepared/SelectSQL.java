package ex18jdbc.prepared;

import java.sql.SQLIntegrityConstraintViolationException;

import ex18jdbc.connect.IconnectImpl;

public class SelectSQL extends IconnectImpl{
	public SelectSQL() {
		// TODO Auto-generated constructor stub
		super("korea", "1234");
	}
	@Override
	public void execute() {
		try {
//			
			while (true) {
				String sql = 
						"SELECT * FROM member WHERE name like '%'||?||'%'";
//				부적합한 열 인덱스"SELECT * FROM member WHERE name like '%?%'";
				psmt = con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는사람 이름"));
				rs=psmt.executeQuery();
				while (rs.next()) {
					String id = rs.getString(1);
					String pass = rs.getString(2);
					String name = rs.getString(3);	
					String regidate = rs.getString(4).substring(0,10);
					
					System.out.printf("%-8s, %s, %-8s, %s %n",id,pass,name,regidate);
				}
			}
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
			close();
		}
	
	}
	
	public static void main(String[] args) {
		new SelectSQL().execute();
		
	}

}
