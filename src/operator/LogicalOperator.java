package operator;

public class LogicalOperator {
	public static void main(String[] args) {

		int i=10;
		int j=50;
		boolean k=i==10;
		boolean l=j>20;
  //AND && Operator
		boolean m=k&&l;
		System.out.println(m);
  //  OR || operator
		m=k||l;
		System.out.println(m);
// 	  NOT Operator   !
		int e=10;
		boolean p=!(e==i);
		System.out.println(p);
	}
}
