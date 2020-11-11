package Models;

import Interfaces.Operation;

public class Subsrtraction implements Operation {
	private int result=0;
	@Override
	public int doTheOperation(int num1, int num2) {
		return result=num1-num2;
	}

	@Override
	public void printTheResult(Equation equ) {
		System.out.println(equ.toString()+result);
	}

}
