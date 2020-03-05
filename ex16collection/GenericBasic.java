package ex16collection;
//오렌지를 표현하는 클래스
class Orange{
	int sugar;//오렌지의 당도 표현
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("오랜지 당도: " + sugar);
	}
}
//오렌지 객체만 담을 수 있는 오렌지 전용 박스를 표현한 클래스
class OrangeBox{
	Orange item;
//저장 담기를 표현한 메소드	
	public void store(Orange item) {//사실상 getter setter
		this.item =item;
	}
//꺼내기를 표현한 메소드
	public Orange pullOut() {
		return item;
	}
}
//과일상자 Object클래스를 기반으로 하므로 모든 객체를 저장할 수 있는 클래스
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item =item;
	}
	public void store(Object item) {
		this.item =item;
	}
	public Object pullOut() {
		return item;
	}
}

public class GenericBasic {

	public static void main(String[] args) {		
		OrangeBox oBox1 = new OrangeBox();//오렌지 박스 생성
		Orange orange1 = new Orange(10);//오렌지 생성
		oBox1.store(orange1);//상자1에 오렌지1 저장
		orange1 = oBox1.pullOut();
		orange1.showInfo();//오렌지1의 정보확인
//상자1은 오렌지전용 박스이므로 다른과일 즉 다른객체를 저장할 수 없다. 컴파일에러가 발생하므로 실행 자체가 불가하다				

//		oBox1.store("당도가 20인 오렌지"); 컴파일에러 발생		

//		Orange orange2 = oBox1.pullOut();
//		orange2.showInfo();
//상자1은 Orange객체만 저장할 수 있으므로 자료형에는 안전하나 구현에는 불편하다 즉 추가로 사과를 저장해야 한다면
//그에 해당하는 클래스를 계석해서 정의해야 한다.
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();		

//		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");//형변환예외

//		Orange orange4 = (Orange)fBox2.pullOut();
//		orange4.showInfo();
//Object기반의 FruitBox는 자료형에 대해서 편리함이 있으나 코드레벨에서는 오류가 발생하지 않지만 실행시
//예외가 발생한다. 오류는 컴파일에러보다 문제해결이 어렵다는 특징이 있다.
				
	}

}
