package interfacediscussion;

public interface Interface2 {


	int i=5;
	public static void main(String[] args) {
		System.out.println(i);// can directly acceess so its static 
		
		i=50;// it shows error so its value is final \
		
		
//		so in interface variables are always public, static and final 
	}
}
