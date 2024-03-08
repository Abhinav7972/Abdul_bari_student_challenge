class Student_challenge_23_var_Arg_3
{
	
static double sum(double ...t)
{
double s = 0;	
for(int i = 0 ; i <t.length;i++)
{
s = s + t[i];

}	

return s;
	
}


	
	
	
static double discount(double  ...p)
{
double s = 0;	
for(int i = 0 ; i <p.length;i++)
{
s = s + p[i];

}


if(s<500) return s*0.12;	

if(s>=500 && s<1000) return s*0.15;

else return s*0.20;
	
	
}







public static void main(String [] args)
{
double p [] = {100,20,30,40};	
System.out.print("given prices are : ");
for(double x:p)
{
System.out.print(x + " ");	
}

System.out.println(" ");

System.out.println("sum of price are :" + sum(p));
System.out.println("discount applicable to  price are :" + discount(p));


}

}