import java.io.*;
class AreaFunc
{
    int area(int s)
    {
        return(s * s);
    }
    int area(int l, int b)
    {
        return(l * b);
    }
    double area(double r)
    {
        return(Math.PI * r * r); 
    }
}
class AreaMain
{
    public static void main(String args[]) throws IOException
    {
        int side, length, breadth, areaS, areaR;
        double radius, areaC;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Side of Square");
        side = Integer.parseInt(br.readLine());
        AreaFunc square = new AreaFunc();
        areaS = square.area(side);
        System.out.println("Area of Square = " + areaS);

        System.out.println("Enter Length and Breadth of Rectangle");
        length = Integer.parseInt(br.readLine());
        breadth = Integer.parseInt(br.readLine());
        AreaFunc rectangle = new AreaFunc();
        areaR = rectangle.area(length, breadth);
        System.out.println("Area of Rectangle = " + areaR);

        System.out.println("Enter Radius of Circle");
        radius = Double.parseDouble(br.readLine());
        AreaFunc circle = new AreaFunc();
        areaC = square.area(radius);
        System.out.println("Area of Circle = " + areaC);
    }
}
