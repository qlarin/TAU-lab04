package lab04.zad1;

public class Calculator {

	private int left;
	private int right;
	private Object result;

	public void setLeft(int l) {
		left = l;
	}

	public void setRight(int r) {
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
