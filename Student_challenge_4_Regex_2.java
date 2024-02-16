class Student_challenge_4_Regex_2
{
public static void main(String [] args)
{

//remove special character	
String str = "a!@$5bc1234";
System.out.println(str.replaceAll("[^a-z A-Z 0-9]" ,""));


//remove spaces
String str1 = "  abc   ab   c";
System.out.println(str1.replaceAll("\\s+"," ").trim());

//count number of words
String str2 = "alpha beta gama delta";
str2.replaceAll("\\s+"," ").trim();
String words[]= str2.split("\\s"); 
System.out.println(words.length);
}
}