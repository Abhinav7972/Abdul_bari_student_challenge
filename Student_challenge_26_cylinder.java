class Cylinder
{
public double radius;
public double height;


double lidarea()
{
	return Math.PI*radius*radius;
}

double totalsurfacearea()
{
	return 2*lidarea()+circumference()*height;
}

double volume()
{
return lidarea()*height;
}

double circumference()
{
	return
	2*Math.PI*radius;
}


}



class Student_challenge_26_cylinder
{
public static void main(String [] args)
{
Cylinder cl = new Cylinder();
cl.radius =  7;
cl.height = 10;

System.out.printf("Surface area of cylinder : %1.2f" ,cl.totalsurfacearea());
System.out.println(" ");
System.out.printf("lid area of cylinder : %1.2f" ,cl.lidarea());
System.out.println(" ");
System.out.printf("volume of cylinder : %1.2f" ,cl.volume());


}
}