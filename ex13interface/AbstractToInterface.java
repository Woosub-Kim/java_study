package ex13interface;

//abstract class PersonalNumberStorage {
//	public abstract void addPersonalInfo(String juminNum, String name); 
//	public abstract String searchPersonalInfo(String juminNum); 
//}	
interface PersonalNumberStorage {
	void addPersonalInfo(String juminNum, String name); 
	String searchPersonalInfo(String juminNum); 
}
//위 추상 클래스를 인터페이스로 변경하려면 
//abstract class -> interface로 변경
//메소드의 경우 public abstract 생략가능
//변수의경우 문조건 public static final (생략가능)

class PersonalNumInfo{
	
	private String name;
	private String juminNum;
	
	public PersonalNumInfo(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}

	public String getName() {return name;}
	public String getJuminNum() {return juminNum;}
	
}
//추상클래스를 "상속"하여 클래스를 정의한다.
//클래스가 클래스를 상속할 때 "extends" 사용한다.
//class PersonalNumberStorageImpl extends PersonalNumberStorage{

class PersonalNumberStorageImpl implements PersonalNumberStorage{
//클래스가 인터페이스를 상속할 때 "implements"사용하고 "구현"이라 표현	
	PersonalNumInfo[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalNumInfo[arrSize];
		numOfPerInfo = 0;
	}
//부모 클래스에 정의된 추상메소드를 오버라이딩 하여 재정의
	@Override
//이름과 주민번호를 전달받아 객체 생성후 객체배열에 정보를 저장	
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalNumInfo(name, juminNum);
		numOfPerInfo++;
	}

	@Override
	public String searchPersonalInfo(String juminNum) {
//주민등록번호를 매개변수로 받아 정보를 검색한 후 일치하는 경우 이름 반환
//루프는 입력된 정보의 갯수만큼
		for (int i = 0; i < numOfPerInfo; i++) {
			if (juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}			
		}
		return null;
	}
	public static void easterEgg() {
		System.out.println("다음에도 저희회사를 찾아주세요");
	}
}
public class AbstractToInterface {

	public static void main(String[] args) {
		
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(10);
		
		storage.addPersonalInfo("901234", "AAA");
		storage.addPersonalInfo("911234", "ABA");
		
		System.out.println(storage.searchPersonalInfo("901234"));
		System.out.println(storage.searchPersonalInfo("911234"));
		System.out.println(storage.searchPersonalInfo("921234"));
		
		PersonalNumberStorageImpl.easterEgg();
	}

}
