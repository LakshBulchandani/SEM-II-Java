import java.io.*;
class Highest
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int marks[] = new int[6];
        int total = 0, highest = 0, hLoc = 0;
        System.out.println("Enter Marks in 6 Subjects");
        for(int i = 0; i < 6; i++)
        {
            marks[i] = Integer.parseInt(br.readLine());
            if(marks[i] >= highest)
            {
                highest = marks[i];
                hLoc = i + 1;
            }
            total += marks[i];
        } 
        System.out.println("Total Marks = "+total);
        System.out.println("Highest Marks = Marks " +hLoc +" : " +highest);
    }
}
