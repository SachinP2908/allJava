package abstractpk;

public class ChildClassOfAbstractClass extends AbtractMethod {

	@Override
	public void m4() {
System.out.println("unimplemented method");		
	}
	public static void main(String[] args) {
		ChildClassOfAbstractClass c=new ChildClassOfAbstractClass();
		c.m2();
		c.m3();
		c.m4();
	}

	
	
}
