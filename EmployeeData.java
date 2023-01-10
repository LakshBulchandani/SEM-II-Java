import java.io.*;
class Emp
{
	int id, nohr, wages;
	String name;
	Emp(int i, int no, String n)
	{
		id = i;
		nohr = no;
		name = n;
	}
	void getWages()
	{
		wages = nohr * 100;
	}
	void display()
	{
		System.out.println(id + "\t" +name + "\t" + nohr + "\t" + wages);
	}
}
class EmployeeData
{
	public static void main(String args[]) throws IOException
	{
		Emp[] e = new Emp[5];
		int id, nohr, wages, max = 0, maxIndex = 0;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Data");
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Name: ");
			name =  br.readLine();
			System.out.print("id: ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Number of Hours: ");
			nohr = Integer.parseInt(br.readLine());
			e[i] = new Emp(id, nohr, name);
			e[i].getWages();
		}
		for(int i = 0; i < 5; i++)
			if(e[i].wages >= max)
			{
				max = e[i].wages;
				maxIndex = i;
			}
		System.out.println("Maximum Wages Earned by: ");
		System.out.println("id\tName\tHours\tWages");
		e[maxIndex].display();
		for(int i = 0; i < 5; i++)
			e[i].display();
	}
}