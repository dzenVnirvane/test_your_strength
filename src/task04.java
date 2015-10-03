import java.util.Scanner;

public class task04
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out. print("Пожалуйста, введите номер желаемого числа Фибоначчи: ");
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("Номер числа Фибоначчи может начинаться с единицы");
        int F1 = 0, F2 = 1, Fn = 0, n1 = n;
        if (n == 1)
            Fn = 0;
        if (n == 2)
            Fn = 1;
        while (n > 2)
        {
        Fn = F1 + F2;
        F1 = F2; F2 = Fn;
        n--;
        }
        if (n1 > 0)
        System.out.println("Число Фибоначчи под номером " + n1 + " = " + Fn);
    }
}