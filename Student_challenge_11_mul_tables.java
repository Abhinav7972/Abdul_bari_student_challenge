import java.util.Scanner;

class Student_challenge_11_mul_tables
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number ");
int n = s.nextInt();


System.out.println(" ");
System.out.println(" ");

System.out.println("multiplication table for number  " +n + " are :");
System.out.println(" ");

for(int i = 1;i<=10;i++)
{
System.out.println(n + "X" + i + "=" + n*i);
	
	
}

}
}