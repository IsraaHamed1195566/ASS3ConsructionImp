package Models;

public class CheckOperation {
	private boolean checkSum = false;
	private boolean checkSubstract = false;

	public void knowOperatorType(char op) {
		if (op == '+') {
			checkSum = true;
			checkSubstract = false;
		} else if (op == '-')  {
			checkSum = false;
			checkSubstract = true;
		}

	}

	public boolean isCheckSum() {
		return checkSum;
	}


	public boolean isCheckSubstract() {
		return checkSubstract;
	}


}
