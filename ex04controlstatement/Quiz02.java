package ex04controlstatement;

public class Quiz02 {

  public static void main(String[] args) {
    int i = 1;
    while(i<=5){
      int j=1;
      
      while(j<=5){
        if(j<=i){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
        j++;
      }
      System.out.println();//줄바꿈
      i++;
    }

  }

}
