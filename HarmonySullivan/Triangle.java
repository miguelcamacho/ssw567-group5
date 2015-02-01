

public class Triangle {
	
		int side1, side2, side3;
		
		// Constructor
		public Triangle (int s1, int s2, int s3) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		
// Method to test for a right-angled triangle
// Check hypotenuse squared = the sum of the squares of the other 2 sides
		public boolean is_right() {
			if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
					((side2*side2) == ((side1*side1) + (side3*side3))) ||
					((side3*side3) == ((side1*side1) + (side2*side2))))
					return true;
			else
				return false;
		}
		
		
// Method to test for a scalene triangle
	// Check that no sides are equal
		public boolean is_scalene() {
			if ((side1 != side2) && (side1 != side3) && (side2 != side3))
				return true;
			else
				return false;
		}
		
// Method to test for an isosceles triangle	
// Check that 2 sides are equal	
		public boolean is_isosceles() {
			if (((side1 == side2) && (side1 != side3)) ||
					((side1 == side3) && (side1 != side2)) ||
					((side2 == side3) && (side2 != side1)))
					return true;
			else
				return false;
 		}
		
// Method to test for an equilateral triangle
// Check that all sides are equal
		public boolean is_equilateral() {
			if ((side1 == side2) && (side1 == side3))
				return true;
			else
				return false;
		}		
}
