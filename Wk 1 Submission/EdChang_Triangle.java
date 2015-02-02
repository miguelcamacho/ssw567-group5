import java.util.*;

public class Triangle {
	
    private static Scanner sc;

	public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.print("Please enter length for side 1 (int): ");
        int a = sc.nextInt();
        System.out.print("Please enter length for side 2 (int): ");
        int b = sc.nextInt();
        System.out.print("Please enter length for side 3 (int): ");
        int c = sc.nextInt();

        String triangelType = getTriangleType(a, b, c);
        

        System.out.println("It is" + triangelType + " triangle");

	
	}

	private static String getTriangleType(int a, int b, int c) {
		
		String retType = "";
		
		if(a==b && b==c)
            retType = retType + (" equilateral");

        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            retType = retType + (" not a");

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            retType = retType + (" isosceles");

        else if(a!=b && b!=c && c!=a)
            retType = retType + (" scalene");
		
        if(a*a==(b*b + c*c) || (b*b==a*a + c*c) || 
        	(c*c==a*a + b*b))
        	retType = retType + (" & right");
		
		return retType;
	}
}
