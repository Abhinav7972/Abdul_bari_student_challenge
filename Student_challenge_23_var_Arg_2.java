class Student_challenge_23_var_Arg_2
{
static int sum(int ...a)
{
int s = 0;	
for(int i = 0 ; i <a.length;i++)
{
s = s + a[i];


}	

return s;	
}






public static void main(String [] args)
{
System.out.println(sum(10,20,30,40,50,60,90));

}

}