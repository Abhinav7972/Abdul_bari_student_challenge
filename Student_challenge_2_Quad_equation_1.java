import java.util.Scanner;

class Student_challenge_2_Quad_equation_1
{
public static void main(String [] args)
{
int a,b,c;
double r1;
double r2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of a,b and c");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);


System.out.println("First root of equation is " + r1);
System.out.println("First root of equation is " + r2);
}
}