package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //constructor
    public BankAccount(){
        this("56789",2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone){
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + accountBalance);
    }

    public void withdrawal(double withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Only "+ accountBalance + " available. Widthdrawl not processed");
        }else{
            this.accountBalance -= withdrawalAmount;
            System.out.println("Widthrawal of "+ withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
