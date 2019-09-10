import java.util.Scanner;
public class Exercise15 {/*создат массив, заполнить его случайными элементами, распечатать, перевернуть,
и снова распечатать(припереворачивании нежелательно создавать ещё одинмассив)*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input number of all elements of array");
        int all=sc.nextInt();
        int array []=new int[all];
        for (int index=0;index<all;index++){
            array[index]=(int)(Math.random()*10);
            System.out.println(array[index]);
        }
        for(all-=1;all>=0;all--){
            System.out.println("<--"+array[all]);
        }
    }
}
