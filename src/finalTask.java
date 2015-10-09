import java.util.Scanner;

public class finalTask
{
    public static void  main (String[] args)
    {
        System.out.println("x1\t\t0 1 0 1\n" +
                "x2\t\t0 0 1 1\n\n" +
                "f0\t\t0 0 0 0\t\tf0\t=\t0\n" +
                "f1\t\t1 0 0 0\t\tf1\t=\tx1 " + '\u2193' + " x2\n" +
                "f2\t\t0 1 0 0\t\tf2\t=\tx1 " + '\u2190' + " x2\n" +
                "f3\t\t1 1 0 0\t\tf3\t=\tx2\u0305\n" +                   //trouble
                "f4\t\t0 0 1 0\t\tf4\t=\tx2 " + '\u2190' + " x1\n" +
                "f5\t\t1 0 1 0\t\tf5\t=\tx1\u0305\n" +                   //trouble
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
        Scanner sc1_1 = new Scanner(System.in);
        Scanner sc1_2 = new Scanner(System.in);
        Scanner sc1_3 = new Scanner(System.in);
        Scanner sc1_4 = new Scanner(System.in);
        Scanner sc2_1 = new Scanner(System.in);
        Scanner sc2_2 = new Scanner(System.in);
        Scanner sc2_3 = new Scanner(System.in);
        Scanner sc2_4 = new Scanner(System.in);
        byte f,x1_1,x1_2,x1_3,x1_4,x2_1,x2_2,x2_3,x2_4;
        do
        {
            System.out.print("Введите номер функции от 0 до 15: ");
            f = sc.nextByte();
        }while (f < 0 || f > 15);
        do {
            System.out.print("Введите значение аргумента х1 (4 бита - 0 или 1): ");
            x1_1 = sc1_1.nextByte();
        }while(x1_1 < 0 || x1_1 > 1);
        do
            x1_2 = sc1_2.nextByte();
        while(x1_2 < 0 || x1_2 > 1);
        do
            x1_3 = sc1_3.nextByte();
        while(x1_3 < 0 || x1_3 > 1);
        do
            x1_4 = sc1_4.nextByte();
        while(x1_4 < 0 || x1_4 > 1);
        do {
            System.out.print("Введите значение аргумента х2 (4 бита - 0 или 1): ");
            x2_1 = sc2_1.nextByte();
        }while(x2_1 < 0 || x2_1 > 1);
    }
}
