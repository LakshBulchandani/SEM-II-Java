import java.io.*;
class Stud
{
	int marks1, marks2, marks3, total;
	String name;
	Stud(int m1, int m2, int m3, String n)
	{
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
		name = n;		
	}
	void getTotal()
	{
		total = marks1 + marks2 + marks3;
	}
	void display()
	{
		System.out.println( name + "\t" +marks1 + "\t" +marks2 + "\t" +marks3 + "\t" +total);
	}
}
class StudentData
{
	public static void main(String args[]) throws IOException
	{
		Stud[] e = new Stud[5];
		int marks1, marks2, marks3, max = 0, maxIndex = 0;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Data");
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Name: ");
			name =  br.readLine();
			System.out.print("Enter Marks in 3 Subjects ");
			marks1 = Integer.parseInt(br.readLine());
			marks2 = Integer.parseInt(br.readLine());
			marks3 = Integer.parseInt(br.readLine());
			e[i] = new Stud(marks1, marks2, marks3, name);
			e[i].getTotal();
		}
		for(int i = 0; i < 5; i++)
			if(e[i].total >= max)
			{
				max = e[i].total;
				maxIndex = i;
			}
		System.out.println("Maximum Marks by: ");
		System.out.println("Name\tMarks1\tMarks2\tMarks3\tTotal");
		e[maxIndex].display();
		for(int i = 0; i < 5; i++)
			e[i].display();
	}
}