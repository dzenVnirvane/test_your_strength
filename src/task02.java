import java.util.Scanner;

public class task02
{
    public static void main(String [] args)
    {
        final int x; final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйста, введите значение угла х: ");
        x = sc.nextInt();
        if (Math.toDegrees(Math.sin(x)) < 0)
            System.out.println("Синус " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Синус " + x + " градусов имеет положительное значение");
        System.out.println("Синус " + x + " градусов = " + Math.toDegrees(Math.sin(x)));
        if (Math.toDegrees(Math.cos(x)) < 0)
            System.out.println("Косинус " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Косинус " + x + " градусов имеет положительное значение");
        System.out.println("Косинус " + x + " градусов = " + Math.toDegrees(Math.cos(x)));
        if (Math.toDegrees(Math.tan(x)) < 0)
            System.out.println("Тангенс " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Тангенс " + x + " градусов имеет положительное значение");
        System.out.println("Тангенс " + x + " градусов = " + Math.toDegrees(Math.tan(x)));
        if (1 / Math.toDegrees(Math.tan(x)) < 0)
            System.out.println("Котангенс " + x + " градусов имеет отрицательное значение");
        else
            System.out.println("Котангенс " + x + " градусов имеет положительное значение");
        System.out.println("Котангенс " + x + " градусов = " + 1 / Math.toDegrees(Math.tan(x)));
    }
}
