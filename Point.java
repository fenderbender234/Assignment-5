/**
 * 
 * @author Josh Freeman
 *
 */

public class Point {
	
	// instantiate private variables
	private double x;
	private double y;
	
	// constructor sets x and y at 1
	public Point() {
		
		this.x = 1;
		this.y = 1;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return getter for x coordinate
	 */
	
	public double getX() {
		
		return x;
	}
	
	/**
	 * @param setter method for x
	 */
	
	public void setX(double x) {
		
		this.x = x;
	}
	
	/**
	 * @return getter for y coordinate
	 */
	
	public double getY() {
		
		return y;
	}
	
	/**
	 * @param setter method for y
	 */
	
	public void setY(double y) {
		
		this.y = y;
	}
	
	/**
	 * @param amount of change for each coordinate
	 */
	
	public void move(double dx, double dy) {
		
		this.x = x + dx;
		this.y = y + dy;
	}
	
	/**
	 * rotate point clockwise 90 degrees
	 */
	
	public void rotate() {
		
		double temp = this.x;
		this.x = y;
		this.y = -temp;
	}
}