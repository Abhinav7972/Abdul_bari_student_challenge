import java.util.Scanner;

class Student_challenge_11_sumofn
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter number :");
int n = s.nextInt();
int sum = 0;

System.out.println(" ");

for(int i = 1 ; i<=n;i++)
{
sum = sum +i;
}

System.out.println("factorial of number " + n + " are " + sum);
	


}
}