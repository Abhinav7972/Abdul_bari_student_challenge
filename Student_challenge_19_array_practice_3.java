class Student_challenge_19_array_practice_3
{
public static void main(String [] args)
{
int a[] = {1,2,3,4};
int b[] = new int [2*a.length];


for(int i = 0;i<a.length;i++)	
{
b[i] = a[i];
	
}
a=b;
for(int x:a)
{
	System.out.print(x);
}
System.out.println(" ");
System.out.println("length of array a :" + a.length);

}
}