import java.util.Scanner;

class Student_challenge_13_AP_Series
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter initial number :");
int a = s.nextInt();
System.out.println("Enter common differences :");
int d = s.nextInt();
System.out.println("Enter number of terms :");
int n = s.nextInt();

int term = a;

System.out.print("");	

for(int i=0;i<n;i++)
{	
System.out.print(term + " , ");	
term = term +d;	
}


}

}