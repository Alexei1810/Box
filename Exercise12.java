import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("vvedite kol-vo kratnych 3 chisel");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board=n*3;
        int sum=0;
        for( int a=1; a<=board; a++){
            int dig=a%3;
            if(dig==0){
                sum+=a;
            }
            }
        System.out.println("summa="+sum);
        }
    }
