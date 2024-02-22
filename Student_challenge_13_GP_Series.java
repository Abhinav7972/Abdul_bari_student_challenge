import java.util.Scanner;

class Student_challenge_13_GP_Series
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter initial number :");
int a = s.nextInt();
System.out.println("Enter common ratio");
int r = s.nextInt();
System.out.println("Enter number of terms");
int n = s.nextInt();

int t = a;


System.out.print(" ");
System.out.print(" ");
System.out.print("Geometric progression series are :");

for(int i = 0; i<n;i++)
{
System.out.print(t + " , ");
t = t*r;
}

}

}