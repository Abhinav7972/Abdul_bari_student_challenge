class Student_challenge_18_array_practice_1
{
public static void main(String [] args)
{
int a [] = {1,2,3,4,5};

//printing the array
System.out.print("given array is :");
System.out.print(" ");
System.out.print("[");
for(int c : a)
{
	System.out.print(c + ",");
	
}
System.out.print("]");


System.out.print(" ");


int t =a[0];

for(int i =1;i<a.length;i++)
{
	a[i-1] = a[i];
	
}

a[a.length-1] = t;

System.out.println(" ");


System.out.print("Array after rotation :");
System.out.print("[");
for(int c : a)
{
	System.out.print(c + ",");
	
}
System.out.print("]");





}
}


