class Student
{
public String name;
public String roll;	
public String course;
public int m1,m2,m3;

int total()
{

return m1+m2+m3;	
	
}

float average()
{
return  (float)total()/3;
	
}




void grade()
{
	if(average()>70)
	{
		System.out.println("A");
	}
	else if(average()<70&&total()>60)
	{
		System.out.println("B");
	}

}	


String details()
{
return "Roll no :"+roll+"\n"+"name :" + name+"\n"+"course :" + course;	
}

}









class Student_challenge_27_Student
{

public static void main(String [] args)
{
Student s = new Student();
s.name = "abhinav";
s.roll = "123";
s.course = "mechanics";
s.m1 =  70;
s.m2 = 80;
s.m3 = 65;

System.out.println(s.details());
System.out.println("total marks  of course :" + s.total());
System.out.println("average marks :" + s.average());
System.out.print("grade : ");
s.grade();

}

}