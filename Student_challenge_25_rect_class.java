class Rectangle
{
public int length,bredth;	
int area()
{
return length*bredth;	
}

int perimeter()
{
return  2*length*bredth;	
}

boolean Is_square()
{
 if(length == bredth)
 {
	 return true;
 }	 
 else
 {
	 return false;
 }
	
}



	
}








class Student_challenge_25_rect_class
{
public static void main(String [] args)
{
Rectangle r1 = new Rectangle();
r1.length = 10;
r1.bredth = 15;

System.out.println("Area of rectangel :" + r1.area());
System.out.println("Perimeter of rectangel :" + r1.perimeter());
System.out.println("Is these an square :" + r1.Is_square());
}
}