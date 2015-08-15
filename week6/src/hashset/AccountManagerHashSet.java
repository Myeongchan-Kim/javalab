package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AccountManagerHashSet {
	
	public HashSet<Account> accounts = new HashSet<Account>();
	
	public AccountManagerHashSet(){
		this(10);
	}
	
	public AccountManagerHashSet(int size){
		accounts = new HashSet<Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account acc = new Account(accountNumber, accountName, balance);
		this.accounts.add(acc);
	}
	
	public void setDeposite( String accountNumber, float money ){
		
		Iterator<Account> ir = accounts.iterator();
		while(ir.hasNext()){
			Account acc = ir.next();
			
			if(acc.getAccountNumber().equals(accountNumber)){
				acc.deposite(money);
				return;
			}
		}
		
		System.out.println("There is no Account. has than number");
	}
	
	public void displayAll(){
		Iterator<Account> ir = accounts.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		System.out.println(accounts);
		
	}
}
