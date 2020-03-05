package ex16collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {
//ArrayList: List계열의 컬렉션으로 데이터의 중복저장이 가능하다
//데이터의 저장순서를 보장한다
//데이터에 접근할 때 iterator혹은 get(index)를 사용한다
//Array라는 이름처럼 배열의 특성을 가지고 있어 index를 통한 입력과 접근이 가능하다
	public static void main(String[] args) {
//List계열의 컬렉션 객체 생성
//ArrayList<T>와 같이 컬렉션은 제네릭을 기반으로 하나
//<T>부분을 생략하면 모든 객체를 저장할 수 있다.(object클래스)
		ArrayList list = new ArrayList();
//add(객체)메소드 숮차적으로 저장하면서 인덱스는 0부터 자동으로 증가
//add(인덱스, 객체)인덱스를 직접 무여할 수 있으나 만약 인덱스을 건너뛰면 예외가 발생한다
//size() 현재 저장된 객체의 갯수를 반환
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3, "워너원");
//		list.add(5, "소방차"); 예외발생. 인덱스를 건너뛰었음
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄소년단");
		list.add(list.size(),"방탄소년단");
		System.out.println("중복저장전 객체수" + list.size());
//중복저장
//List는 배열의 속성을 가지므오 중복저장이 허용된다
//add()메소드로 boolean반환
		System.out.println(list.add("트와이스")?"중복저장됨": "중복저장안됨");
		System.out.println("중복저장후 객체수" + list.size());
//리스트 컬렉션 출력하기		
		System.out.println("\n일반for문 사용");
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i)+ " ");
		}
		System.out.println("\n확장for문 사용");
		for(Object object:list){
			System.out.print(object + " ");
		}
//반복자: 컬렉션에 저장된 내용을 Iterato에 알려주면서 객체를 생성항다
//hasNext()메소드로 출력할 객체가 있는지 확인
//next()로 객체출력
//더 출력할 객체가 없을때 false
		System.out.println("\n반복자 Iterator사용");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
//덮어쓰기
		System.out.println("---------------------------");
		list.set(4, "오마이걸>덮덮");
		for (Object object:list) {
			System.out.print(object + " ");
		}
		System.out.println("---------------------------");
//끼워넣기 add()메소드로 추가하게 되면 해당위치에 삽입되며 기존 데이터는 뒤로 밀려난다
		list.add(4, "블랙핑크>끼워");
		for (Object object:list) {
			System.out.print(object + " ");
		}
		System.out.println("---------------------------");
		
//존재유무 확인
//찾고자 하는 객체가 있을경우 true반환
		System.out.println(list.contains("빅뱅")?"빅뱅있다":"빅뱅없다");
		System.out.println(list.contains("플랙핑크")?"블랙핑크있다":"블랙핑크없다");
//삭제  객체의 위치를 찾은후 삭제
//방법1 인덱스로 삭제 해당인덱스의 객체가 삭제되면 뒷부분에 있던 객체들은 한칸씩 이동
		Object obj = list.remove(2);
		System.out.println("삭제된 객체" + obj);
//방법2 객체의 위치를 찾은 후 삭제	
//만약 동일한 객체가 있는 경우 앞쪽 먼저 삭제
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 인덱스" + index);
		list.remove(index);
//인스턴수 주소값을 통한 삭제
	
		System.out.println(list.remove("방탄소년단")?"삭제성공":"삭제실패");
		list.remove("오마이걸");
		System.out.println("삭제 후");
		for (Object object:list) {
			System.out.print(object + " ");
		}
		System.out.println();
//전삭
		list.removeAll(list);
		list.clear();
		System.out.println("전체 삭제후" + list.size());
		
		
		
	}

}
