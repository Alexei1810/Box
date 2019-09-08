import java.util.Scanner;/*Стороны а, б. поместится ли в прямоугольник круг с радиусом р*/
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input size of side a");
        int a=scan.nextInt();
        System.out.println("side a="+a);
        System.out.println("input size of side b");
        int b=scan.nextInt();
        System.out.println("side b="+b);
        System.out.println("input size of radius");
        int r=scan.nextInt();
        System.out.println("rad="+r);
        int diam=r*2;
        if (diam<=a & diam<=b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
