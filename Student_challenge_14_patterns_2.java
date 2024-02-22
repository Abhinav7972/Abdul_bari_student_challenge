class Student_challenge_14_patterns_2
{
public static void main(String [] args)
{
	
//pattern 1	
for(int i =1;i<=5;i++)
{
	for(int j =1;j<=i;j++)
	{
		System.out.print(j);
	}
	System.out.println(" ");
	
}

System.out.println("");
System.out.println("");

//pattern 2
int count =0;
for(int k =1;k<=5;k++)
{
	for(int l =1;l<=k;l++)
	{
		++count;
		System.out.print(count + " ");
	}
	System.out.println(" ");
	
}

System.out.println("");
System.out.println("");

//pattern 3
for(int m =1;m<=5;m++)
{
	for(int n =1;n<=m;n++)
	{
		System.out.print("* ");
	}
	System.out.println(" ");
	
}


System.out.println("");
System.out.println("");

//pattern 4
for(int o =1;o<=5;o++)
{
	for(int p =1;p<=5-o+1;p++)
	{
		System.out.print(p+" ");
	}
	System.out.println(" ");
	
}













}


}