package constructorUSAge;

public class ThisKeyWorkConstructor {

	
	public ThisKeyWorkConstructor() {
		System.out.println("I can call constructor under another constructor");
	}
	public ThisKeyWorkConstructor(int i) 
	{ this();					//this keyword always must be in first line.
		System.out.println("another construcor with argument");
	}
	
	public static void main(String[] args) {
		ThisKeyWorkConstructor t=new ThisKeyWorkConstructor();
		ThisKeyWorkConstructor t1=new ThisKeyWorkConstructor(1);
		
		
	}
}
