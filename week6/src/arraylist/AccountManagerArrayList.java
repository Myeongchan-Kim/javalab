package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountManagerArrayList {
	
	public ArrayList<Account> accounts = new ArrayList<Account>();
	
	public AccountManagerArrayList(){
		
	}
	
	public AccountManagerArrayList(int size){
		accounts = new ArrayList<Account>(size);
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
