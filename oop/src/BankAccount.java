import java.util.ArrayList;

public class BankAccount {
    private int number;
    private String name;
    private double balance;

    public BankAccount(int num, String who, double bal) {
        this.number = num;
        this.name = who;
        this.balance = bal;
    }

    public void deposit(double dep) {
        balance += dep;
    }

    public void withdraw(double wit) {
        balance -= wit;
    }

    public ArrayList<String> info() {
        ArrayList<String> account = new ArrayList<>();
        account.add(Integer.toString(number));
        account.add(name);
        account.add(Double.toString(balance));
        return account;
    }

    public static void main(String[] args) {
        BankAccount jenkins = new BankAccount(13, "Jenkins", 120.03);
        BankAccount mary = new BankAccount(4311, "Mary", 30000);
        jenkins.deposit(5);
        jenkins.withdraw(30.12);
        mary.withdraw(542.12);
        System.out.println(jenkins.info());
        System.out.println(mary.info());

    }
}
