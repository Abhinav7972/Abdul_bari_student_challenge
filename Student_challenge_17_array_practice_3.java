

class Student_challenge_17_array_practice_3
{
public static void main(String [] args)
{
int j[] = {10,11,12,20,30,2,5};	
int max1= j[0];

System.out.print("[");
for(int x:j)
{
	System.out.print(x+",");
		
	
}
System.out.print("]");

System.out.println(" ");


for(int i = 0;i<j.length;i++)
{
	if(j[i]>max1)
	{
		max1 = j[i];
	}
		
	
}
System.out.println("maximum element is :"+max1);

System.out.println(" ");


int max2;



max1=max2=j[0];

for(int i = 0;i<j.length;i++)
{
	if(j[i]>max1)
	{
		max2 = max1;
		max1 = j[i];
	}
	
	else if(j[i]>max2)
	{
		max2 = j[i];
	}
		
	
}

System.out.println("second largest element is :"+max2);








}

}