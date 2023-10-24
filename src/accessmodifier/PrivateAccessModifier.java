package accessmodifier;

public class PrivateAccessModifier {
	private void m1() {
		System.out.println("private m1 method");

	}

	private void m2() {
		System.out.println("private m2 method");
	}

	public static void main(String[] args) {
		PrivateAccessModifier pa = new PrivateAccessModifier();
		pa.m1();
		pa.m2();
	}
}
