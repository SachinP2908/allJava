package constructorUSAge;

public class ThisSuperUsage extends Test4{

	public ThisSuperUsage(int i, String a) {
		super(i, a);

	}
	public static void main(String[] args) {
		ThisSuperUsage ts=new ThisSuperUsage(45, "sac");
	}

}
