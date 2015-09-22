package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class AccountManagerTreeMap {
	
	public TreeMap<AccountNumber, Account> accounts;
	
	public AccountManagerTreeMap(){
		this(10);
	}
	
	public AccountManagerTreeMap(int size){
		accounts = new TreeMap<AccountNumber, Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account acc = new Account(accountNumber, accountName, balance);
		accounts.put(new AccountNumber(accountNumber), acc);
	}
	
	public void setDeposite( String accountNumber, float money ){
		
		AccountNumber accNum = new AccountNumber(accountNumber);
		if( accounts.containsKey(accNum)){
			Account acc = accounts.get(accNum);
			acc.deposite(money);
			return;
		}

		System.out.println("There is no Account. has than number");
	}
	
	public void displayAll(){
		
		Iterator<AccountNumber> ir = accounts.keySet().iterator();
		while(ir.hasNext()){
			AccountNumber num = ir.next();
			System.out.println(num + " : "+ accounts.get(num));
		}
		
		//System.out.println(accounts);
		
	}
}
