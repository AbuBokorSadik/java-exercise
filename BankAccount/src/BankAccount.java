public class BankAccount {
    private final String INVALID_BALANCE_DIPODIT_STATUS = "Invalid Balance Diposit";
    private final String INVALID_BALANCE_WITHDRAWAL_STATUS = "Invalid Balance Withdrawal";
    private final String SUCCESS_DIPOSIT_STATUS = "Diposit Successful";
    private final String SUCCESS_WITHDRAWAL_STATUS = "Withdrawal Successful";
    private String accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void dipositFunds(double balance){
        if (balance <= 0){
            System.out.println(INVALID_BALANCE_DIPODIT_STATUS);
            return;
        }
        System.out.println(SUCCESS_DIPOSIT_STATUS);
        this.balance += balance;
        return;
    }
    public void withdrawalFunds(double balance){
        if (balance > this.balance){
            System.out.println(INVALID_BALANCE_WITHDRAWAL_STATUS);
            return;
        }
        System.out.println(SUCCESS_WITHDRAWAL_STATUS);
        this.balance -= balance;
        return;
    }
}
