package ex09package.korea.seller;

//판매자클래스
public class FruitSeller4{
	int numOfApple; //판매자 사과 보유 갯수
	int myMoney;      //판매자 수익금.
	final int APPLE_PRICE;
	 
	/*
	 * 상수는 딱 한번만 초기화가 되므로 일반적인 메소드에서는 초기화 할 수 없다. 
	 * 단 생성자메소드에서는 초기화가 가능하다. 생성자 역시 딱 한번만
	 * 호출 되고, 임의로 호출할 수 없기 때문이다. 
	 */
	
	//판매 위한 멤버메소드
	public int saleApple(int money) {
		int num = money/APPLE_PRICE; 
		numOfApple -= num;
		myMoney += money;
		return num;	
	}
	/*
	 * 1차 버전에서는 멤버변수 초기화가 고정값이었다면 
	 * 2차버전에서는 초기화 메소드를 통해 멤버변수를 초기화한다.
	 */
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);	
	}
}




