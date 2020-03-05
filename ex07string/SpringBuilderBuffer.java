package ex07string;
/*
 *StringBuffer 클래스
 *String클래스는 내부 메소드를 이용햐서 새로운 문자열을 생성하면 원래 문자열은 변하지 않고 
 *새롭게 생성된 메모리에 문자열 저장된다.
 *StringBuffer클래스 사용하면 해당 클래스는 새로운 메모리를 사용하지 않고 
 *기존 메모리를 변경하여 문자열 변경을 수행한다.
 */
public class SpringBuilderBuffer {

	public static void main(String[] args) {
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strbuf: " + strBuf);
		
		strBuf.insert(2,false);
		strBuf.insert(strBuf.length(), 'z');
		System.out.println("strbuf: " + strBuf);
		int index = strBuf.indexOf("A");
		strBuf.deleteCharAt(index);
	
		System.out.println(strBuf);
		
		/*
		int k =30;
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
		for(int i=k-1; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
		*/
	
	}
	
	
	

}
