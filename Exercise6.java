// Введите число, определить является ли оно трехзначным, определить является ли последняя цифра 7?ф
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input random number ");
        int x=scan.nextInt();//ввод числа
        if ((x/1000)==0 & (x/100)>=1){//проверка числа на трехзначность
             System.out.println("this number is three-digit");
        } else{
        System.out.println("this number isnt three-digit");
        }
        int last=(x%10);//проверка является ли последняя цифра числа -7?
        if (last ==7){
            System.out.println("last numeral is 7");
        } else if(last==-7) {
            System.out.println("last numeral is 7");
        } else {
            System.out.println("last numeral isnt 7");
        }

        }
}
