package ex09package.korea.buyer;

import ex09package.korea.seller.FruitSeller4;

//구매자 클래스
public class FruitBuyer4{
	int myMoney;   //구매자 보유금액
	int numOfApple;//보유한 사과갯수
	
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;	
	}
	
	public FruitBuyer4(int MyMoney, int NumOfApple) {
		myMoney = MyMoney;
		numOfApple = NumOfApple;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과 갯수: " + numOfApple);		
	}
}
