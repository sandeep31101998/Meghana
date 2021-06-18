
public class AccessSpecifiers {

	// access any where
	public static void pub() {
		System.out.println("i am public");
	}
	
	// access only within the class
	private static void pri() {
		System.out.println("i am private");
	}
	
	//with in the class and inherited class
	protected void pro() {
		System.out.println("i am protected");
	}
	
	
}
class B extends AccessSpecifiers
{
	public static void main(String[] args) {
		
		B b = new B();
		b.pro();
		
	}
}

