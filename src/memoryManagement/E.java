package memoryManagement;

public class E {

	// in E we created counstrcution and by declaring them in class level so we can
	// call over project
//	 in E we would not create object of that class so we declare that class as abstract i.e the use of abstract 
	A a;
	B b;
	C c;

	public E() {
		a = new A();
		b = new B();
		c = new C();
	}

}
