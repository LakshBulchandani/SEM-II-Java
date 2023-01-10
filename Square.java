class Square
{
	public static void main(String Args[])
	{
		for(int i = 1, sq = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++, sq++)
			{
				System.out.print(sq + "*" + sq + "=" + sq*sq + " ");
			}
			System.out.println();
		}
	}
}