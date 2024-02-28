import java.util.Scanner;

class Student_challenge_18_array_practice_3
{
	
public static void main(String [] args)
{
Scanner s = new Scanner (System.in);
System.out.print("how many element you want to add :");
int n = s.nextInt();	
int ar [] = new int [n];
int in = 1;

System.out.println(" ");

for(int i = 1 ; i <ar.length;i++)
{
	
	ar[i] = ar[i] +in++;
}


System.out.print(" you array are :");
System.out.print("[");
for(int x =1 ; x<ar.length ; x++)
{
	System.out.print(ar[x] +",");
}	
System.out.print("]");
  
 
 

}
}