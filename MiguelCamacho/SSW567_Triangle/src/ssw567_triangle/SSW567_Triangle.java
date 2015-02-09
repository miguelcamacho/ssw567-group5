package ssw567_triangle;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Camacho
 */
public class SSW567_Triangle {

    static Double sidea;
    static Double sideb;
    static Double sidec;

    static double angleA;
    static double angleB;
    static double angleC;

    static String message = "";
    static int option = JOptionPane.YES_OPTION;

    private static void getSideA() {
        try {
            sidea = Double.valueOf(JOptionPane.showInputDialog("Enter side 1 of the Triangle (eg. 1.0, 2.5, etc)"));
            while (sidea <= 0) {
                sidea = Double.valueOf(JOptionPane.showInputDialog("Side 1 has to be greater than 0!"
                        + "\n Please enter side 1 of the Triangle (eg. 1.0, 2.5, etc)"));
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "An invalid character was entered!"
                    + "\nPlease enter only numbers.");

            sidea = null;
        }
    }

    private static void getSideB() {
        try {
            sideb = Double.valueOf(JOptionPane.showInputDialog("Enter side 2 of the Triangle (eg. 1.0, 2.5, etc)"));
            while (sideb <= 0) {
                sideb = Double.valueOf(JOptionPane.showInputDialog("Side 2 has to be greater than 0!"
                        + "\n Please enter side 2 of the Triangle (eg. 1.0, 2.5, etc)"));
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "An invalid character was entered!"
                    + "\nPlease enter only numbers.");

            sideb = null;
        }
    }

    private static void getSideC() {
        try {
            sidec = Double.valueOf(JOptionPane.showInputDialog("Enter side 3 of the Triangle (eg. 1.0, 2.5, etc)"));
            while (sidec <= 0) {
                sidec = Double.valueOf(JOptionPane.showInputDialog("Side 3 has to be greater than 0!"
                        + "\n Please enter side 3 of the Triangle (eg. 1.0, 2.5, etc)"));
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "An invalid character was entered!"
                    + "\nPlease enter only numbers.");

            sidec = null;
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
        while (option == JOptionPane.YES_OPTION) {
            getSideA();
            while (sidea == null) {
                getSideA();
            }
            getSideB();
            while (sideb == null) {
                getSideB();
            }
            getSideC();
            while (sidec == null) {
                getSideC();
            }

            if ((sidea + sideb) < sidec || (sideb + sidec) < sidea || (sidec + sidea) < sideb) {
                JOptionPane.showMessageDialog(null, "This is an invalid triangle!"
                    + "\nThe sum of two sides must be greater than the third side.");
            } else {

                if (sidea.equals(sideb) && sideb.equals(sidec)) {
                    message = "This is an Equilaterial Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
                } else if ((sidea.equals(sideb) && !sidea.equals(sidec)) || (sidea.equals(sidec) && !sidea.equals(sideb)) || (sideb.equals(sidec) && !sideb.equals(sidea))) {
                    message = "This is an Isosceles Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
                } else if (!sidea.equals(sideb) && !sidea.equals(sidec) && !sideb.equals(sidec)) {
                    message = "This is a Scalene Triangle with sides a = " + sidea + ", b = " + sideb + ", and c = " + sidec;
                }
                isRightTriangle();

                JOptionPane.showMessageDialog(null, message);
                option = JOptionPane.showConfirmDialog(null, "Would you like to run the program again?");
            }
        }
    }
}
