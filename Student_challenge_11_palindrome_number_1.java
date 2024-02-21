import java.util.Scanner;

class Student_challenge_11_palindrome_number_1
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.print("enter number :");
int n = s.nextInt();
int m =n;
int r=0;
int rev = 0;

while(n>0)
{
r = n%10;
rev = rev *10 + r;
n=n/10;	
	
}	
System.out.println("reverse of number is :" + rev);


if(rev == m)
{
	
System.out.println("number is palindrome");	
}
else
{
System.out.println("number is not palindrome");
}


}
}