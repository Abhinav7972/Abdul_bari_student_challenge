
import java.util.Scanner;
class Student_challenge_6_leap_year_1
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter year");
int y = s.nextInt();

if(y%4==0)
{
	
if(y%100==0)
{
	
if(y%400==0)
{
	
	System.out.println(" leap year");
	
}	

else

{
	
	System.out.println("not a leap year");
}	
	
	
	
	
}	
	
else
{
	System.out.println("leap year");
}	
	
	
	
	
	
	
}

else
{
	System.out.println("not a leap year");
}












}
}