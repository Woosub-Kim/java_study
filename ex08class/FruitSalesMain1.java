package ex08class;
//판매자 정의한 클래스
class FruitSeller{
	int numOfApple = 100; //판매자 사과 보유 갯수
	int myMoney = 0;      //판매자 수익금.
	final int APPLE_PTICE = 1000;
	/*
	 *사과의 단과
	 *일반적으로 프로그램 내에서 단가 같은 경우는 상수형태로 선언하는 것이 일반적이다. 
	 *값이 변할 수 없으므로 초기화 이후 값을 변경하려고 하면 에러가 발생한다. 
	 */
	
	/*
	 *사과 판매를 위한 멤버메소드
	 *1. 매개변수를 통해 금액을 받는다.
	 */
	public int saleApple(int money) {
		int num = money/APPLE_PTICE; //2. 금액에 해당하는 사과갯수구하기
		numOfApple -= num;//3. 사과갯수 차감
		myMoney += money;//4. 판매수익금 증가
		return num;//8.호출한 지점(구매자)에 반환		
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);	
	}
}

class FruitBuyer{
	int myMoney = 5000;//구매자 보유금액
	int numOfApple = 0;//구매한 사과갯수
	
	/*
	 사과를 구매하는 행위를 표현한 메소드
	 1. 판매자에 금액지불(매개변수) 
	 */
	public void buyApple(FruitSeller seller, int money) {
		/*
		 * 2.판매자가 금액에 해당하는 사과 갯수를 반환하면 
		 * 그 값을 통해 보유한 사과의 갯수를 증가시킨다.
		 */
		numOfApple += seller.saleApple(money);
		//3. 판매자에게 지불한 금액만큼 보유금액 차감
		myMoney -= money;	
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과 갯수: " + numOfApple);		
	}
}

public class FruitSalesMain1 {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();//판매자 객체
		FruitBuyer buyer = new FruitBuyer();//구매자 객체
		System.out.println("구매행위 이전 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 *구매자가 판매자에게 5000원 지불하고 사과를 구매하는 행위를 코드로 표현
		 */
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위 이후 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
