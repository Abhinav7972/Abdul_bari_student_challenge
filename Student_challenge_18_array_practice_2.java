import java.util.Scanner;

class Student_challenge_18_array_practice_2
{
	
public static void main(String [] args)
{
	Scanner s = new Scanner(System.in);
	
int a [] = new int [7];
a[0] = 3;
a[1] = 9;
a[2] = 7;
a[3] = 8;
a[4] = 12;
a[5] = 6;

//printing initial array
System.out.print("initial array  :");
System.out.print("[");
for(int x : a)
{
	System.out.print(x + ", ");
}

 System.out.print("]");
 
 
System.out.println(" ");
System.out.println(" ");

 System.out.print("from 0 to 5 at which position you want to enter element:");
 int index = s.nextInt();
 System.out.println(" ");
 System.out.print("which element you want to add :");
 int t = s.nextInt(); 
 

 //rotating array and adding elements
System.out.println(" ");

System.out.println("additional elements added :" + t);

for(int i =6; i>index; i--)
{
	a[i] = a[i-1];
	
}

a[index] =t;


System.out.println(" ");
System.out.println(" ");


//printing array after rotation and adding elements
System.out.print("array after rotating  and adding elements :");
System.out.print("[");
for(int x : a)
{
	System.out.print(x + ", ");
}

 System.out.print("]");
 
 

}
}