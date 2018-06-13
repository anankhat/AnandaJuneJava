package dayfive;

public class MethodWithParmater {

	public static void main(String[] args) {
		getOne();
		System.out.println(getAll(4, 4));
	}

	public static void getOne() {
		System.out.println("metho1");
		System.out.println("metho2");
		System.out.println("metho3");
	}

	public static int getAll(int a, int b) {
		return a + b;
	}
}

/* void */
