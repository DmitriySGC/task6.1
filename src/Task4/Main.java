package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число x: ");
        int x = in.nextInt();
        System.out.print("Введите второе число y: ");
        int y = in.nextInt();
        System.out.print("Введите третье число z: ");
        int z = in.nextInt();
        double result= (x+y+z)/3.0;
        System.out.println("Среднее арифметическое x,y,z:" + Math.floor(result));
        result = result/2;
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }






    }
}
