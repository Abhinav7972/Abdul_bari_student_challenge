import java.util.Scanner;


class Challenge_1_Area_triangle_2
{

public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int a,b,c;
float s;
double area;
System.out.println("enter value of three sides of triangle");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
s=(a+b+c)/2f;
area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triangle is " + area);
}

}