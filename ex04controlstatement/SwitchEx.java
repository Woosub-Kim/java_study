package ex04controlstatement;

import java.util.Scanner;

public class SwitchEx {
/*
 switch문: if문처럼 조건에 따라 분기하는 제어문
 형식
 switch(정수식 or 산술식){
 	case 값1:
 		실행문; break;
 	case 값2:
 		실행문; break;
 	default:
 		실행문; break; else와 유사. 위 조건 위배시
 }
 
 break문 만나면 문장 탈출
 */
	public static void main(String[] args) {
		//Scanner클래스: JDK5.0 추가된 클래스. 키보드를 통해 사용자로부터 값을 입력받을 때 사용
		//nextInt() 정수입력
		//nextLine() 문자열 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는: " + iNum);
		/*
		 만약 switch문에 break문을 사용하지 않으면 그 아래에 있는 문장들이 실행되므로 주의해야 한다. 
		 입력받는 수가 만약 9라면 세문장 모두가 출력된다.  
		 */
		int remain = iNum % 3;
		switch(remain) {
		case 0:
			System.out.println("나머지는 0");
			break;
		case 1:
			System.out.println("나머지는 1");
			break;
		default:
			System.out.println("나머지는 2");
		}
		
		/*
		 *여러가지 케이스를 동시에 처리할 때에는 아래와 같이 break없이 case를 나열한다. 
		 *if문의 or와 유사. 
		 */
		
		int season = 10;
		switch(season) {
			case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8: case 9:
				System.out.println("여름");
				break;
			case 10: 
				System.out.println("가을");
				break;
			default:
				System.out.println("겨울");
		}
		
		String str = "자바";
		switch(str) {
			case "자바":
				System.out.println("자바 굿");
				break;
			case "오라클":
				System.out.println("오라클 굿");
		}
		
		
		long lng = 10;
		
		/*
		switch사용시 주의점
		1. long타입 변수 사용불가 byte, short, int, char, String만 사용
		  
		switch(lng) { long 사용불가
		case 10:
			System.out.println("long타입 몁수는?");
			break;
		case 20:
			System.out.println("안되네");
		}
		switch(iNum%3 == 0) {논리식도 안됨
		}
		2.비교식이나 논리식 사용불가.
		*/
		
	}

	

}
