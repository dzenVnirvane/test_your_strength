import java.util.Scanner;

public class task03var06 {
    public static void main(String[] args) {
        float x, y, R1, R2, Y;
        int color = 0;
        System.out.print("������� x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        System.out.print("������� y: ");
        Scanner sc1 = new Scanner(System.in);
        y = sc1.nextFloat();
        System.out.print("������� ������ �������� �����: ");
        Scanner sc3 = new Scanner(System.in);
        R1 = sc3.nextFloat();
        System.out.print("������� ������ ������� �����: ");
        Scanner sc4 = new Scanner(System.in);
        R2 = sc4.nextFloat();
        System.out.print("������� Y: ");
        Scanner sc5 = new Scanner(System.in);
        Y = sc5.nextFloat();

        if (x * x + y * y <= R1 * R1 || x >=-R1 && x <= R1 && y >= Y && y <= 0)
            color = 1;
        if (x >= -R2 && x <= -R1 && y >= Y && y <= 0 || x >= R1 && x <= R2 && y >= Y && y <= 0)
            color = 2;
        if (x * x + y * y >= R1 * R1 && x * x + y * y <= R2 * R2 && y >= 0)
            color = 3;

        switch (color) {
            case 1: {
                System.out.println("��������� � ������� ����");
                System.out.println("SPO= " + (x + 1 / (2 * x - y)));
            }
            break;
            case 2: {
                System.out.println("��������� � ����� ����");
                System.out.println("SPO= " + (1 / (x - y)));
            }
            break;
            case 3: {
                System.out.println("��������� � ������ ����");
                System.out.println("SPO= " + (x / (5 * y - x)));
            }
            break;
            default: {
                System.out.println("��������� � ����� ����");
                System.out.println("SPO= " + (x * y));
            }
        }
    }
}