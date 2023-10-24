package polymorphism;

public class Overriding_child extends Overriding_Parent {
	public void m1() {
		System.out.println("oVERRIDING FROM CHILD ");
	}

	public static void m2() {
		System.out.println("oVERRIDING sattic  FROM child ");
	}

	public static void main(String[] args) {

		Overriding_child oc = new Overriding_child();
		oc.m1();// child
		Overriding_Parent oc1 = new Overriding_Parent();
		oc1.m1();// parent
		m2();// parent
		Overriding_Parent.m2();

	}

}
