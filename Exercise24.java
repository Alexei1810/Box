package Box;
public class Exercise24 {
    /*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/
    int s=0;
    int m=0;
    int h=0;
   public Exercise24(int sec){//конструктор 1
       s=sec;
   }
   public Exercise24(int sec,int min,int h){//конструктор 2
       this.s=sec;
       this.m=min;
       this.h=h;
   }
private int allSec(){//метод для вычисления всех секунд
       int allS=(h*60*60)+(m*60)+s;
       return allS;
}
public void allSecOut(){//метод для вывода общего кол-ва секунд
    System.out.println(allSec());
}
public void compareOb(int sec){//метод сравнения двух объектов
   if (allSec()==sec){
       System.out.println("objecty ravny");
   } else{
       System.out.println("objecty nie ravny");
   }
}
}


