import java.util.Scanner;

public class task09
{
    public static void main (String[] args)
    {
        double arg;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Пожалуйста, введите целое число: ");
            arg = sc.nextDouble();
        } while (arg % 1 != 0);
        System.out.print("Спасибо!");
    }
}
