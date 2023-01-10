import java.io.*;
class Palindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag = 1;
        String word;
        System.out.println("Enter a Word");
        word = br.readLine();
        for(int i = word.length() - 1, j = 0; i >= (word.length() / 2); i--, j++)
        {
            if(word.charAt(j) != word.charAt(i))
            {
                flag = 0;
                break; 
            }
        } 
        if(flag == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
