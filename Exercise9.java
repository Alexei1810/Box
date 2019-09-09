public class Exercise9 {
    public static void main(String[] args) {
        int fact=1;
        int x=(int)(Math.random()*20);
        while (x!=0) {
            x = (int) (Math.random() * 20);
            fact *= x;
            System.out.println(x);
            System.out.println("factorial=" + fact + "*" + x + "=" + (fact * x));
        }
    }
}
