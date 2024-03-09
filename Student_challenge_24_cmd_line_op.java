class Student_challenge_24_cmd_line_op
{


public static void main(String [] a)
{
double s = 0;

for(String x:a)
{
	if(x.matches("[0-9\\.]+"))
	s = s+Double.parseDouble(x);
}

System.out.println(s);

}
}