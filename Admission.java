import java.io.*;
class Admission
{
	public static void main(String Args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int phy, chem, math, total;
		System.out.println("Enter Marks in Physics, Chemistry and Mathematics");
		phy = Integer.parseInt(br.readLine());
		chem = Integer.parseInt(br.readLine());
		math = Integer.parseInt(br.readLine());
		total = phy + chem + math;
		System.out.println("Subject:\tPhysics\t\tChemistry\tMaths\t\tTotal");
		System.out.println("Required:\t50\t\t40\t\t60\t\t200");
		System.out.println("Acquired:\t" +phy + "\t\t" + chem + "\t\t" + math + "\t\t" + total);
		if(phy >= 50 && chem >= 40 && math >= 60 && total >= 200)
			System.out.println("Result: The Student is Eligible for Admission in Course");
		else
			System.out.println("Result: The Student is Not Eligible for Admission in Course");  
	}
}
