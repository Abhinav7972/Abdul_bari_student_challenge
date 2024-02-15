class Student_challenge_4_String_method_1
{
public static void main(String [] args)
{
String str = "programmer@gmail.com";
int i = str.indexOf("@");
String username = str.substring(0,i);
System.out.println("username ="+username);
int len = str.length();
String domain = str.substring(i+1,len);
System.out.println("domain ="+domain);
System.out.println("is there gmail ? ="+domain.equals("gmail.com"));


}

}