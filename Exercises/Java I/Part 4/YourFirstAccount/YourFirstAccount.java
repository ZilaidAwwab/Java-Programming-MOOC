public class YourFirstAccount {

    public static void main(String[] args) {
        Account zilaidAccount = new Account("Zilaid's Account", 100.00);
        zilaidAccount.deposit(20.0);
        System.out.println(zilaidAccount);
    }
}
