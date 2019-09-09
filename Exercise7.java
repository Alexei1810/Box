import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input size of a");
        int a=scan.nextInt();
        System.out.println("input size of b");
        int b=scan.nextInt();
        System.out.println("input size of r");
        int r=scan.nextInt();
        int diam=r*2;
        double hypot=Math.sqrt((a*a)+(b*b));
        System.out.println("hypotenuse="+hypot);
        System.out.println("dia="+diam);
        if (diam>=hypot) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
