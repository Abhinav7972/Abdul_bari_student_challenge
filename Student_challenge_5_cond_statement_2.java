import java.util.Scanner;
class Student_challenge_5_cond_statement_2
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);	
//young or old age
System.out.println("enter age");
int age =sc.nextInt();
if(age>=14&&age<=55)
{
	System.out.println("person is young");
}
else
{
	
System.out.println("person is old");	
}
}
}