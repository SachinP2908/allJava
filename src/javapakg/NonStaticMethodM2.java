package javapakg;

public class NonStaticMethodM2 
{
	public void M2() 
	{
		System.out.println("This is non static method M2");
	}
	
	public static void main(String[] args) {
		
		NonStaticMethodM2 nsm=new NonStaticMethodM2();
		nsm.M2();
	}

}
