class Student_challenge_4_Regex_1
{
public static void main(String [] args)
{
	
	//finding byte number
	int b = 1010001;
	String str = String.valueOf(b);
	System.out.println(str.matches("[01]*"));
	
	//finding hexa number
	String h ="203Z";
	System.out.println(h.matches("[0-9 A-F]+"));
	
	
	//match the date
	String d ="20/01/2000";
	System.out.println(d.matches("[0-9][0-9]/[0-1][0-9]/[0-9]{4}"));
	
}
}