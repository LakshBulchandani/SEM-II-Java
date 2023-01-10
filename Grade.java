import java.util.*;
class Percent
{
	public static void main(String args[])
	{
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Grade");
		grade = s.nextLine().charAt(0);
		if(grade == 'A' || grade == 'a')
			System.out.println("Percentage Range : 91 - 100");
		else if(grade == 'B' || grade == 'b')
			System.out.println("Percentage Range : 81 - 90");
		else if(grade == 'C' || grade == 'c')
			System.out.println("Percentage Range : 71 - 80");
		else if(grade == 'D' || grade == 'd')
			System.out.println("Percentage Range : 61 - 70");
		else if(grade == 'F' || grade == 'f')
			System.out.println("Percentage Range : 0 - 60");
		else
			System.out.println("Invalid Character Entered");
	}
}