package ex04controlstatement;

public class Quiz02_1 {

	public static void main(String[] args) {
		final int FLOOR = 5;
		int i = 1;
	    while(i<=FLOOR){
	      int j=1;
	      
	      while(j<=i){
	        
	        System.out.print("* ");
	        j++;
	      }
	      System.out.println();//줄바꿈
	      i++;
	    }

	  }

}
