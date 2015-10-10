import java.util.Scanner;

public class finalTask {
    public static void main(String[] args) {
        System.out.println("x1\t\t0 1 0 1\n" +
                "x2\t\t0 0 1 1\n\n" +
                "f0\t\t0 0 0 0\t\tf0\t=\t0\n" +
                "f1\t\t1 0 0 0\t\tf1\t=\tx1 " + '\u2193' + " x2\n" +
                "f2\t\t0 1 0 0\t\tf2\t=\tx1 " + '\u2190' + " x2\n" +
                "f3\t\t1 1 0 0\t\tf3\t=\t\u0305x2\n" +                           //trouble
                "f4\t\t0 0 1 0\t\tf4\t=\tx2 " + '\u2190' + " x1\n" +
                "f5\t\t1 0 1 0\t\tf5\t=\t\u0305x1\n" +                           //trouble
                "f6\t\t0 1 1 0\t\tf6\t=\tx1 " + '\u2295' + " x2\n" +
                "f7\t\t1 1 1 0\t\tf7\t=\tx1 | x2\n" +
                "f8\t\t0 0 0 1\t\tf8\t=\tx1 " + '\u2227' + " x2 = x1 * x2\n" +
                "f9\t\t1 0 0 1\t\tf9\t=\tx1 " + '\u2261' + " x2\n" +
                "f10\t\t0 1 0 1\t\tf10\t=\tx1\n" +
                "f11\t\t1 1 0 1\t\tf11\t=\tx2 " + '\u2192' + " x1\n" +
                "f12\t\t0 0 1 1\t\tf12\t=\tx2\n" +
                "f13\t\t1 0 1 1\t\tf13\t=\tx1 " + '\u2192' + " x2\n" +
                "f14\t\t0 1 1 1\t\tf14\t=\tx1 " + '\u2228' + " x2\n" +
                "f15\t\t1 1 1 1\t\tf15\t=\t1\n");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        byte f, x1, x2, proverka;
        do {
        do {
            System.out.print("Введите номер функции от 0 до 15: ");
            f = sc.nextByte();
        } while (f < 0 || f > 15);
        do {
            System.out.print("Введите значение аргумента х1 (0 или 1): ");
            x1 = sc1.nextByte();
        } while (x1 < 0 || x1 > 1);

        do {
            System.out.print("Введите значение аргумента х2 (0 или 1): ");
            x2 = sc2.nextByte();
        } while (x2 < 0 || x2 > 1);

        switch (f)
        {
            case 0:
                System.out.println("0");
                break;
            case 1:
                if (x1 == 1 || x2 == 1)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 2:
                if (x1 == 1 && x2 != 1)
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            case 3:
                if (x2 == 1)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 4:
                if (x2 == 1 && x1 != 1)
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            case 5:
                if (x1 == 1)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 6:
                if (x1 == x2)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 7:
                if (x1 == 1 && x2 == 1)
                    System.out.println("0");
                else
                    System.out.println("0");
                break;
            case 8:
                if (x1 == 1 && x2 == 1)
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            case 9:
                if (x1 == x2)
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            case 10:
                    System.out.println(x1);
                break;
            case 11:
                if (x1 == 0 && x2 == 1)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 12:
                System.out.println(x2);
                break;
            case 13:
                if (x1 == 1 && x2 == 0)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 14:
                if (x1 == 0 && x2 == 0)
                    System.out.println("0");
                else
                    System.out.println("1");
                break;
            case 15:
                    System.out.println("1");
        }
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Хотите посчитать еще раз? (0, если нет, другое число, если да): ");
            proverka = sc3.nextByte();
        } while (proverka != 0);
    }
}