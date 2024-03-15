class cylinder
{

//defining variables	
private double radius,height;



//defining properties
public double getradius()
{
	return radius;
}	
public void setradius(double r)
{
	
 radius =r;
}

public double getheight()
{
	return height;
}

public void setheight(double h)
{
	height = h;
}

public void setdimension(double r ,double h)
{
	  radius = r;
	  height = h;
}




public cylinder()
{
	radius = 10;
	height = 20;
	
}


public cylinder(double r)
{
	setradius(r);
}


public cylinder(double r ,double h)
{
	setdimension(r,h);
	
}


public double area()
{
return	circum()*(radius+height);
}

public double circum()
{
	return 2*Math.PI*radius;
}

public double volume()
{	
return	Math.PI*radius*radius*height;
} 	
}





class Student_challenge_28_cylinder
{
public static void main(String [] args)
{
cylinder c1 = new cylinder();
cylinder c2 = new cylinder(20);
cylinder c3 = new cylinder(10,20);

c2.setheight(40);

System.out.printf("area of simple constructor : %1.2f",c1.area());
System.out.println(" ");
System.out.printf("volume of simple constructor : %1.2f",c1.volume());
System.out.println(" ");
System.out.println(" ");
System.out.printf("area of single parametarise constructor : %1.2f",c2.area());
System.out.println(" ");
System.out.printf("volume of single parametarise constructor : %1.2f",c2.volume());
System.out.println(" ");
System.out.println(" ");
System.out.printf("area of multiple parametarise constructor : %1.2f",c3.area());
System.out.println(" ");
System.out.printf("volume of multiple parametarise constructor : %1.2f",c3.volume());
System.out.println(" ");


}
}