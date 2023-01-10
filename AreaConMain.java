import java.io.*;
class Area
{
    double output;
    Area(int s)
    {
        output = s * s;
    }
    Area(int l, int b)
    {
        output = l * b;
    }
    Area(double r)
    {
        output = Math.PI * r * r; 
    }
}
class AreaConMain
{
    public static void main(String args[]) throws IOException
    {
        int side, length, breadth;
        double radius;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Side of Square");
        side = Integer.parseInt(br.readLine());
        Area square = new Area(side);
        System.out.println("Area of Square = " + square.output);
        System.out.println("Enter Length and Breadth of Rectangle");
        length = Integer.parseInt(br.readLine());
        breadth = Integer.parseInt(br.readLine());
        Area rectangle = new Area(length, breadth);
        System.out.println("Area of Rectangle = " + rectangle.output);
        System.out.println("Enter Radius of Circle");
        radius = Double.parseDouble(br.readLine());
        Area circle = new Area(radius);
        System.out.println("Area of Circle = " + circle.output);
    }
}
