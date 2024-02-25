import java.util.Scanner;

class Student_challenge_17_array_practice_2
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int a [] = {5,6,7,8,9,10};
System.out.println("Enter Key");
int key =s.nextInt();

for(int i =0; i<a.length;i++)
{
	if(a[i]==key)
	{
		System.out.println("key found at index :" +i);
		System.exit(0);
	}
}

System.out.println("not found");

}
}