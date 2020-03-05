package ex14usebasicclass;



class CitizenRegistered{
	private String joominNum;
	
	private Integer birthdayFull;
	private Integer birthMonth;
	private Integer birthYear;
	private Integer birthDate;
	private Integer gender;
	private Integer birtDecade;
	public CitizenRegistered(String joominNum) {
		this.joominNum = joominNum;
		this.birthdayFull = Integer.parseInt(joominNum.substring(0,6)); 
		this.birthMonth = Integer.parseInt(joominNum.substring(2,4)); 
		this.birthYear = Integer.parseInt(joominNum.substring(0,2)); 
		this.birtDecade = Integer.parseInt(joominNum.substring(0));
		this.birthDate = Integer.parseInt(joominNum.substring(4,6)); 
		this.gender = Integer.parseInt(joominNum.substring(6)); 
		
	}
	public String getJoominNum() {
		return joominNum;
	}
	public void validNum() {
		boolean g1 = birtDecade==0||birtDecade==1 && (gender ==3||gender==4);
		boolean g2 = birtDecade!=0&&birtDecade!=1 && (gender ==1||gender==2);
		boolean m1 = (birthMonth == 1||birthMonth==3||birthMonth==5||birthMonth==7||birthMonth==8||birthMonth==10|birthMonth==12)&&birthDate>=1&&birthDate<=31;
		boolean m2 = (birthMonth == 4||birthMonth==6||birthMonth==9||birthMonth==11)&&birthDate>=1&&birthDate<=30;
		boolean m3 = birthMonth==2&&birthDate>=1&&birthDate<=28;
		
		
		if((g1||g2)&&(m1||m2||m3)) {
			System.out.println("유효한 주민번호");
		}
		else {
			System.out.println("잘못된 주민번호");
		}
		
	}
	
}






public class Practice {

	public static void main(String[] args) {
		CitizenRegistered cr1 = new CitizenRegistered("940126-1888889");
		CitizenRegistered cr2 = new CitizenRegistered("940196-1888889");
		CitizenRegistered cr3 = new CitizenRegistered("000126-1888889");
		CitizenRegistered cr4 = new CitizenRegistered("940126-3888889");
		CitizenRegistered cr5 = new CitizenRegistered("000126-4888889");
		CitizenRegistered cr6 = new CitizenRegistered("000230-4888889");
		CitizenRegistered cr7 = new CitizenRegistered("000200-4888889");
		
//		cr1.validNum();
//		cr2.validNum();
//		cr3.validNum();
//		cr4.validNum();
//		cr5.validNum();
//		cr6.validNum();
//		cr7.validNum();
		
	}

}
