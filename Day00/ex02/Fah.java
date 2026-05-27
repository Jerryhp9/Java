package Day00.ex02;

import java.util.Scanner;

public class Fah {

    public static double change_to_celsius(double num1){
        num1 = (num1 - 32) * 5/9;
        return (num1);
    }
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        double num1 = newobj.nextDouble();
        num1 = change_to_celsius(num1);
        System.out.println("\nCelsius:" + num1);
        newobj.close();
    }
}
