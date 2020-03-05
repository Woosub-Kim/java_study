package ex08class;

class Car{
	// static 정적 static으로 선언된 변수(상수)는 메소드에 미리 생성됨.
	//언제든 접근 가능
	//멤버 상수 선언
	public static final String AUTO = "자동";
	public static final String MANUAL= "수동";
	/*
	 *멤버변수 선언 
	 */
	String carGear = AUTO;
	String carModel;
	int carYear;
	Human owner;//소유주 표현
	  //Human 클래스에 기반하는 이름, 나이, 에너지 세 값을 필요로 한다.
	
	//멤버 메소드 정의
	void drive() {//Car클래스에 멤버변수로 Human객체가 선언되어 출력할 때에는 닷(.)연산자를 사용
		System.out.println(owner.name+"이(가) " + carModel + "을(를) 운전한다.");
	}
	
	/*
	 *객체의 초기화를 담당하는 메소드로 아래는 항상 동일한 값으로만 초기환된다는
	 *단점을 가지고 있다.
	 */
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "Captain Rogers";
		owner.age = 30;
		owner.energy = 10;	
	}
	/*
	 *위와 동일한 이름으로 오버로딩에 의해 정의된 메소드로 다양한 매개변수를 통해 초기화 하는 것이 가능하다.
	 */
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;	
	}
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.println(carModel);
		System.out.println(carYear);
		System.out.println(carGear);
		System.out.println();
		owner.showState();
	}	
}//Car class end

public class CarMain {

	public static void main(String[] args) {
		//car1 생성
		Car car1 = new Car();
		System.out.println("[초기화 메소드 호출 전]");
		System.out.println(car1.owner);
		//car1.drive(); <=에러발생
		System.out.println("[초기화 메소드 호출 후]");
		/*객체 생성후 초기화하지 않은 상태에서 출력을 시도하면 
		 *NullPointerException 발생
		 */
		car1.initialize();//고정된 내용으로 초기화
		car1.drive();
		car1.showCarInfo();//객체 내용 출력
		//car2 객체생성 각 멤버변수에 접근하여 초기화
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "벤틀리";
		car2.carYear = 2018;
				
		car2.owner = new Human();
		car2.owner.name = "Tony Stark";
		car2.owner.age = 52;
		car2.owner.energy = 8;
			
		car2.showCarInfo();
		
		//car3 객체생성: 매개변수가 있는 초기화 메소드를 이용한 객체 초기화 가장 효율적
		Car car3 = new Car();
		car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();
		
		
		
		
	}

}
