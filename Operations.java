import ArithmeticOperations.*;
import java.io.*;
public class Operations
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		System.out.println("Enter 2 Numbers");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		Add a =new Add();
		System.out.println("Addition: "+a.Add(num1, num2));
		Sub s =new Sub();
		System.out.println("Subtraction: "+s.Sub(num1, num2));
		Mul m = new Mul();
		System.out.println("Multipication: "+m.Mul(num1, num2));
		Div d =new Div();
		System.out.println("Division: "+d.Div(num1, num2));
	}
}