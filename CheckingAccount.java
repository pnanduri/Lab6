public class CheckingAccount extends BankAccount {
	private static final double FEE = .15;

	public CheckingAccount(String n, int a) {
		super(n, a);
		setAccountNumber(getAccountNumber() + "-10");
	}

	@Override
	public boolean withdraw(double a) {
		double totalAmount = FEE + a;
		boolean w = super.withdraw(totalAmount);
		return w;
	}
}