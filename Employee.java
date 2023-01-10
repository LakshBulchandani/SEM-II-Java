import java.io.*;
class Employee
{
	String name, department;
	int salary, uid;
	Employee(String n, String d, int u, int s) 
	{
		name = n;
		department = d;
		uid = u;
		salary = s;
	}
	void printData(String n, String d, int u, int s)
	{
		System.out.println("Name: "+n);
		System.out.println("Department: "+d);
		System.out.println("UID: "+u);
		System.out.println("Salary: "+s);
	} 
	public static void main(String args[]) throws IOException
	{
		String n, d;
		int s, u ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		n = br.readLine();
		System.out.println("Enter Department");
		d = br.readLine();
		System.out.println("Enter UID");
		u = Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		s = Integer.parseInt(br.readLine());
		Employee e = new Employee(n, d, u, s);
		e.printData(e.name, e. department, e.uid, e.salary); 
	}	
}