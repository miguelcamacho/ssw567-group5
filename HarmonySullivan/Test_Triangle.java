
import javax.swing.JOptionPane;

public class Test_Triangle {

	public static void main(String[] args) {
		// Read in 3 numbers
			
			// Enter side 1
			String side1String = JOptionPane.showInputDialog("Enter side 1 as an integer:");
			
			// Convert string to int
			int side1 = Integer.parseInt(side1String);
			
			// Enter side 2
			String side2String = JOptionPane.showInputDialog("Enter side 2 as an integer:");
			
			// Convert string to int
			int side2 = Integer.parseInt(side2String);
			
			// Enter side 3
			String side3String = JOptionPane.showInputDialog("Enter side 3 as an integer:");
			
			// Convert string to int
			int side3 = Integer.parseInt(side3String);
			
			
			Triangle myTriangle = new Triangle(side1, side2, side3);
			
			// Is this triangle equilateral?
			String equi_out_yes = "This triangle is equilateral.\n";
			String equi_out_no= "This triangle is not equilateral.\n";
			if (myTriangle.is_equilateral()) {
				JOptionPane.showMessageDialog(null, equi_out_yes);
			}
			else JOptionPane.showMessageDialog(null, equi_out_no);
			
			// Is this triangle isosceles?
			String iso_out_yes = "This triangle is isosceles.\n";
			String iso_out_no = "This triangle is not isosceles.\n";
			if (myTriangle.is_isosceles()) {
				JOptionPane.showMessageDialog(null, iso_out_yes);
			}
			else JOptionPane.showMessageDialog(null, iso_out_no);
			
			// Is this triangle scalene?
			String sca_out_yes = "This triangle is scalene.\n";
			String sca_out_no = "This triangle is not scalene.\n";
			if (myTriangle.is_scalene()) {
				JOptionPane.showMessageDialog(null, sca_out_yes);
			}
			else JOptionPane.showMessageDialog(null, sca_out_no);
			
			// Is this triangle a right-angle triangle?
			String ra_out_yes = "This triangle is a right-angle triangle.\n";
			String ra_out_no = "This triangle is not a right-angle triangle.\n";
			if (myTriangle.is_right()) {
				JOptionPane.showMessageDialog(null, ra_out_yes);
			}
			else JOptionPane.showMessageDialog(null, ra_out_no);
	
	}
}
