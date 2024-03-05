class Student_challenge_22_area_reversing_number
{
void reverse(int n)
{
int rev =0;
System.out.println("initial number is :" +n);
while(n!=0)
{
	rev = rev*10+n%10;
	n = n/10;
}

System.out.println("reversed number are :" + rev);	
}

int [] reverse(int a[])
{
int b [] = new int [a.length];
for(int i =a.length-1,j=0;i>=0;i--,j++)
{
b[j]=a[i];
}

return b;

	
}


public static void main(String [] args)
{
Student_challenge_22_area_reversing_number a = new Student_challenge_22_area_reversing_number();
Student_challenge_22_area_reversing_number b = new Student_challenge_22_area_reversing_number();	
a.reverse(123);
int c [] = {10,9,8,7};

int c1[] = b.reverse(c);

for(int y:c1)
{
	System.out.print(y + " ");
}

}
}