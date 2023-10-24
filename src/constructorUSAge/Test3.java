package constructorUSAge;

public class Test3 {   //  calling cinstructor in another constructor and use of this keyword
	public Test3() 
	{
		System.out.println("This is Construcor with no argument");
	}
	public Test3(String i) 
	{
		this();  // to call constructor in another constructor
		System.out.println("This is constructor with agrument ");
	}
	public static void main(String[] args) {
		Test3 ct=new Test3(); 
		Test3 ct1=new Test3("sachin");
		
	}

}
