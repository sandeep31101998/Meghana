
public class UserDefinedMethods {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		UserDefinedMethods m = new UserDefinedMethods();

		System.out.println(m.add(10, 20));

	}

}
