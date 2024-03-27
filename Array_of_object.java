class Subject
{
private String sid;
private String name;
private int maxmarks;
private int marksobtain;

public Subject(String sid,String name,int maxmarks)
{
this.sid=sid;
this.name=name;
this.maxmarks=maxmarks;		
}

public String getSid(){return sid;}
public String getName(){return name;}
public int getMaxmarks(){return maxmarks;}
public int getMarksobtain(){return marksobtain;}


public void setMarksobtain(int mm)
{
	marksobtain = mm;
}

public void setMaxmarks(int mx)
{
	maxmarks = mx;
}

boolean Isqualified()
{
	return marksobtain>=marksobtain/10*4;
}

public String toString()
{
	return "\n Subject ID :" + sid + "\n Name :" + name + "\n Marksobtain :" + marksobtain;
}
}




class Array_of_object
{
public static void main(String [] args)
{
Subject subs[] = new Subject[3];
subs[0] = new Subject("101","DS",100);
subs[1] = new Subject("102","java",100);
subs[2] = new Subject("103","C",100);

for(Subject s:subs)
{
	System.out.println(s);
}

}
}