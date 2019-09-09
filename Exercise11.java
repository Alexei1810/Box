import java.util.Scanner;
public class Exercise11 { // узнать делится ли число только на 1 и на себя без остатка
    public static void main(String[] args) {
        System.out.println("input a number");
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        if (digit==1){
            System.out.println(("chislo prostoje"));
        }
        for(int a=2; a<=digit; a++){
            if ( digit==a){
                System.out.println("chislo prostoje");
                break;
            }
            int check=digit%a;
            if (check==0){
                System.out.println("chislo nie prostoje");
                break;
            }
        }

    }
}
