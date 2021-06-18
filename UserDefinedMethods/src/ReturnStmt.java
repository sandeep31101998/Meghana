
public class ReturnStmt {

//	{
//		System.out.println("this is block or scope");
//	}
	
	//returns nothing 
	public void Void() 
	{
		System.out.println("this is void");
	}
	
	public void swap(int a,int b) 
	{
		System.out.println(b+" "+a);
	}
	
	//returns int value
	public int sum(int a,int b) //formal paramenter
	{
		return a+b;
	}
	
	//returns double value
	public double sqrt(double num) 
	{
		return Math.sqrt(num);
	}
	
	//returns String value
	public String myName(String name)
	{
		return name;
	}
	
	public boolean even(int num) 
	{
		if(num%2==0)
		{
			return true;
		}
		
		return false;
	}
	
	public int sendingdata()
	{
		return 1;
	}
	
	
	public static void main(String[] args) {
		
		ReturnStmt rs = new ReturnStmt();
	
		System.out.println(rs.sendingdata());
//		rs.Void();
//		int a = rs.sum(10, 20);//actual parameters
//		System.out.println(a);
//		System.out.println(rs.sqrt(16));
//		System.out.println(rs.myName("meghana"));
//		rs.swap(10, 20);
		
		System.out.println(rs.even(3));
	}

}
