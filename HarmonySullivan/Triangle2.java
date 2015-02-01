import javax.swing.JOptionPane;


public class Triangle2 {

	public static void main(String[] args) {
		// Read in 3 numbers
			
		String side1String = JOptionPane.showInputDialog("Enter each value for a triangle.\n"
				+ "This program will tell if the triangle is equilateral, isosceles, scalene and\n"
				+ "if it is a right-angle triangle."
				+ "\nEnter side 1: ");
		
			String side2String = JOptionPane.showInputDialog("Enter side 2: ");
	
			String side3String = JOptionPane.showInputDialog("Enter side 3: ");
		
			// convert input strings into variables
			double side1 = Double.parseDouble(side1String);
			double side2 = Double.parseDouble(side2String);
			double side3 = Double.parseDouble(side3String);
					
			// call is Valid: if true, call other methods
			if (isValid(side1, side2, side3)) {
			
				// call is equilateral
				
				if (eq(side1, side2, side3)) {
					JOptionPane.showMessageDialog(null, "This is an equilateral triangle.");
				}
				else JOptionPane.showMessageDialog(null, "This is not an equilateral triangle.");

			// call is isosceles
			if (iso(side1, side2, side3)) {
				JOptionPane.showMessageDialog(null, "This triangle is isosceles.");
			}
			else JOptionPane.showMessageDialog(null, "This triangle is not isosceles.");	
				
				// call is scalene
			if (sca(side1, side2, side3)) {
				JOptionPane.showMessageDialog(null, "This triangle is scalene."); }
				else JOptionPane.showMessageDialog(null, "This triangle is not scalene.");
			
			// call is right angle
			if (isRight(side1, side2, side3)) {
				JOptionPane.showMessageDialog(null, "This is a right-angle triangle.");
			}
			else JOptionPane.showMessageDialog(null, "This is not a right-angle triangle.");
				}
			else JOptionPane.showMessageDialog(null, "The sides entered do not form a valid triangle.");
	}
				
	// check if these sides form a valid triangle	
	public static boolean isValid(double s1, double s2, double s3) {
		boolean valid = true;
		if (s1 <= 0) valid = false;
		else if (s2 <= 0) valid = false;
		else if (s3 <= 0) valid = false;
		
		if (((s1 + s2) < s3) || ((s1 + s3) < s2) || ((s2 + s3) < s1)) valid = false;
		return valid;
	}
	
	// check if this triangle is equilateral
	public static boolean eq(double s1, double s2, double s3) {
		if ((s1 == s2) && (s2 == s3)) {
		return true;
		}
		else return false;
	}
	
	// check if this triangle is isosceles
	// isosceles is defined as 2 sides equal and not equal to the 3rd side
	public static boolean iso(double s1, double s2, double s3) {
		boolean isIso = false;
		if ((s1 == s2) && (s1 != s3)) isIso = true; 
		else if ((s1 == s3) && (s1 != s2)) isIso = true;
		else if ((s2 == s3) && (s2 != s1)) isIso = true;
		
		return isIso;
	}
	
	// check if this triangle is scalene
	public static boolean sca(double s1, double s2, double s3) {
		if ((s1 != s2) && (s1 != s3) && (s2 != s3)) return true;
		else return false;
	}
	
	// check if this triangle is a right-angle triangle
	public static boolean isRight(double s1, double s2, double s3) {
		boolean right = false;
		if (((s1*s1) + (s2*s2)) == (s3*s3)) right = true;
		else if (((s3*s3) + (s1*s1)) == (s2*s2)) right = true;
		else if (((s2*s2) + (s3*s3)) == (s1*s1)) right = true;
		
		return right;
	}
	
	
}
