import java.util.Scanner;

public class task02
{
    public static void main(String [] args)
    {
        int x; final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйста, введите значение угла х: ");
        x = sc.nextInt();
        if (Math.sin(x) < 0)
            System.out.println("Синус " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Синус " + x + " градусов имеет положительное значение");
        System.out.println("Синус " + x + " градусов = " + Math.sin(x));
        if (Math.cos(x) < 0)
            System.out.println("Косинус " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Косинус " + x + " градусов имеет положительное значение");
        System.out.println("Косинус " + x + " градусов = " + Math.cos(x));
        if (Math.tan(x) < 0)
            System.out.println("Тангенс " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Тангенс " + x + " градусов имеет положительное значение");
        System.out.println("Тангенс " + x + " градусов = " + Math.tan(x));
        if (1 / Math.tan(x) < 0)
            System.out.println("Котангенс " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Котангенс " + x + " градусов имеет положительное значение");
        System.out.println("Котангенс " + x + " градусов = " + 1 / Math.tan(x));
    }
}
