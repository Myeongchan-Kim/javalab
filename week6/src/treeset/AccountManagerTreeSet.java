package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountManagerTreeSet {
	
	public TreeSet<Account> accounts = new TreeSet<Account>();
	
	public AccountManagerTreeSet(){
		this(10);
	}
	
	public AccountManagerTreeSet(int size){
		accounts = new TreeSet<Account>(new Account());
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
		
		/*
		 * for( int i=0; i< accounts.size(); i++){
			Account acc = accounts.get(i);
			
			if(acc.getAccountNumber().equals(accountNumber)){
				acc.deposite(money);
				return;
			}
		}
		*/
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
