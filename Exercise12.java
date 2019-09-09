import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("vvedite chislo do kotorogo budet idti proverka");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for( int a=1; a<=n; a++){
            int dig=a%3;
            if(dig==0){
                sum+=a;
            }
            if (a==n){
                System.out.println("summa nuzhnyh chisel="+sum);
            }
        }
    }
}
