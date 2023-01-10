import java.io.*;
class EvenOdd
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int eCount = 0, oCount = 0, n;
        System.out.println("Enter the Number of Elements");
        n = Integer.parseInt(br.readLine());
        int arr[] =  new int[n];
        System.out.println("Enter " +n+ " Elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] % 2 == 0)
                eCount++;
            else
                oCount++;
        }
        System.out.println("Number of Odd Elements = "+oCount);
        System.out.println("Number of Even Elements = "+eCount);
    }
    
}
