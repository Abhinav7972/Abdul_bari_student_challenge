import java.util.Scanner;


class Student_challenge_13_fib_series
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);	
System.out.println("Enter number of terms");
int n = s.nextInt();
System.out.println("Enter initial number ");
int a = s.nextInt();

int d =0;
int b =a;
int c;


System.out.print(d + "," + b +",");
for(int i=0 ;i<n-2;i++)
{	
c=d+b;
System.out.print(c+",");
d=b;
b=c;

}


}

}