public class account {
    private String name;
    private int balance = 0;
    private boolean loggedIn = false;


    public account (String name, int balance, boolean loggedIn) {
        this.name = name;
        this.balance = balance;
        this.loggedIn = loggedIn;
    }

    public String GetName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean checkLoggedIn() {
        return loggedIn;
    }

    public boolean login() {
        loggedIn = true;
        return loggedIn;

    }
    public boolean logout() {
        loggedIn = false;
        return loggedIn;
    }

    public int credit (int amount) {
        balance += amount;
        return balance;
    }

    public int debit (int amount) { // debit an account of money.
        if (amount <= balance){
            balance -= amount;
        }else{
            System.out.println("amount exceeded balance");
        }
        return balance;
    }




}
