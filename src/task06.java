import java.util.Scanner;

public class task06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out. print("Пожалуйста, введите  положительное число не более 20 (результат ограничен вместимостью типа long): ");
        int chislo = sc.nextInt();
        long factor = chislo;
        while (chislo != 1)
        {
            factor = factor * (chislo - 1);
            chislo--;
        }
        System.out. print("Факториалом данного числа есть число " + factor);
    }
}