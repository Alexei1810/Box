package Box.Ex27;

public class BankCard {
    private int money;
    public void putMoney(int m){
        this.money+=m;
    }
    public void takeMoney(int m){
        this.money-=m;
    }
    public void magnStrip(){
        System.out.println("You payed with magnetic strip");
    }

}
