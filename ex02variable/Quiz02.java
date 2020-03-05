package ex02variable;

public class Quiz02 {

  public static void main(String[] args) {
    // 연산결과 double 자료형 변환 필요.
	int rad = 10;
    int area_int = (int)(3.14*rad*rad);
    float area_float = (float)(3.14 *rad*rad);
    double area_double = 3.14*rad*rad;
    
    System.out.println("integer area "+area_int);
    System.out.println("float area "+area_float);
    System.out.println("doubble area "+area_double);

  }

}
