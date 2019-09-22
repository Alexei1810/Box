public class Exercise21 {/*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer.*/
    public static void main(String[] args) {
        String s=new String(".");
        System.out.println("String");
        for(int index=0;index<5;index++){
            System.out.print(s);
            s+=s;
        }
        System.out.println("\nStringbuilder");
        StringBuilder sb=new StringBuilder(".");
        for(int index=0;index<5;index++){
            System.out.print(sb);
            sb.append(sb);
        }
        System.out.println("\nStringBuffer");
        StringBuffer strbuf= new StringBuffer(".");
        for(int index=0;index<5;index++){
            System.out.print(strbuf);
            strbuf.append(strbuf);
        }
    }
}
