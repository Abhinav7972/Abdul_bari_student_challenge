import java.util.Scanner;

class Student_challenge_11_armstrong_number_1
{
	
public static void main(String [] args)
{
	
//seprating digit from number	
Scanner s = new Scanner(System.in);
System.out.println("enter number :");
int n = s.nextInt();
int r = 1;
while(n>0)
{
r =n%10;	
n = n/10;
System.out.println(r);	
}




}

}