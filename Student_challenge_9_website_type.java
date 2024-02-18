import java.util.Scanner;

class Student_challenge_9_website_type
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter url :");
String url = s.nextLine();
String turl = url.trim();
String dom = turl.substring(turl.lastIndexOf(".")+1,turl.length());

switch(dom)
{
case "com" : System.out.println("Domain :commercial");
break;

case "org" : System.out.println("Domain :organisation");
break;

case "net" : System.out.println("Domain :network");
break;

case "gov" : System.out.println("Domain :goverment");
break;


default : System.out.println("invalid domain");
break;	
}
	
	
}
}