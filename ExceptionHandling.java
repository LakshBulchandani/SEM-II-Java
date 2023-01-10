import java.io.*;
class ExceptionHandling
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int arr[] = new int[1];
			int x, y, z, index, sIndex;
			String s = null;
			System.out.println("Enter Numerator");
			x = Integer.parseInt(br.readLine());
			System.out.println("Enter Denominator as 0");
			y = Integer.parseInt(br.readLine());
			z = x / y;
			System.out.println("Enter index for Array");
			index = Integer.parseInt(br.readLine());
			System.out.println(arr[index]);
			System.out.println("Enter index for String");
			sIndex = Integer.parseInt(br.readLine());
			System.out.println(s.charAt(sIndex));
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe + ": String is Empty");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
	}
}