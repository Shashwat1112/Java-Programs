package Basic_OOPS1;

public class Bank {
    public static void main(String[] args) {
        SavingsAccount s2= new SavingsAccount();
        double amt= s2.deposit(50000);
        System.out.println("Amount in bank class = "+amt);
        SavingsAccount s1= new SavingsAccount();
        double amt1= s2.deposit(9000);
        System.out.println("Amount2 in bank class = "+amt1);
    }
}
