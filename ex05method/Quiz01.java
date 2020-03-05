package ex05method;

import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("반지름 입력");
    double radius = scanner.nextDouble();
	System.out.println("Area:"+radius+" =>" + circleArea(radius));
    System.out.println("Round:" + radius + " =>"+circleRound(radius));
  }
  
  static double circleArea(double rad){//원의 넓이 반환하는 메소드
    return 3.14*rad*rad;
  }
  
  static double circleRound(double rad){//원의 둘레를 반환하는 메소드
    return  2*3.14*rad;
  }
}
