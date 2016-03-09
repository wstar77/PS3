package base;
import java.util.Date;

public class Account {

	//fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// no arg
	Account () {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
				
	}
	// account that takes in specific id and initial balance, along with an annual interest rate
	Account(int specificId, double initialBalance, double newAnnualInterestRate) {
		id = specificId;
		balance = initialBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	//computes monthly interest rate from given annual interest rate
	double getMonthlyInterestRate() {
		double mir = annualInterestRate/12;
		return mir;
	}
	
	// computes balance left after a given withdraw amount
	double withdraw (double wdamount) {
		double amountleft = balance -= wdamount;
		return amountleft;
	}
	
	// computes balance after a given deposit amount
	double deposit (double dpamount) {
		double amountafter = balance += dpamount;
		return amountafter;
		}
}