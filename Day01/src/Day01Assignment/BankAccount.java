package Day01Assignment;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && !accountNumber.isEmpty()) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("Invalid account number");
		}
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance");
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		account.setAccountNumber("33419797245");
		account.setBalance(1000.0);

		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: $" + account.getBalance());
	}
}
