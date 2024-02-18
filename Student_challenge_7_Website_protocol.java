import java.util.Scanner;
class Student_challenge_7_Website_protocol
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);

//finding the protocol
System.out.println("enter your url:");
String url = s.nextLine();
System.out.println("enter your url:");
System.out.println(" ");

//finding protocol
int indprot = url.indexOf(":");
String prot = url.substring(0,indprot);
String tprot = prot.trim();

if(tprot.contains("https"))
{
	System.out.println("protocol used :hyper text transfer protocol");
}
else if(tprot.contains("ftp"))
{
	System.out.println("protocol used :file transfer protocol");
	
}

//finding domain
int inddom = url.lastIndexOf(".");
String dom = url.substring(inddom,url.length());
String tdom = dom.trim();

//finding domain
if(tdom.contains("com"))
{
System.out.println("Domain :commercial");	
	
}

else if(tdom.contains("org"))
{
	System.out.println("Domain :organisation");
}

else if(tdom.contains("net"))
{
	System.out.println("Domain :network");
}

}
}