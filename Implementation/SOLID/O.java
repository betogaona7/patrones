
public class Account {
	private AccountType _act;
	public Account(String act){
		try{
			Class c = Class.forName(act);
			this._act = (AccountType) c.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void deposit (int amt) {
		this._act.deposit(amt);
	}
}

public abstract class AccountType {
	public abstract void deposit(int amt);
}


public class CheckingAccount extends AccountType {
	public void deposit(int amt){
		System.out.println("Amount deposited in checking account : " + amt);
	}
}

public class SavingsAccount extends AccountType {
	public void deposit(int amt){
		System.out.println("Amount deposited in savings account : " + amt);
	}
}