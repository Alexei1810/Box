import java.util.Random;// рандомное число, правильно просклонять слово рубль
public class Exercise8 {
    public static void main(String[] args) {
        Random rand=new Random();
        int x=rand.nextInt();
        int n=x; if(x<0){n=x*-1;}//переменная n вводится для удобной работы с отриц. числами
        int a=n%100;
        int b=n%10;
        if (b==0 || (a>=5 & a<=20)|| (b>=5 & b<=9)) {//правило для рублей
            System.out.println(x+" rubley");
        } else if (b==1) {//                         правило для рубль
            System.out.println(x+" rubl");
        } else {  //                                  правило для рубля
            System.out.println(x+" rubla");
        }
    }
}
