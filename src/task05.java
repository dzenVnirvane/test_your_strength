import java.util.Scanner;

public class task05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число: ");
        long chislo = sc.nextInt();
        int F1 = 0, F2 = 1, Fn = 0, n = 1000;
        while (n != 2 && chislo != Fn && chislo > Fn)
        {
            Fn = F1 + F2;
            F1 = F2; F2 = Fn;
            n--;
        }
        if (chislo == Fn)
            System.out.println("Данное число является числом Фибоначчи");
        else
            System.out.println("Данное число не является числом Фибоначчи.\nБлижайшее число Фибоначчи = " + Fn);
    }
}