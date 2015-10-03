import java.util.Scanner;

public class task08
{
    public static void main (String[] args)
    {
        double arg;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Пожалуйста, введите положительное число: ");
            arg = sc.nextDouble();
        } while (arg <= 0);
        System.out.print("Спасибо!");
    }
}
