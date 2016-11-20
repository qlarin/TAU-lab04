package lab01.zad3;

public class LiczbaRzymska {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public LiczbaRzymska(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		String result = "";
		if (this.number <= 0 || this.number > 2999) {
			throw new IllegalArgumentException("Invalid number value");
		} else {
			while (this.number >= 1000) {
				result += "M";
				this.number -= 1000;
			}
		    while (this.number >= 900) {
		    	result += "CM";
		        this.number -= 900;
		    }
		    while (this.number >= 500) {
		    	result += "D";
		        this.number -= 500;
		    }
		    while (this.number >= 400) {
		    	result += "CD";
		        this.number -= 400;
		    }
		    while (this.number >= 100) {
		    	result += "C";
		        this.number -= 100;
		    }
		    while (this.number >= 90) {
		    	result += "XC";
		        this.number -= 90;
		    }
		    while (this.number >= 50) {
		    	result += "L";
		        this.number -= 50;
		    }
		    while (this.number >= 40) {
		    	result += "XL";
		        this.number -= 40;
		    }
		    while (this.number >= 10) {
		    	result += "X";
		        this.number -= 10;
		    }
		    while (this.number >= 9) {
		    	result += "IX";
		        this.number -= 9;
		    }
		    while (this.number >= 5) {
		    	result += "V";
		        this.number -= 5;
		    }
		    while (this.number >= 4) {
		    	result += "IV";
		        this.number -= 4;
		    }
		    while (this.number >= 1) {
		    	result += "I";
		        this.number -= 1;
		    }    
		}
		return result;
	}
}
