package encapsulation;

public class ATMMachine {
public static void balanceEnquiry(int pin) 
{
	BankServer bs=new BankServer();
			bs.getBalance(pin);
	}
public static void main(String[] args) {
	balanceEnquiry(1234);
	BankServer bs=new BankServer();
	bs.withdrawl(5000);
}
}
