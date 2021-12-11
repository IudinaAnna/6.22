package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static int Celsius(int fahrenheit ) {
        int celsius =(int) (5.0 / 9.0 * (fahrenheit- 32));
        return celsius;
    }
    static int Fahrenheit(int celsius ) {
        int fahrenheit =(int)(9.0 / 5.0 * celsius + 32);
        return fahrenheit;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("1.С форенгейта в цельсии перевод "+"\n"+"2.С цельсий в форенгейт перевод"+"\n");
        System.out.print("Выберите цифру : ");
        int select=input.nextInt();
        switch (select) {
            case 1:
                System.out.print("Введите форенгейты: ");
                int fahrenheit=input.nextInt();
                System.out.println("Цельсии: "+Celsius(fahrenheit));
                break;
            case 2:
                System.out.print("Введите цельсии: ");
                int celsius=input.nextInt();
                System.out.println("Форенгейты: "+Fahrenheit(celsius));
                break;
        }
    }
}
