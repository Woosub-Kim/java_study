package ex16collection;
class Apple{
	int weight;
	public Apple(int weight) {
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("사과 무게: "+weight);
	}
}
class Banana{
	int sugar;
	public Banana(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("바나나 당도: " + sugar);
	}
}
//오렌지 객체만 담을 수 있는 오렌지 전용 박스를 표현한 클래스
class GenericFruitBox<T>{
	T item;
//저장 담기를 표현한 메소드	
	public void store(T item) {//사실상 getter setter
		this.item =item;
	}
//꺼내기를 표현한 메소드
	public T pullOut() {
		return item;
	}
}
//기존 Object클래스 기반의 FruitBox를 위와 같이 제네릭 클래스로 변경할 수 있다
//자료형에 해당하는 부분을 대표분자 T로 교체하고
//객체생성시 자료형을 결정하기 휘해 클래스명 <T>로 수정
//  class FruitBox{
//	Object item;
//	public FruitBox(Object item) {
//		this.item =item;
//	}
//	public void store(Object item) {
//		this.item =item;
//	}
//	public Object pullOut() {
//		return item;
//	}
public class GenericClass {

	public static void main(String[] args) {
//각 객체 생성시 T부분을 해당 객체로 설정하므로 구현의 편의성이 보장된다.
//제네릭 클래스 기반으로 Apple박스 생성
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
//제네릭 클래스 기반으로 Banana박스 생성		
		GenericFruitBox<Banana> bBox = new GenericFruitBox<Banana>();
		bBox.store(new Banana(10));
		Banana banana = bBox.pullOut();
		banana.showInfo();
//Orange박스를 생성하는 경우 T를 Orange타입으로 결정했으므로 다른 객체는 저장할 수 없다
//즉 컴파일오류가 발생되어 자료형에도 안전한 클래스가 된다
//		GenericFruitBox<Orange> oBox = new GenericFruitBox<Orange>();
//		oBox.store("나는 오렌지"); 컴파일에러
//		oBox.store(apple);
//		oBox.store(banana);
	}

}
