package ssw567_triangle;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Camacho
 */
public class SSW567_Triangle {

    static double sidea;
    static double sideb;
    static double sidec;
    
    static double angleA;
    static double angleB;
    static double angleC;
    
    static String message = "";

    private static void getMeasurements() {
        sidea = Integer.valueOf(JOptionPane.showInputDialog("Enter side 1 of the Triangle (eg. 1.0, 2.5, etc)"));
        sideb = Integer.valueOf(JOptionPane.showInputDialog("Enter side 2 of the Triangle (eg. 1.0, 2.5, etc)"));
        sidec = Integer.valueOf(JOptionPane.showInputDialog("Enter side 3 of the Triangle (eg. 1.0, 2.5, etc)"));
        
        if (sidea == sideb && sideb == sidec) {
            message = "This is an Equilaterial Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
        } else if ((sidea == sideb && sidea != sidec) || (sidea == sidec && sidea != sideb) || (sideb == sidec && sideb != sidea)) {
            message = "This is an Isosceles Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
        } else if (sidea != sideb && sidea != sidec && sideb != sidec) {
            message = "This is an Isosceles Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
        }
    }
    
    private static void isRightTriangle() {
        angleA = Math.round(Math.toDegrees(Math.acos(((Math.pow(sideb, 2) + Math.pow(sidec, 2) - Math.pow(sidea, 2)) / (2 * sideb * sidec)))));
        angleB = Math.round(Math.toDegrees(Math.acos(((Math.pow(sidec, 2) + Math.pow(sidea, 2) - Math.pow(sideb, 2)) / (2 * sidec * sidea)))));
        angleC = 180 - angleA - angleB;
        
        if (angleA == 90.0 || angleB == 90.0 || angleC == 90.0) {
            message += "\nThis is a right Triangle with angles A = " + angleA + ", B = " + angleB + ", and C = " + angleC;
        } else {
            message += "\nThe angles of the Triangle are: A = " + angleA + ", B = " + angleB + ", and C = " + angleC;
        }
    }

    public static void main(String[] args) {
        getMeasurements();
        isRightTriangle();
        
        JOptionPane.showMessageDialog(null, message);
    }

}
