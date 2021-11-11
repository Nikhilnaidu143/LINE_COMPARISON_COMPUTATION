/*  UC-2:- Chechking euality of two lines usting .equals method. */
import java.util.Scanner;

public class LineComparison{
	public static void main(String[] args){
		System.out.println("Welcome To Line Comparison Computation Program.\n");

		Scanner input = new Scanner(System.in);
		/* LOCAL VARIABLES */
		int x1, x2, y1, y2;
		int a1, a2, b1, b2;

		/* TAKING INPUTS FROM USER FOR LINE-1 & LINE-2. */
		System.out.println("ENTER LINE-1 VALUES AS CARTESIAN COORDINATES[(x1,x2) & (y1,y2)] :- ");
		System.out.print("ENTER X1 VALUE :- ");
		x1 = input.nextInt();
		System.out.print("ENTER X2 VALUE :- ");
		x2 = input.nextInt();
		System.out.print("ENTER Y1 VALUE :- ");
		y1 = input.nextInt();
		System.out.print("ENTER Y2 VALUE :- ");
		y2 = input.nextInt();

		System.out.println(" ");

		System.out.println("ENTER LINE-2 VALUES AS CARTESIAN COORDINATES[(A1,A2) & (B1,B2)]");
		System.out.print("ENTER A1 VALUE :- ");
		a1 = input.nextInt();
		System.out.print("ENTER A2 VALUE :- ");
		a2 = input.nextInt();
		System.out.print("ENTER B1 VALUE :- ");
		b1 = input.nextInt();
		System.out.print("ENTER B2 VALUE :- ");
		b2 = input.nextInt();

		/* FINDING LENGTHS OF LINE-1 & LINE-2. */
		double LenOfLine1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		double LenOfLine2 = Math.sqrt(Math.pow((a2-a1), 2)+Math.pow((b2-b1), 2));
		System.out.println(" ");
		/* DISPLAYING LINE-1 AND LINE-2 LENGTHS */
		System.out.println("LENGTHS OF LINE-1 AND LINE-2 ARE :- ");

		System.out.println("LENGTH OF LINE-1 :- " + LenOfLine1);
		System.out.println("LENGTH OF LINE-2 :- " + LenOfLine2);

		System.out.println(" ");
		/* CONVERSION OF DOUBLE TYPE TO STRING TYPE FOR .equals METHOD */
		String L1 = Double.toString(LenOfLine1);
		String L2 = Double.toString(LenOfLine2);

		if(L1.equals(L2)){
			System.out.println("LINE-1 IS EQUAL TO LINE-2.");
		}
		else{
			System.out.println("LINE-1 IS NOT EQUAL TO LINE-2.");
		}
	}
}

