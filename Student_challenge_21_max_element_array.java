class Student_challenge_21_max_element_array
{
static int arr_max(int a[])
{
int k = a[0];
for(int i = 0 ; i <a.length;i++)
{
if(a[i]>k)
	
    k = a[i];
	
}

return k;


}





public static void main(String [] args)
{
int l[] = {1,10,3,4};
	
System.out.println(arr_max(l));
}


}