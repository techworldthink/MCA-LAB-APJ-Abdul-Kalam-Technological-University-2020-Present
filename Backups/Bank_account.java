public class Bank_account {
    int balance=1000;
    public void credit(int amount){
        balance=balance+amount;
        System.out.println("After credit : " + balance);
    }

    public void debit(int amount){
        if(balance - amount >= 1000){
            balance=balance-amount;
            System.out.println("After debit : " + balance);
        }
        else{
            System.out.println("Minimum balance must keep.can't withdraw");
        }
       
    }
    public static void main(String []args){
        Bank_account acc_1 = new Bank_account();
        acc_1.credit(200);
        acc_1.debit(100);

        Bank_account acc_2 = new Bank_account();
        acc_2.credit(100);
        acc_2.debit(500);
    } 
}