package ex05method;

import java.util.Scanner;

public class Quiz02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("섭씨입력");
    int celius = scanner.nextInt();
    System.out.println("화씨입력");
    int fahrenheit = scanner.nextInt();
	
    System.out.printf("Celius %d=>%5.2f%n",celius, CeliusToFahrenheit(celius));
    System.out.printf("Fahrenheit %d=>%5.2f%n",fahrenheit,FahrenheitToCelius(fahrenheit));
  }
  
  static double CeliusToFahrenheit(double cel){
    return (double)(1.8 * cel + 32);
  }
  
  static double FahrenheitToCelius(double fah){
    return (fah-32)/1.8;
  }

}
