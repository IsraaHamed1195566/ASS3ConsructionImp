package MainDriver;

import Interfaces.Operation;
import Models.CheckOperation;
import Models.Equation;
import Models.Subsrtraction;
import Models.Sum;

public class Calculate {

	public static void main(String[] args) {
		Equation equ = new Equation(1, 2, '+');
		CheckOperation checkOperation = new CheckOperation();
		checkOperation.knowOperatorType(equ.getOp());
		Operation operation = null;
		if (checkOperation.isCheckSubstract()) {
			operation = new Subsrtraction();
		} else if (checkOperation.isCheckSum()) {
			operation = new Sum();

		}
		if (operation != null) {
			operation.doTheOperation(equ.getNum1(), equ.getNum2());
			operation.printTheResult(equ);
		}else {
			System.out.println("Ohh your Operator is not added");
		}
	}

}
