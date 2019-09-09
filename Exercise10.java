public class Exercise10 {           //factorial 10-15
    public static void main(String[] args) {
        int fact=1;
        for(int a=10; a<=15; a++){
            System.out.println("a="+a);
            fact*=a;
            System.out.println("factorial="+fact);
        }
    }
}
