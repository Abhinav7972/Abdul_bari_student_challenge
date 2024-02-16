import java.util.Scanner;
class Student_challenge_5_cond_statement_3
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);	
//find grade based on marks
System.out.println("enter marks of three subject");
int M1 =sc.nextInt();
int M2 =sc.nextInt();
int M3 =sc.nextInt();

int total = M1+M2+M3;

int avg = total/3;

if(avg>=70)
{
	System.out.println("grade is A");
}
else if(avg>=60 && avg<70)
{
	
System.out.println("grade is B");	
}
else if(avg>=50 && avg<60)
{
System.out.println("grade is c");
}
else if(avg>=40 && avg<50)
{
System.out.println("grade is d");
}
else 
{
System.out.println("grade E");
}
}
}