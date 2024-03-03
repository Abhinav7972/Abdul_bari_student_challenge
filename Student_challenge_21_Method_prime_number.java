import java.util.Scanner;
class Student_challenge_21_Method_prime_number
{

static void Prime_number(int n)
{
int count = 0;	
for(int i=1; i<=n/2;i++)
{
if(n%i==0)
{
	count ++;
}	
}

if(count ==1 || n==0 || n==1)
{
	System.out.println("number is prime");
}
else
{
	System.out.println("number is not prime");
}
	
	
}











public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter number :");
System.out.println(" ");	
int a = s.nextInt();	
System.out.println("Given number is :" + a);
System.out.println(" ");
Prime_number(a);

}


}