import java.util.Scanner;
class Student_challenge_9_words_and_number
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter number");
int n = s.nextInt();

switch(n)
{
case 1 : System.out.println("one");
break;

case 2 : System.out.println("two");
break;

case 3 : System.out.println("three");
break;

case 4 : System.out.println("four");
break;

case 5 : System.out.println("five");
break;

case 6 : System.out.println("six");
break;

case 7 : System.out.println("seven");
break;

case 8 : System.out.println("eight");
break;
	
case 9 : System.out.println("nine");
break;

case 10 : System.out.println("ten");
break;	

default: System.out.println("invalid number"); 
	
}


}
}