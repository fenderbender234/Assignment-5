/**
 * 
 * @author Josh Freeman
 *
 */

public class RightTriangle {

	// instantiate variables
	double legA;
	double legB;
	
	// constructor sets legA and legB to 1
	public RightTriangle() {
		
		legA = 1;
		legB = 1;
	}
	
	/**
	 * 
	 * @param legA
	 * @param legB
	 * @throws IllegalArgumentException
	 */
	
	public RightTriangle(double legA, double legB) throws IllegalArgumentException {
		
		if(legA <= 0 || legB <= 0) {
			
			throw new IllegalArgumentException("Triangle legs must not be negative.");
		}
		this.legA = legA;
		this.legB = legB;
	}
	/**
	 * if legA is less than or equal to 0 throw exception
	 * set legA
	 * @param legA
	 * @throws IllegalArgumentException
	 */
	
	public void setLegA(double legA) throws IllegalArgumentException {
		
		if(legA <= 0) {
			
			throw new IllegalArgumentException("Leg A must not be negative.");
		}
		this.legA = legA;
	}
	
	/**
	 * if legB is less than or equal to 0 throw exception
	 * set legB
	 * @param legB
	 * @throws IllegalArgumentException
	 */
	
	public void setLegB(double legB) throws IllegalArgumentException {
		
		if(legB <= 0) {
			
			throw new IllegalArgumentException("Leg B must not be negative.");
		}
		this.legB = legB;
	}
	
	/**
	 * 
	 * @return legA
	 */
	
	public double getLegA() {
		
		return legA;
	}
	
	/**
	 * 
	 * @return legB
	 */
	
	public double getLegB() {
		
		return legB;
	}
	
	/**
	 * calculate the Hypotenuse
	 * @return
	 */
	
	public double getHypotenuse() {
		
		return Math.sqrt(legA * legA + legB * legB);
	}
	
	/**
	 * area of a triangle is base * height / 2
	 * @return
	 */
	
	public double getArea() {
		
		return (legA * legB) / 2;
	}
	
	/**
	 * perimeter adds the length of all 3 legs
	 * length of a and b are given, getHypotenuse finds the length of third leg
	 * @return
	 */
	public double getPerimeter() {
		
		return legA + legB + getHypotenuse();
	}
	
	/**
	 * @return String
	 */
	
	public String toString() {
		
		return String.format("legA = %.1f,  legB = %.1f", legA, legB);
	}
	
}