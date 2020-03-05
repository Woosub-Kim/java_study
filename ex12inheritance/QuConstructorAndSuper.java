package ex12inheritance;
/*
 *상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자. 
 *그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
*/

public class QuConstructorAndSuper {
	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar (10,20,30);
		hcar.showNowGauge();
		Car oldCar = new Car(50);
		oldCar.showNowGauge();
	}
	
}
	
class Car
{
       	int gasoline;
       	public Car(int gas) {	
			this.gasoline = gas;
			System.out.println("Car 생성자 호출");
		}

		public void showNowGauge()
       	{
     		System.out.println("남은가솔린:"+gasoline);        	
       	}
}
class HybridCar extends Car
{
       	int electric;
       	
       	public HybridCar(int gas, int elec) {
			super(gas);
			this.electric = elec;
			System.out.println("HybridCar생성자 호출");
		}
       	@Override
		public void showNowGauge()
       	{
       		System.out.println("남은가솔린:"+gasoline);
       		System.out.println("남은전기량:"+electric);       	
       	}
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	public HybridWaterCar(int gas, int elec, int wat){
			//멤버변수 water초기화 나머지 2개는 부모에게 전달
       		super(gas, elec);
			water = wat;
			System.out.println("HybridWaterCar생성자 호출");
		}
       	@Override
       	public void showNowGauge()
       	{
       		System.out.println("남은가솔린:"+gasoline);
       		System.out.println("남은전기량:"+electric);
       		System.out.println("남은워터량:"+water);
       	}
}