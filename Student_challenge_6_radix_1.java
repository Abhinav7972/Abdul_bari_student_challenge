import java.util.Scanner;
class Student_challenge_6_radix_1
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter number to find radix");
String number = s.nextLine();

if(number.matches("[01]+"))
{
	System.out.println("number is binary and radix is 2");	
}
else if(number.matches("[0-7]*"))
{
	System.out.println("number is octal and radix is 8");
}

else if(number.matches("[0-9]+"))
{
	System.out.println("number is decimal and radix is 10");	
}

else if(number.matches("[0-9A-F]+"))
{
	
System.out.println("number is hexa and radix is 16");	
}
else{ System.out.println("invalid number");}
}
}