package ex05method;

import java.util.Scanner;

public class MethodType02_2 {

	static String getHakjum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math)/3.0;
		String hakjum;
		int result = (int)avg / 10;//핵심포인트
		/*
		 *10으로 나누는 이유는 나눈 몫을 통해 학점의 구간을 구하기 위함이다.
		 *93/10 = 9
		 *99/10 = 9
		 *10으로 나눈 몫이 점수의 구간이 된다.
		 */
		switch(result) {
		case 10: case 9:
			hakjum = "A학점"; break;
		case 8:
			hakjum = "B학점"; break;
		case 7:
			hakjum = "C학점"; break;
		case 6:
			hakjum = "D학점"; break;
		default:
			hakjum = "F학점";
		}
		return hakjum;
	}
	public static void main(String[] args) {
		System.out.println("너의 학점은" + getHakjum());
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);
		
		
		
		
		
		
		
	}

}
