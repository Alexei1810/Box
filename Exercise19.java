import java.util.Scanner;
public class Exercise19 {/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a string");
        String s1=sc.nextLine();
        String s=s1.trim();
        int wordC;
        if(s.isEmpty()){
            wordC=0;
        }else{
          wordC=s.split("\\s+").length;
        }
        System.out.println(wordC);
    }
}
