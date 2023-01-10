class Test
{
	public static void main(String args[])
	{
 		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);  
		int sum = a+b+c;
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c); 
		int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("a = " + a + "\nb = " + b + "\nc = " +c +"\nSum = " + sum);
		System.out.println("Max  = " + max);
		System.out.println("Min = " + min);
   	}
}