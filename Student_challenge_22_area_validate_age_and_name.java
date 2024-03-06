class Student_challenge_22_area_validate_age_and_name
{
static boolean Validate(String name)
{

return name.matches("[a-zA-Z\\s]+");	
	
}


static boolean Validate(int  age)
{

return age>=3 && age>=15;
	
}





public static void main(String [] args)
{
System.out.println(Validate("abhinav"));
System.out.println(Validate(12));
}
}