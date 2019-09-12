import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise14 {
    /*создать массив оценок произвольной длины,вывести максимальную и минимальную
оценку, её(их) номер.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//создаем массив
        System.out.println("input a number of all marks");
        int numMarks=sc.nextInt();
        int array[]=new int[numMarks];
        for(int index=0;index<numMarks;index++){//присваеваем рандомное число каждому элементу массива
            array[index]=(int)(Math.random()*10+1);
            System.out.println(array[index]);
        }
        int max=0;//находим наибольшее число среди элементов массива
        for(int index=0;index<numMarks;index++){
        if(array[max]<array[index]) {
            max = index ;
        }
        }
        System.out.println("max number="+array[max]);// вывод большего числа
        int min=0;// находим наименьшее число
        for(int index=0;index<numMarks;index++){
            if(array[min]>array[index]) {
                min = index ;
            }
        }
        System.out.println("min number="+array[min]);// вывод меншего числа
        System.out.println("index of max elements");//вывод индексов всех наибольших чисел
        for(int index=0;index<numMarks;index++){
            if(array[index]==array[max]){
                System.out.println(index);
            }
        }
        System.out.println("index of min elements");//вывод индексов всех наменьших чисел
        for(int index=0;index<numMarks;index++){
            if(array[index]==array[min]){
                System.out.println(index);
            }
        }
    }
}

