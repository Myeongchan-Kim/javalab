package treemap;

public class AccountNumber implements Comparable<AccountNumber> {
	String accountNumber;
	
	public AccountNumber(String number){
		this.accountNumber = number;
	}
	
	@Override
	public int compareTo(AccountNumber accNum){
		return this.accountNumber.compareTo(accNum.accountNumber) * -1;
	}
	
	public String toString(){
		return accountNumber;
	}

}
