public class Exercise13 {// создать последовательность случайных чисел найти и вывести наибольшее из них
    public static void main(String[] args) {
        int array []=new int[10];//создаем массив из 10 чисел
        for(int index=0;index<10;index++){//заполняем массив случайными числами от 0 до 10
            array[index]=(int)(Math.random()*10);
        }
        System.out.println("all numbers");
        for(int index=0;index<10;index++) {//выводим все числа массива
            System.out.println(array[index]);
        }
        int max=0;//находим наибольшее из чисел и выводим его
        for(int index=0;index<9;index++) {
            if (array[max]<array[index+1]){
                max=index+1;
            }
        }
        System.out.println("the biggest number ="+array[max]);
    }
}
