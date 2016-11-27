package lab04.zad2;

public class Calculator {

	private double left;
	private double right;
	private Object result;

	public void setLeft(double l) {
		left = l;
	}

	public void setRight(double r) {
		right = r;
	}

	public Object getResult() {
		return result;
	}

	public void add() {
		result = left + right;
	}

	public void sub() {
		result = left - right;
	}

	public void multi() {
		result = left * right;
	}

	public void div() {
		result = left / right;
	}

	public void greater() {
		result = left > right;
	}
}
