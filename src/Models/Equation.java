package Models;

public class Equation {
	private int num1=0;
	private int num2=0;
	private char op='\0';
	
	
	public Equation(int num1, int num2, char op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return getNum1() +" "+ getOp()+" "+getNum2()+ " =";
	}
}
