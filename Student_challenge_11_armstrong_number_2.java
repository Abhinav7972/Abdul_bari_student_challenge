import java.util.Scanner;

class Student_challenge_11_armstrong_number_2
{
	
public static void main(String [] args)
{
	
//count digit from number
Scanner s = new Scanner(System.in);
System.out.println("enter number :");
int n = s.nextInt();
int count = 0;
while(n>0)
{
n = n/10;
count ++;
}
System.out.println(count);	




}

}