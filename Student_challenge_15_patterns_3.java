class Student_challenge_15_patterns_3
{
public static void main(String [] args)
{
//pattern 1	
for(int i=1;i<=5;i++)
{
	for(int j =1;j<=5;j++)
	{
		if(j>=i)
		{
		System.out.print("*");
		}
		
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println(" ");
	
}

System.out.println("");
System.out.println("");





//pattern 2
for(int m=1;m<=5;m++)
{
	for(int n =1;n<=5;n++)
	{
		if(m+n>5)
		{
		System.out.print("*");
		}
		
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println(" ");
	
}












}
}