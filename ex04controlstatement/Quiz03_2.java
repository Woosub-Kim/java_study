package ex04controlstatement;

import java.util.Scanner;

public class Quiz03_2 {
	
	public static void main(String[] args) {
	    /*
	     사욜할 층을 사용자로부터 입력받아 출력하기
	     */
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("출력할 층수");
	     final int FLOOR = scanner.nextInt();//층을 나태내는 상수
	     
		for(int i=1;i<= FLOOR;i++){
	      for(int j=1;j<=FLOOR+1-i;j++){
	    	  System.out.print("* ");	       
	      }
	      System.out.println();
	    }	    
	  }
}
