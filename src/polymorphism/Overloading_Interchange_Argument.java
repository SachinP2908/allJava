package polymorphism;

public class Overloading_Interchange_Argument {
	// method with same name,same signature but different sequence
	// it is applicable to any type of methid
	public static void m1(int a, String i) {
		System.out.println("m1 1st method");
	}

	public static void m1(String i, int a) {
		System.out.println("m1 2nd method");
	}

	public static void main(String[] args) {
		m1(22, "sac");
		m1("sac", 22);
	}

}
