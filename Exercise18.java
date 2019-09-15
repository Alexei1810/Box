import java.util.Scanner;/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/
public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a string");
        String s=sc.nextLine();
       int count=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)=='?'||s.charAt(i)=='-'
           ||s.charAt(i)==':'||s.charAt(i)=='"') {
               count++;
           }
       }
        System.out.println(count);
    }
}
