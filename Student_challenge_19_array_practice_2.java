class Student_challenge_19_array_practice_2
{
public static void main(String [] args)
{
int a[] = {1,2,3,4,5,6};
int b[] = new int [6];


for(int i = a.length-1 ,j=0; i>=0 ;i--,j++)
{
b[j] = a[i]; 

 
}



for (int x:b)
{
	System.out.print(x);
}	



}

}