package accessmodifier;

import constructorUSAge.Test4;

public class MainMEthodToCall {
public static void main(String[] args) {
	Test4 cu=new Test4 (4, "a");
	PublicAccessModifier.m1();// public so we can access from another package
	DefaultAccessModifier.m2();// we can call inside package but not outside 
	PrivateAccessModifier pa=new PrivateAccessModifier();
//	 pa.m1();
//	 pa.m2();  // its private so we cannot call outside the package
	
	
}
}
