class product
{
private String item_no;
private String name;
private double price;
private short qty;

public void setQty(short qty)
{
	qty = qty;
}

public void setPrice(double price)
{
	price = price;
}



public product(String item_no ,String name)
{
	this.item_no = item_no;
	this.name = name;
}

public product(String item_no,String name,double price, short qty)
{
	item_no = item_no;
	name = name;
	price = price;
	qty = qty;
	
	setPrice(price);
	setQty(qty);
}

public String getItem_no(){return item_no;}
public double getPrice() {return price;}
public String getName(){return name;}
public short  getQty(){return qty;}	
}






class customer
{
	
private String cid;
private String name;
private String phone_no;
private String address;


public void setPhoneno(String phone_no){phone_no = phone_no;}
public void setAddress(String add){add = address;}	


public customer(String cid,String name)
{
this.cid = cid;
this.name = name;	
}

public customer(String cid,String name,String add,String phone)
{
this.cid = cid;
this.name = name;	
setPhoneno(add);
setAddress(phone);	
}

public String getCid(){return cid;}
public String getName(){return name;}
public String getPhone_no(){return phone_no;}
public String address(){return address;}	
		
}



















class Product_customer
{
	
public static void main(String [] args)
{
product p = new product("A1","Milk");
customer c = new customer("C001","alpha");
System.out.println(p.getItem_no()+"  "+p.getName());
System.out.println(c.getCid()+" "+c.getName());

}

}