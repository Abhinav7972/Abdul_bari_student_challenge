class Student_challenge_22_area_method_over
{
static double area(double l, double b)
{
return l*b;
	
}

static double area(double r)
{
return Math.PI*(r*r);	
	
}



public static void main(String [] args)
{
System.out.println("area of rectangle :" + area(10,20));
System.out.println("area of circle :" + area(5));


}

}