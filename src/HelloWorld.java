
class HelloWorld{
	public static void main(String[] args)throws Exception {
	
		Runnable r = new RunnableEx12();
		new Thread(r).start();
		new Thread(r).start();
		
	}
}
class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
		}
	}
}
class RunnableEx12 implements Runnable{
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random() * 3 + 1)*100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	}
}