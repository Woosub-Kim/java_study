//자바파일의 구조
/*
1. 패키지선언부: 클래스를 종류별로 묶어서 관리하기위한 선언으로 디렉토리(폴더)의 의미로 이해하면 된다 
 */
/*
2. import 선언부: 내가 만든 믈래스에서 필요한 자바클래스를 가져다 쓰기 위한 선언으로 JDK에서 제공하는 클래스를 사용할 수도 있다.
 */
/*
3. 클래스 선언부: 자바프로그램은 클래스단위로 구성되므로 기본적으로 필요항 부분이다. 클래스명은 항상 영대문자로 시작하고, 파일의 확장자는 .java로 해야한다.
 */
package ex01javastart;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaStruct {

	public static void main(String[] args) {
/*
주석은 컴파일러가 코드로 인식하지 않는 부분으로 블럭단위 주석과 라인단위 주석이 두가지가 있다.
블럭단위 주석은 / * ~~ * / 형태로 사용한다.
*/		
//한줄짜리 주석은 슬러쉬 두개응 연딜이 사용힌디.
		
	System.out.println("자바의 간략한 구조 ");
	
	Date toDayOfDate = new Date();
	
	System.out.println("오늘날자:" + toDayOfDate);
	SimpleDateFormat Simple=
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = Simple.format(toDayOfDate);
		System.out.println("변경된 날짜" + toDayString);
	}

}
