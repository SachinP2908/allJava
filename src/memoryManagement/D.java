package memoryManagement;

public class D extends E {
	public void m10() {
		System.out.println("m7 Method from C class");
		a.m1();
		a.m2();
		a.m3();
	}

	public void m11() {
		System.out.println("m7 Method from C class");

		a.m3();
		b.m6();
		c.m9();
	}

	public static void main(String[] args) {
		D d = new D();
		d.m10();
		d.m11();
		// in E we created counstrcution and by declaring them in class level so we can
		// call over project
//		 in E we would not create object of that class so we declare that class as abstract i.e the use of abstract 
	}
}
