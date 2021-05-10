class Account{
    int no = 1;
    String name ="jobin";
    String type ="M";
    int bal = 1000;

    void credit(int amount){
        this.bal = this.bal + amount;
    }

    void debit(int amount){
        this.bal = this.bal - amount;
    }

    void check(){
        System.out.println("Balance is : " + this.bal);
    }
    public static void main(String []arg){
        Account object = new Account();
        object.check();
        object.credit(100);
        object.check();
        object.debit(200);
        object.check();
    }
}