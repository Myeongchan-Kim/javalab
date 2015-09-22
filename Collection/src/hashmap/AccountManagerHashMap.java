package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AccountManagerHashMap {
	
	public HashMap<String, Account> accounts;
	
	public AccountManagerHashMap(){
		this(10);
	}
	
	public AccountManagerHashMap(int size){
		accounts = new HashMap<String, Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account acc = new Account(accountNumber, accountName, balance);
		accounts.put(accountNumber, acc);
	}
	
	public void setDeposite( String accountNumber, float money ){
		
		if( accounts.containsKey(accountNumber)){
			Account acc = accounts.get(accountNumber);
			acc.deposite(money);
			return;
		}

		System.out.println("There is no Account. has than number");
	}
	
	public void displayAll(){
		
		Set<String> accNameSet = accounts.keySet();
		Iterator<String> ir = accNameSet.iterator();
		while(ir.hasNext()){
			String nextir = ir.next();
			System.out.println(nextir + " : "+ accounts.get(nextir));
		}
		
		
	}
}
