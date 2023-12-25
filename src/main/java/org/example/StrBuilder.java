


public class StrBuilder {
	static char[] ALL = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	static char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	static char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	
	char[] result;
	char[] charSet;
	
	public StrBuilder(char[] charSet, int size) {
		this.result = new char[size];
		this.charSet = charSet;
	}
	
	public void increment() {
		for(int i = 0;; i++) {
			this.result[i]++;
			if(this.result[i] > charSet.length) {
				this.result[i] = 1;
			} else {
				break;
			}
		}
	}
	
	public char[] getReversed() {
		char[] result = new char[this.result.length];
		int ptr = 0;
		for(int i = this.result.length - 1; i >= 0; i--) {
			if(this.result[i] != 0) {
				result[ptr] = charSet[this.result[i] - 1];
				ptr++;
			}
		}
		return result;
	}
	
	public char[] get() {
		char[] result = new char[this.result.length];
		for(int i = 0; i < this.result.length; i++) {
			if(this.result[i] != 0) {
				result[i] = charSet[this.result[i] - 1];
			}
		}
		return result;
	}
	
	public void set(String data) throws Exception {
		if(data.length() > this.result.length) {
			throw new Exception("Given string is bigger than configured buffer size");
		}
		
		for(char el: data.toCharArray()) {
			boolean flag = true;
			for(char let: this.charSet) {
				if(let == el) {
					this.result[data.indexOf(el)] = (char) new String(this.charSet).indexOf(let);
					flag = false;
					break;
				}
			}
			if (flag) {
				throw new Exception("Given string doesnt match the configured charset");
			}
		}
	}
	
}
