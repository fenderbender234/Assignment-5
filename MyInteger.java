/**
 * 
 * @author Josh Freeman
 *
 */

public class MyInteger {

	// instantiate variable of type int
	int value;
	
	/**
	 * 
	 * @return
	 */
	
	public int toInteger() {
		
		return value;
	}
	
	/**
	 * 
	 * @param value
	 */
	
	public MyInteger(int value) {
		
		this.value = value;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public int getValue() {
		
		return value;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isEven(int n) {
		
		return(n % 2 == 0);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isOdd(int n) {
		
		return !isEven(n);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isPrime(int n) {
		
		for(int m = 2; m < n / 2; m++) {
			
			if(n % m == 0) {
				
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isEven(MyInteger n) {
		
		return n.isEven();
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isOdd(MyInteger n) {
		
		return n.isOdd();
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean isPrime(MyInteger n) {
		
		return n.isPrime();
	}
	
	/**
	 * 
	 * @return
	 */
	
	public boolean isEven() {
		
		return isEven(value);
	}
	
	/**
	 * 
	 * @return
	 */
	
	public boolean isOdd() {
		
		return isOdd(value);
	}
	
	/**
	 * 
	 * @return
	 */
	
	public boolean isPrime() {
		
		return isPrime(value);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public boolean equals(int n) {
		
		return(value == n);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public boolean equals(MyInteger n) {
		
		return equals(n.getValue());
	}
	
	/**
	 * 
	 * @param s is a string
	 * @return
	 */
	
	public static int parseInt(String s) {
		
		return Integer.parseInt(s);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	
	public static int parseInt(char[] s) {
		
		return parseInt(new String(s));
	}
}