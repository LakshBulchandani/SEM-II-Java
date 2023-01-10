import java.io.*;
class PayOutOfBoundsException extends Exception
{
	PayOutOfBoundsException(String message)
	{
		super(message);
	}
}
class Payment
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int basicPay;
			System.out.println("Enter Payment Amount Between 25000 and 50000");
			basicPay = Integer.parseInt(br.readLine());
			if(basicPay < 25000)
				throw new PayOutOfBoundsException("Payment Less Than Required Amount");
			if(basicPay > 50000)
				throw new PayOutOfBoundsException("Payment More Than Required Amount");
		}
		catch(PayOutOfBoundsException pe)
		{
			System.out.print("PayOutOfBoundsException : ");
			System.out.println(pe.getMessage());
		}
		finally
		{
			System.out.println("Test Progam for User Defined Exceptions");
		}
	}
}