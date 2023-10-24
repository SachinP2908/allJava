package abstractpk;

public abstract class AbtractMethod {


	public abstract void m4();
	// this is incomplete method but even describe as abstract is give error
//	 so we have to define that class as abstract
//	and that method also we have to declaire as abstract
//	even tht class abstract having not abstract does not affect
//	We cannot crate object of abstract class becoz they dont have body
//	to call complete methods from abstraCt class we can call them through child clss in which we need to provide
//	BODY OF UNIMPLEMENTED CLASS
	public void m2() 
	{
		System.out.println("This is complete non static method");
	}
	public static void m3() 
	{
		System.out.println("This is complete static method");
		}
}
