import java.io.*;
class CountChar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        int count[] = new int[5], len;
        System.out.println("Enter a Sentence");
        sentence = br.readLine();
        len = sentence.length();
        char sc[] = sentence.toCharArray();
        for(int i = 0; i < len; i++)
        {
            if((int)sc[i] >= 65 && (int)sc[i] <= 90)  
                count[0]++;
            else if((int)sc[i] >= 97 && (int)sc[i] <= 122) 
                count[1]++;
            else if((int)sc[i] == 32)  
                count[3]++;
            else if((int)sc[i] >= 48 && (int)sc[i] <= 57) 
                count[4]++;
            else
                count[2]++;
        }
        System.out.println("Number of:");
        System.out.println("Uppercase\tLowerase\tSpecialChar\tBlanks\t\tDigits");
        for(int i = 0; i < 5; i++)
            System.out.print(+count[i] + "\t\t");
        System.out.println(); 
    }
}
