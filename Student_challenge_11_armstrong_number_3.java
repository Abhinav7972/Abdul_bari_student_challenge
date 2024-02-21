import java.util.Scanner;

class Student_challenge_11_armstrong_number_3
{
	
public static void main(String [] args)
{
	
//finding armstrong number
Scanner s = new Scanner(System.in);
System.out.println("enter number :");
int n = s.nextInt();
int m =n;
int sum = 0;
int r =0;
while(n>0)
{
r = n%10;
n = n/10;
sum = sum + r*r*r;	

}
if(sum==m)
{
System.out.println("its an armstrong number");	
}
else
{
System.out.println("not an armstrong number");	
	
}


}

}