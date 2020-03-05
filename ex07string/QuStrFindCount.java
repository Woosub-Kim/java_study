package ex07string;

public class QuStrFindCount {

	public static void main(String[] args) {
		/*아래 조건을 충족하는 메소드를 작성하시오.
		-메서드명 : strCount
		-기능 : 주어진 문자열에 찾으려는 문자열이 몇 번 나오는지 반환한다.
		-메인메소드 호출문장	
			public static void main(String[] args) {
				System.out.println(strCount("12345AB12AB345AB","AB"));
				System.out.println(strCount("12345","AB"));
			}
		-실행결과
			문자열 12345AB12AB345AB 에서 AB의갯수 : 3
			문자열 12345 에서 AB의갯수 : 0

		힌트] indexOf(찾을문자열, 시작인덱스(fromIndex))*/
		System.out.println(strCount("12345AB12AB345AB","AB"));
		System.out.println(strCount("12345","AB"));
		
		System.out.println("000000");
		
		System.out.println(strCount1("12345AB12AB345AB","AB"));
		System.out.println(strCount1("12345","AB"));
		
		System.out.println(strCount2("12345AB12AB345AB","AB"));
		System.out.println(strCount2("12345","AB"));

	}
	
	static int strCount(String str, String target) {
		String strModified = "NN"+str+"MM";
		
		String[] splitResult = strModified.split(target);
		return splitResult.length - 1;
	}
	
	
	
	static StringBuffer strCount1(String compStr, 
			String findStr) {
		int strCount=0;
		StringBuffer sb = new StringBuffer(
				String.format("문자열 "+ compStr 
						+" 에서 "+ findStr +"의갯수:")
			);		
				
		while(true) {
			int findIdx = compStr.indexOf(findStr);
			if(findIdx!=-1) {
				int nextIdx = findIdx + findStr.length();
				//System.out.println(findIdx +"-"+ nextIdx);
				compStr = compStr.substring(nextIdx);				
				//System.out.println(compStr);
				strCount ++;
			}
			else 
				break;	
		}
		return sb.append(strCount);
	}
	
	static int strCount2(String str, String target) {
	
		int count = 0;
		while(true) {
			int index = str.indexOf(target);
			if(index<0) {
				//System.out.println(index);
				break;
			}
			else {
				//System.out.println(index);
				str = str.substring(index+target.length());
				count++;}
		}
		
		//System.out.println(str);
		return count;
	}

}
