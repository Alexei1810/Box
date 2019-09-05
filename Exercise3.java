public class Exercise3 {
    public static void main(String[] args) {
         /* 4500 секунд,
         А)сколько минут
         B)сколько часов
         C)сколько дней
         D)сколько недель
          */
        int s = 4500;                        // part A
        int sec = s % 60;
        int min = (s - sec) / 60;
        System.out.println("A)" + "minuts=" + min + "secunds=" + sec);
        int minB = min % 60;            // part B
        int h = (min - minB) / 60;
        System.out.println("B)" + "hours=" + h + "minuts=" + minB + "secunds=" + sec);
        int hC = h % 24;               //part C
        int days = (h - hC) / 24;
        System.out.println("C)" + "days=" + days + "hours=" + hC + "minuts=" + minB + "secunds=" + sec);
        int daysD = days % 7;           // part D
        int weeks = (days - daysD) / 7;
        System.out.println("D)" + "weeks=" + weeks + "days=" + daysD + "hours=" + hC + "minuts=" + minB + "secunds=" + sec);

    }

}
