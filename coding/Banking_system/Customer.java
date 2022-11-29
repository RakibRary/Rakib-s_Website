//Rakib Rary
//CSCI 313
//Anne Smith Thompson
//Mon-Wed section

public class Customer implements Comparable<Customer>{ //implement comparable
	private String last, first;
	private String acctNo;
	private double balance;
	
	public Customer() {
	}
	//-----------------------------------------------------------------------------------------
	public Customer(String last, String first, String acctNo, double balance) {
		this.last = last;
		this.first = first;
		this.acctNo = acctNo;
		this.balance = balance;
	}
	//--------------------------------------------------------------------------------------------
	//toString method
			public String toString() {
				return "Customer [last=" + last + ", first=" + first + ", acctNo=" + acctNo + ", balance=" + balance
				+ ", getLast()=" + getLast() + ", getFirst()=" + getFirst() + ", getAcctNo()=" + getAcctNo()
				+ ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
			}
	//-----------------------------------------------------------------------------------------
	//setters and getters
	public String getLast() {
		return last;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getAcctNo() {
		return acctNo;
	}
	
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//-----------------------------------------------------------------------------------------
		public double deposit(double amount) {
			
			return balance += amount;
			
		}
		
		public double withdraw(double amount) {
			return balance -= amount;
		}
		//-------------------------------------------------------------------------------------
		public boolean equals(Customer other) {
			if(acctNo.equals(other.getAcctNo())){
					return true;
			}else {
				return false; 
			}
		}
		//-----------------------------------------------------------------------------------------
		public int compareTo(Customer other) {
			if(last.equals(other.getLast())) {
				if(first.equals(other.getFirst())) {
					return 0;
				}else {
					return 1;
				}
			}
			return 1;
		}
		
}
