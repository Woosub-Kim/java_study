package ex05method;

import java.util.Scanner;

public class MethodBasic {
	//simpleFunc
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	//menuPrint
	public static void menuPrint() {
		System.out.println("당신의 이름은?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
				
	}
	//namePrint
	public static void namePrint(String n) {
		System.out.println("제 이름은" + n +"입니다.");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int result = simpleFunc(1,2);//call simpleFunc>> 1,2 전달 >>호출지점으로 반환
		System.out.println("1과 2전달" + result);
		System.out.println("10r과 20 전달" + simpleFunc(10, 20));
		
		menuPrint();
		System.out.println("프로그램 종료");
		

	}
	
}


