import java.util.Scanner;

class Student_challenge_2_cuboid_area_1
{

public static void main(String [] args)
{
int length,bredth,height;
int front_back_area,right_left_area,top_bottom_area;
int total_Area,volume;
System.out.println("following are program to calculate area and volume of cuboid");
System.out.println("");
Scanner sc = new Scanner(System.in);

System.out.println("Enter length,bredth and height");
System.out.println("");
length = sc.nextInt();
bredth = sc.nextInt();
height = sc.nextInt();
System.out.println("");
front_back_area = 2*length*bredth;
right_left_area = 2*length*height;
top_bottom_area = 2*bredth*height;

total_Area = front_back_area + right_left_area + top_bottom_area;
volume = length*bredth*height;

System.out.println("Total area of cuboid is " + total_Area);
System.out.println("");
System.out.println("volume of cuboid is " + volume);
 
}

}