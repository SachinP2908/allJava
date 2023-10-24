package javapakg;

public class MainClassToCall {

	public static void main(String[] args) {
		StaticMethodM1.m1();

		NonStaticMethodM2 nsm=new NonStaticMethodM2();
		nsm.M2();
		
	}
	
}
