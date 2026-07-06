/*Bank Account
Create a BankAccount class with:
deposit()
withdraw()
checkBalance()
Concept: Encapsulation*/
class Bankaccount{
    private double balance=5000;
    void deposit(double amount){
        balance+=amount;
        System.out.println(balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(balance);
        }
    }
    void checkBalance(){
        System.out.println(balance);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Bankaccount b1=new Bankaccount();
        b1.deposit(5000);
        b1.withdraw(200);
        b1.checkBalance();
    }
}
