public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        System.out.println("balance = " + bankAccount.getBalance());
        bankAccount.dipositFunds(500);
        System.out.println("After balance diposit = " + bankAccount.getBalance());
        bankAccount.dipositFunds(-100);
        System.out.println("balance = " + bankAccount.getBalance());
        bankAccount.withdrawalFunds(1000);
        System.out.println("After balance withdrawal= " + bankAccount.getBalance());
        bankAccount.withdrawalFunds(1000);
        System.out.println("balance = " + bankAccount.getBalance());

    }
}
