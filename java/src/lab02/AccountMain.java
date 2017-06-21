package lab02;

public class Main {

	public static void main(String[] args) {
		
		Account ac1 = new Account("111222","90","3445","Babis Stergiou");
		Account ac2 = new Account("222444","80","8874","Takis Petaloudas");

		ac1.printBalance();
		ac2.printBalance();

		ac1.deposit(100);
		ac1.deposit(2000);

		ac2.deposit(50000);
		ac2.deposit(4000);

		ac1.withdraw(1500);
		ac2.withdraw(7000);
		ac1.withdraw(80000);

		ac1.printBalance();
		ac2.printBalance();

		ac1.printIBAN();
		ac2.printIBAN();

		ac1.printLog();
		ac2.printLog();

	}

}
