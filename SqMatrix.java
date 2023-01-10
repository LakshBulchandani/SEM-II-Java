import java.io.*;
class SqMatrix
{
    static int isSquare(int[][] a)
    {
        if(a.length == a[0].length)
        {
            System.out.println("Square Matrix");
            return 1;
        }
        else
        {
            System.out.println("Not Square Matrix");
            System.exit(0);
            return 0;
        }
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n, sum = 0, c;
        System.out.println("Enter Order of Matrix m x n");
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        int arr[][] = new int[m][n];
        System.out.println("Enter Elements of Matrix");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                arr[i][j] = Integer.parseInt(br.readLine());
        }
        c = isSquare(arr);
        System.out.println("Original Matrix");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
                System.out.print(+arr[i][j] +" ");
            System.out.println();
             if(c == 1)
                sum += arr[i][i];
        }
        if(c == 1)
            System.out.println("Sum of Diagonal Elements = " +sum);
    }
}
