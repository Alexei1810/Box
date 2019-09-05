// четырехзначное число, проверить все ли цифры данного числа различны
public class Exercise5 {
    public static void main(String[] args) {
        int n=3528;
        int a=n%10;
        int b=((n%100)-a)/10;
        int c=((n%1000)-b-a)/100;
        int d=(n-a-b-c)/1000;
        System.out.println("1)"+d+" ,2)"+c+" ,3)"+b+" ,4)"+a);// output of numerals
        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
            System.out.println("true, all numerals are different");
        } else {
            System.out.println("false, there are similar numerals");
        }

    }

}
