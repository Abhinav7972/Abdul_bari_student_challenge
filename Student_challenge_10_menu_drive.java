import java.util.Scanner;

class Student_challenge_10_menu_drive
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);		
	
System.out.println("MENU");
System.out.println("=====");	
System.out.println("ADD");
System.out.println("SUB");
System.out.println("MUL");
System.out.println("DIV");

System.out.println("Enter two numbers");
int a = s.nextInt();
int b = s.nextInt();
s.nextLine();	


System.out.println("enter operation in words");
String op = s.nextLine();
op =op.toUpperCase();	
	
switch(op)
{
case "ADD" : 
System.out.println("addition is :" + (a+b));
break;

case "SUB" : 
System.out.println("subtraction is :" + (a-b));
break;

case "MUL" : 
System.out.println("multiplication is :" + (a*b));
break;	


case "DIV" : 
System.out.println("division is :" + (a/b));
break;	
	
	
default:
System.out.println("invalid operation");	
}
	
}
}