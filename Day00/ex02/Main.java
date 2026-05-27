package Day00.ex02;

// import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static double change_to_fahrenheit(double num){
        num = (num * (9/5)) + 32;
        return (num);
    }
    public static void main(String[] args)
    {
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter Celsius:");
        double num = newobj.nextDouble();
        System.out.println("\n");
        num = change_to_fahrenheit(num);
        System.out.println("Fahrenheit: " + num);
        newobj.close();

    }
}
