class Student_challenge_14_patterns_1
{

public static void main(String [] args)
{

//pattern 1	
for(int i = 1;i<=5;i++)
{
	
	for(int j =1;j<=5;j++)
	{
		System.out.print(j+" ");
	}
	System.out.println("");		
}

System.out.println("");	
System.out.println("");	

//pattern 2	
for(int k = 1;k<=5;k++)
{
	
	for(int l =1;l<=5;l++)
	{
		System.out.print(k+" ");
	}
	System.out.println("");		
}

System.out.println("");	
System.out.println("");	

//pattern 3
for(int m = 1;m<=5;m++)
{
	
	for(int n =1;n<=5;n++)
	{
		System.out.print(m+n+" ");
	}
	System.out.println("");		
}

System.out.println("");	
System.out.println("");	

//pattern 3
int count =0;
for(int o = 1;o<=5;o++)
{
	
	for(int p =1;p<=5;p++)
	{
		++ count ;
		System.out.format("%02d  ",count);
	}
	System.out.println("");		
}




}


}