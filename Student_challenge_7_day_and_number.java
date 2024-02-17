import java.util.Scanner;

//class block start
class Student_challenge_7_day_and_number
{
	
//main function block start	
public static void main(String [] args)
{

//variables block start	
Scanner s = new Scanner(System.in);
System.out.println("enter number");
int n = s.nextInt();
//variables block end

//if logic start
if(n==1)
{
System.out.println("today is monday");
}
else if(n==2)
{
System.out.println("today is tuesday");
	
}
else if(n==3)
{
System.out.println("today is wednesday");
 	
}

else if(n==4)
{
System.out.println("today is thursday");
 	
}


else if(n==5)
{
System.out.println("today is friday");
 	
}


else if(n==6)
{
System.out.println("today is saturday");
 	
}

else if(n==7)
{
System.out.println("today is sunday");
 	
}
else
{
System.out.println("invalid number");
	
}
//if logic block end



}
//main function block end

}
//class block end