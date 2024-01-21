import java.util.Scanner;

class Challenge_1_Area_triangle
{

public static void main(String args [])
{
float base,height,area;
Scanner s = new Scanner(System.in);
System.out.println("Enter base of triangle");
base = s.nextFloat();
System.out.println("Enter height of triangle");
height = s.nextFloat();
//area = 0.5f*base*height;
area = base*height/2 ;

System.out.println("total area of triangle is " + area );
}

}