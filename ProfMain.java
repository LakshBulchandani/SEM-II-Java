import java.io.*;
class Staff
{
    protected int code;
    protected String name, address; 
    Staff(int c, String n, String a)
    {
        code = c;
        name = n;
        address = a;
    }   
    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}
class Teacher extends Staff
{
    protected String subject, cls;
    Teacher(int c, String n, String a, String s, String cl)
    {
        super(c, n, a);
        subject = s;
        cls = cl;
    }
    void display()
    {
        super.display();
        System.out.println("Subject: "+subject);
        System.out.println("Class: "+cls);
    }
}
class Typist extends Staff
{
    protected int speed;
    Typist(int c, String n, String a, int s)
    {
        super(c,n,a);
        speed = s;
    }
    void display()
    {
        super.display();
        System.out.println("Speed = "+speed);
    }
}
class Officer extends Staff
{
    protected char grade;
    Officer(int c, String n, String a, char g)
    {
        super(c, n, a);
        grade = g;
    }
    void display()
    {
        super.display();
        System.out.println("Grade: "+grade);
    }
}
class Regular extends Typist
{
    int basicPay;
    Regular(int c, String n, String a, int s, int b)
    {
        super(c, n, a, s);
        basicPay= b;
    } 
    void display()
    {
        super.display();
        System.out.println("Basic Pay: "+basicPay);
    }
}
class AdHoc extends Typist
{
    int basicPay;
    AdHoc(int c, String n, String a, int s, int b)
    {
        super(c, n, a, s);
        basicPay = b;
    } 
    void display()
    {
        super.display();
        System.out.println("Basic Pay: "+basicPay);
    }
}
class ProfMain
{
    public static void main(String args[]) throws IOException
    { 
        int code, basicPay, speed;
        String name, address, subject, cls;
        char grade;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Teacher Details");
        System.out.println("Enter Code");
        code = Integer.parseInt(br.readLine());
        System.out.println("Enter Name");
        name = br.readLine();
        System.out.println("Enter Address");
        address = br.readLine();
        System.out.println("Enter Subject");
        subject = br.readLine();
        System.out.println("Enter Class");
        cls = br.readLine();    
        Teacher t = new Teacher(code, name, address, subject, cls);
        t.display();  

        System.out.println("Regular Typist Details");
        System.out.println("Enter Code");
        code = Integer.parseInt(br.readLine());
        System.out.println("Enter Name");
        name = br.readLine();
        System.out.println("Enter Address");
        address = br.readLine();
        System.out.println("Enter Typing Speed");
        speed = Integer.parseInt(br.readLine());
        System.out.println("Enter Basic Pay");
        basicPay = Integer.parseInt(br.readLine());    
        Regular r = new Regular(code, name, address, speed, basicPay);
        r.display(); 

        System.out.println("AdHoc Typist Details");
        System.out.println("Enter Code");
        code = Integer.parseInt(br.readLine());
        System.out.println("Enter Name");
        name = br.readLine();
        System.out.println("Enter Address");
        address = br.readLine();
        System.out.println("Enter Typing Speed");
        speed = Integer.parseInt(br.readLine());
        System.out.println("Enter Basic Pay");
        basicPay = Integer.parseInt(br.readLine());    
        AdHoc a = new AdHoc(code, name, address, speed, basicPay);
        a.display(); 

        System.out.println("Officer Details");
        System.out.println("Enter Code");
        code = Integer.parseInt(br.readLine());
        System.out.println("Enter Name");
        name = br.readLine();
        System.out.println("Enter Address");
        address = br.readLine();
        System.out.println("Enter Grade");
        grade = br.readLine().charAt(0);   
        Officer o = new Officer(code, name, address, grade);
        o.display();  
    }
}
