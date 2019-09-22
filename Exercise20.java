import java.util.Scanner;
public class Exercise20 {/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//ввод текста
        System.out.println("input a string");
        String s1 = sc.nextLine();
        String s = s1.trim();
        String val []=s.split("\\s+");//создание массива слов из введеного текста
        int leng=0;//вводится переменная для работы с длиной слов
        char last []=new char[val.length];//создается массив последних символов каждого слова
        for(int index=0;index<val.length;index++){//создается цикл в котором массив last заполняется посл. символами
           leng= val[index].length();
           if(val[index].charAt(leng-1)==','){
               last[index]=val[index].charAt(leng-2);
           } else {
               last[index]=val[index].charAt(leng-1);
           }
        }
        String str=String.valueOf(last);//вывод текста из последних букв каждого слова
        System.out.println(str);
    }
}
