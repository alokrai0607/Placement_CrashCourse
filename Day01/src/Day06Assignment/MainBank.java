package Day06Assignment;

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
	}

	public synchronized void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
		} else {
			System.out.println(
					Thread.currentThread().getName() + " tried to withdraw: " + amount + " but insufficient funds.");
		}
	}

	public synchronized double getBalance() {
		return balance;
	}
}

public class MainBank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				account.deposit(100);
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				account.withdraw(200);
			}
		});

		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 8; i++) {
				account.deposit(50);
			}
		});

		Thread thread4 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				account.withdraw(150);
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final balance: " + account.getBalance());
	}
}
