package polymorphism;

public class MainMethodOverLoad {
	public static void m() {
		System.out.println("sdasfc");
	}

	public static void m(int i) {
		System.out.println("sacdsa");
	}

	public static void main(String[] args) {
		m();
		m(22);
	}

	public static void main() {
		m(22);
	}

}
