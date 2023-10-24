package inheritanceConcept;

public class ChildClass extends ParentClass {
	public void stars() {
		System.out.println("Stars method from child");
	}

	public static void Toys() {
		System.out.println("toys static method from child");
	}

	public static void main(String[] args) {
		Toys();// its static so we can call directly
//	 to call non static method we have to create object of that class
		ChildClass c = new ChildClass();

		c.stars();
		c.CarKeys();
		c.Cash();
		c.Home();

	}
}
