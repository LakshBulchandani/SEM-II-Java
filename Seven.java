class Seven
{
	public static void main(String Args[])
	{
		int sum = 0;
		System.out.println("Numbers Between 100 and 200 Divisible by 7:");
		for(int i = 100; i <= 200; i++)
		{
			if(i % 7 == 0)
				System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\nSum = " +sum);
	}
}