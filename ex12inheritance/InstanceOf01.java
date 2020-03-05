package ex12inheritance;
/*
 * instanceof: 연산자
 * 객체변수가 어떤 타입의 변수인지 판단하는 연산자로 형변환(상속관계) 가능하면 true 아니면 false반환
 * 객체가 형변환이 되려면 반드시 두 클래스 사이에 상속관계가 있어야 한다.
 */

class Box{
	public void boxWrap() {
		System.out.println("Box  wrapped");
	}
	
}
class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("Paper Box  wrapped");
	}
	
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("Golden Paper Box  wrapped");
	}
}

public class InstanceOf01 {
	/*
	 * 해당 함수에서 instanceof연산자를 통해  형변환 가능여부를 판단하고 있는 이유는 전달된
	 * 매개변수를 최상위 클래스 Box타입으로 받고있기 때문이다.
	 * Box타입으로 매개변수를 전달받게되면 자동으로 업케스팅이 되므로 자식객체 메소드를 호출하기 위해서는 
	 * 다운캐스팅-명시적 형전환이 필요하다
	 * 따라서 전달된 매개변수가 각 객체타입으로 형변환이 가능한지 판단한 후 다운캐스팅을 진행하고
	 * 해당메소드를 호출한다.
	 */
	
	static void wrapBox(Box b) {
		int num1 = (int)1.0;
		double num2 = 1;
		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();//다운캐스팅 명시적 형 변환
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
		
	}
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);//Box
		wrapBox(box2);//PaperBox
		wrapBox(box3);//GoldPaperBox
		
		
	}

}
