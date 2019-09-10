import java.util.Scanner;
public class Exercise16 {/* определите сумму элементов одномерного массива,
расположенных между минимальным и максимальным значениями*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number of all elements of an array");
        int all = sc.nextInt();
        int array[] = new int[all];
        for (int i = 0; i < all; i++) {
            System.out.println("input number for " + i + " element of array");
            array[i] = sc.nextInt();
        }
            int max = 0;
            for (int index = 0; index < all; index++) {
                if (array[max] < array[index]) {
                    max = index;
                }
            }
        int min = 0;
        for (int index = 0; index < all; index++) {
            if (array[min] > array[index]) {
                min = index;
            }
        }
        int sum=0;
        if(min<max) {
            for (min += 1; min < max; min++) {
                sum += array[min];
            }
        }
            if(max<min){
                for(max+=1;max<min;max++){
                    sum+=array[max];
                }
            }
        System.out.println("sum="+sum);
        }
        }
