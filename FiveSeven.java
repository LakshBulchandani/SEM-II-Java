import java.io.*;
class NumberOutOfBoundsException extends Exception
{
	NumberOutOfBoundsException(String message)
	{
		super(message);
	}
}
class FiveSeven
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num;
			System.out.println("Enter Number 5, 6, 7");
			num = Integer.parseInt(br.readLine());
			if(num < 5 || num > 7)
			{
				throw new NumberOutOfBoundsException("Number is Not 5, 6, 7");
			}
		}
		catch(NumberOutOfBoundsException ne)
		{
			System.out.print("NumberOutOfBoundsException : ");
			System.out.println(ne.getMessage());
		}
		finally
		{
			System.out.println("Test Progam for User Defined Exceptions");
		}
	}
}