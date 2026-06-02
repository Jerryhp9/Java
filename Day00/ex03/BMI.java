package Day00.ex03;

import java.util.Scanner;

public class BMI {
    public static void category(double result){
        if (result < 18.5)
            System.out.println("Underweight");
        else if (result >= 18.5 && result <= 24.9)
            System.out.println("Normal");
        else if (result >= 25 && result <= 29.9)
            System.out.println("Overweight");
        else if (result > 30.0)
            System.out.println("Obese");
    }
    public static double BMI_count(double height, double weight){
        double result = weight / (height * height);
        return (result);
    }
    public static void main(String[] args)
    {
        Scanner newobj = new Scanner(System.in); 
        System.out.println("Enter weight (kg)");
        double weight = 0;
        double height = 0;
        int flag = 0;
        while (flag == 0)
        {
            weight = newobj.nextDouble();
            if (weight < 0 || weight > 200)
                System.out.println("Number out of range, try again");
            else
                flag = 1;
        }
        System.out.println("\nEnter height (m)");
        int flag1 = 0;
        while (flag1 == 0)
        {
            height = newobj.nextDouble();
            if (height < 1.00 || height > 2.50)
                System.out.println("Number out of range, try again");
            else
                flag1 = 1;
        }
        double result = BMI_count(height, weight);
        System.out.println("\nBMI:" + result);
        category(result);
        newobj.close();
    }
}
