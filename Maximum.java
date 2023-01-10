import java.io.*;
class Number
{
	int num1, num2, num3;
	void input(int a, int b, int c)
	{
		num1 = a;
		num2 = b;
		num3 = c;	
	}
	int greatest(int a, int b, int c)
	{
		int m = a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
		return m;
	}
}
class Maximum
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c, max;
		System.out.println("Enter 3 Numbers");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		Number n = new Number();
		n.input(a, b, c);
		max = n.greatest(n.num1, n.num2, n.num3);
		System.out.println("Max = "+max);
	}	
}