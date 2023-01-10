import java.io.*;
class Transpose
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        System.out.println("Enter Order of Matrix m x n");
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        int ogArray[][] = new int[m][n];
        int tArray[][] = new int[n][m];
        System.out.println("Enter the Elements of Matrix");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                ogArray[i][j] = Integer.parseInt(br.readLine());
                tArray[j][i] = ogArray[i][j];
            }
        }
        System.out.println("Original Matrix");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(+ogArray[i][j] +" ");
            System.out.println();
        }
        System.out.println("Transposed Matrix");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(+tArray[i][j] +" ");
            System.out.println();
        }
    }
}
