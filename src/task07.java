import java.util.Scanner;

public class task07
{
    public static void main(String[] args)
    {
        int chislo1 = 0, chislo2 = 0;
        while (chislo2 >= chislo1)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Пожалуйста, введите первое число, должно быть больше второго: ");
            chislo1 = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Пожалуйста, введите второе число: ");
            chislo2 = sc1.nextInt();
            if (chislo2 >= chislo1)
                System.out.println("Ашипка, возвращение к вводу числа.");
        }
        long factor = chislo2;
        int buf = chislo2;
        while (buf != 1)
        {
            factor *= (buf - 1);
            buf--;
        }
        System.out.print(factor);
        long factor1 = chislo1;
        while (chislo2 != chislo1)
        {
            chislo2++;
            System.out.print(" * " + chislo2);
        }
    }
}