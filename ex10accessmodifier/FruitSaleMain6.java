package ex10accessmodifier;

//과일 판매자를 정의한 클래스
class FruitSeller6{
	private int numOfApple; //판매자 사과 보유 갯수
	private int myMoney;      //판매자 수익금.
	private final int APPLE_PRICE;
	 
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
	public FruitSeller6(int money, int appleNum, int price) {
		 myMoney = money;
		 numOfApple = appleNum;
		 APPLE_PRICE = price;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);	
	}
}

class FruitBuyer6{
	private int myMoney;   //구매자 보유금액
	private int numOfApple;//보유한 사과갯수
	
	
	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;	
	}
	
	public FruitBuyer6(int MyMoney, int NumOfApple) {
		myMoney = MyMoney;
		numOfApple = NumOfApple;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과 갯수: " + numOfApple);		
	}
}


public class FruitSaleMain6 {

	public static void main(String[] args) {
		/*
		 * 생성자를 통해 객체생성과 동시에 초기화를 진행하므로 초기화메소드 호출없이 
		 * 객체를 생성할 수 있다.
		 */
		//보유액: 0원 사과: 100개 단가: 1000원
		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);
		//보유액: 0원 사과: 800개 단가: 500원
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);
		//구매자 보유액 10000 사과 0개
		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);
		
		//객체 초기상태 확인
		System.out.println("구매전 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 *멤버변수가 private으로 선언되었으므로 
		 *외부 클래스에서는 접근이 불가능하여 아래코드는 오류가 발생한다.
		 */
		
		//seller1.myMoney += 1000;//판매자1에 1000원 지불하고 
		//seller1.numOfApple -= 100;//사과 100개 구매
		
		//seller2.myMoney +=500;//판매자2에 500원 지불하고
		//seller2.numOfApple -= 90;//사과 90개 구매
		
		/*
		 * 판매자에게 각각의 금액을 지불하고, 금액에 해당하는 사과를 정상구매함
		 * 정보은닉을 통해 판매의 규칙이 지켜짐.
		 */
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 3000);
		
		System.out.println("구매 후 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
	}

}
