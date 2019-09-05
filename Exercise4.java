public class Exercise4 {
    public static void main(String[] args) {
        // Четырехзначное число записать наоборот
        int n=1234;//Целое число
        int a=n%10;//Разряд единиц
        int b=((n%100)-a)/10;//Разряд десятков
        int c=((n%1000)-(n%100))/100;//Разряд сотен
        int d=(n-(n%1000))/1000;//Разряд тысяч
        int N= (a*1000)+(b*100)+(c*10)+d;// Обратное число
        System.out.println(N+" -inverse number");
    }
}
