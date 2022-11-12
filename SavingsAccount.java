public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNum = 0;
	private String accountNum;

	public SavingsAccount(String n, double a) {
		super(n, a);
		accountNum = super.getAccountNumber() + "-" + savingsNum;
	}

	public void postInterest() {
		double interest = getBalance() * (rate / 1200);
		deposit(interest);
	}
	
	public SavingsAccount(SavingsAccount a, double b) {
		super(a, b);
		savingsNum=savingsNum+1;
		accountNum = super.getAccountNumber() + "-" + savingsNum;
	}

	@Override
	public String getAccountNumber() {
		return accountNum;
	}

	
}