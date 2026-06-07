package Day00.ex05;

public class Multi_num {
    public static void main(String[]args){
        System.out.println("..........Multiplication Table..........\n");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Multiplication of " + i);
            System.out.println("--------------------------------------------");
            for (int j = 1; j <= 10; j++)
            {
                int result = (j * i);
                System.out.println(j + " * " + i + " = " + result);
            }
            System.out.println("--------------------------------------------\n");
        }
        System.out.println("..........End of Multiplication..........");
    }
}
