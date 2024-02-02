class Student_challenge_3_bit_merge_mask_1
{
public static void main(String [] args)
{
int a = 10;
int b = 20;
System.out.println("variables before swapping");
System.out.println(" ");
System.out.println("first var" + a);
System.out.println("second var" + b);
a = a^b;
b = a^b;
a = a^b;
System.out.println(" ");
System.out.println("variables after swapping");
System.out.println("first var" + a);
System.out.println("second var " + b);
}
}