package ex10accessmodifier.cal;

import java.awt.color.CMMException;

public class Calculator {
	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();				
	}
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1, n2);		
	}
	public int subTwoNumer(int n1, int n2) {
		return subtractor.subTwoNumber(n1, n2);
	}
	public void showOperatingTimes() {
		System.out.println("덧셈횟수: " + adder.getCntAdd());
		System.out.println("뺄셈횟수: " + subtractor.getCntSub());		
	}
}

//덧셈연산
class Adder{
	private int cntAdd;
	public Adder(){
		cntAdd = 0;
	}
	public int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int n1, int n2) {
		cntAdd ++;
		return n1 + n2;
	}
}

//뺄셈연산
class Subtractor{
	private int cntSub;
	public Subtractor() {
		cntSub = 0;		
	}
	public int getCntSub() {
		return cntSub;
	}	
	public int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
}