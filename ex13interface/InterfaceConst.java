package ex13interface;

import java.util.Scanner;

public class InterfaceConst {

	public static void main(String[] args) {
		System.out.println("What is the day, today?");
		System.out.println(" MON=1, TUE=2, WED=3, THU=4");
		System.out.println("FRI=5, SAT=6, SUN=7");
		System.out.println("Choice!");
		
		Scanner scanner =new Scanner(System.in);
		int select = scanner.nextInt();
		
		switch (select) {
		case Week.MON:
			System.out.println("Monday deasese");
			break;
		case Week.TUE: case Week.WED:
			System.out.println("I want to go home!");
			break;
		case Week.THU: case Week.FRI:
			System.out.println("Totaly tired");
			break;
		default:
			System.out.println("Weekend");
			break;
		}
	}

}
