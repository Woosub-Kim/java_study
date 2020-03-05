package ex08class;
//판매자 정의한 클래스
class FruitSeller2{
	int numOfApple; //판매자 사과 보유 갯수
	int myMoney;      //판매자 수익금.
	int apple_price;//1차버전에서는 상수였던 단가를 2차버전에서는 변수로 변경
	//상수의 경우에는 단 한번만 초기화되는 특성상 언제든 초기화할수 있는 초기화메소드로 초기화할 수 없다.
	/*
	 *사과의 단가
	 *일반적으로 프로그램 내에서 단가 같은 경우는 상수형태로 선언하는 것이 일반적이다. 
	 *값이 변할 수 없으므로 초기화 이후 값을 변경하려고 하면 에러가 발생한다. 
	 */
	
	/*
	 *사과 판매를 위한 멤버메소드
	 *1. 매개변수를 통해 금액을 받는다.
	 */
	public int saleApple(int money) {
		int num = money/apple_price; //2. 금액에 해당하는 사과갯수구하기
		numOfApple -= num;//3. 사과갯수 차감
		myMoney += money;//4. 판매수익금 증가
		return num;//8.호출한 지점(구매자)에 반환		
	}
	/*
	 * 1차 버전에서는 멤버변수 초기화가 고정값이었다면 
	 * 2차버전에서는 초기화 메소드를 통해 멤버변수를 초기화한다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);	
	}
}

class FruitBuyer2{
	int myMoney;//구매자 보유금액
	int numOfApple;//구매한 사과갯수
	
	/*
	 사과를 구매하는 행위를 표현한 메소드
	 1. 판매자에 금액지불(매개변수) 
	 */
	public void buyApple(FruitSeller2 seller, int money) {
		/*
		 * 2.판매자가 금액에 해당하는 사과 갯수를 반환하면 
		 * 그 값을 통해 보유한 사과의 갯수를 증가시킨다.
		 */
		numOfApple += seller.saleApple(money);
		//3. 판매자에게 지불한 금액만큼 보유금액 차감
		myMoney -= money;	
	}
	/*
	 * 초기화메소드
	 * 멤버변수를 초기화할 때 사용된다. 2차버전에서는 생성자대신 사용되고 있다.
	 */
	public void initMembers(int MyMoney, int NumOfApple) {
		myMoney = MyMoney;
		numOfApple = NumOfApple;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과 갯수: " + numOfApple);		
	}
}


public class FruitSalesMain2 {

	public static void main(String[] args) {
		
		
		
		
		FruitSeller2 seller1 = new FruitSeller2();//판매자 객체
		seller1.initMembers(0, 100, 1000);
		
		FruitSeller2 seller2 = new FruitSeller2();//판매자 객체
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();//구매자 객체
		buyer.initMembers(10000,0);
		
		System.out.println("구매행위 이전 상태");
		
		
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 *구매자가 판매자1,2에게 5000원 지불하고 사과를 구매하는 행위를 코드로 표현
		 */
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위 이후 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
