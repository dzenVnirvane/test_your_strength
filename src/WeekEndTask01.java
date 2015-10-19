import java.util.Locale;
import java.util.Scanner;

public class WeekEndTask01
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        boolean oneMoreTime;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int n1 = sc.nextInt();

            System.out.println("Введите знак операции:");
            String op = sc.next();

            System.out.println("Введите второе число:");
            int n2 = sc.nextInt();

            int res = 0;
            switch (op) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "*":
                    res = n1 * n2;
                    break;
                case "/":
                    res = n1 / n2;
                    break;
            }

            System.out.println("Введите знак операции:");
            String op1 = sc.next();

            System.out.println("Введите третее число:");
            int n3 = sc.nextInt();

            switch (op1) {
                case "+":
                    res += n3;
                    break;
                case "-":
                    res -= n3;
                    break;
                case "*":
                    res *= n3;
                    break;
                case "/":
                    res /= n3;
                    break;
            }

            System.out.println("Введите знак операции:");
            String op2 = sc.next();

            System.out.println("Введите четвертое число:");
            int n4 = sc.nextInt();

            switch (op2) {
                case "+":
                    res += n4;
                    break;
                case "-":
                    res -= n4;
                    break;
                case "*":
                    res *= n4;
                    break;
                case "/":
                    res /= n4;
                    break;
            }

            System.out.println(res);
            System.out.println("Желаете еще посчитать что-нибудь? (true или false)");
            oneMoreTime = sc.nextBoolean();
        } while (oneMoreTime);
    }
}