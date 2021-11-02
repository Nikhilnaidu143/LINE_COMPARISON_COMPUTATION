/* UC-1:- Calculated length of the Line. */
import java.util.Scanner;

public class lineComparison{
	public static void main(String[] args){
		System.out.println("Welcome To Line Comparison Computation Program.\n");

		Scanner input = new Scanner(System.in);
		/* LOCAL VARIABLES */
		int x1, x2, y1, y2;

		/* TAKING INPUTS FROM USER FOR LINE */
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
		/* FINDING LENGTH OF THE LINE. */
		double LenOfLine = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("Length of the LINE :- " + LenOfLine);
	}
}
