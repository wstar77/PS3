package base;
import java.util.Date;
public class Test {

	public static void main(String[] args) {
	   
	
	Account testaccount = new Account(1122, 20000, .045); // new account instance
	testaccount.withdraw(2500); //withdraw
	testaccount.deposit(3000);  //deposit
	java.util.Date dateCreated = new java.util.Date();
	System.out.println("Date Created:" + dateCreated);
	System.out.println("Balance:" + testaccount.getBalance());  //prints date created, balance, and monthly interest, after withdraw and deposit
	System.out.println("Monthly Interest:" + testaccount.getMonthlyInterestRate());
	}
}
