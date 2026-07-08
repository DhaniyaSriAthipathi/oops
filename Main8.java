/*ATM System
Features:
Deposit
Withdraw
Balance Enquiry
PIN Verification
Concept: Encapsulation + Object-Oriented Design */
class ATM{
    private int pin=1201;
    private double balance=5000;
    void deposit(double amount){
        amount+=balance;
        System.out.println("depostit details:"+amount);
    }
    void withdraw(double amount){
        if(amount<=balance){
            amount-=balance;
            System.out.println("withdraw amount:"+amount);
        }
        else{
            System.out.println("insuffient balance");
        }
    }
    void balanceenquiry(){
        System.out.println("Balance details:"+balance);
    }
    void pinverification(int pinenter){
        if(pinenter==pin){
            System.out.println("pin verfied");
        }
        else{
            System.out.println("not access invalid pleae try again");
        }
    }
}
public class Main8 {
    public static void main(String[] args) {
        ATM at1=new ATM();
        at1.withdraw(1000);
        at1.deposit(5000);
        at1.balanceenquiry();
        at1.pinverification(1234);

    }
}
