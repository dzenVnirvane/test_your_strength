import java.util.Scanner;

public class task02
{
    public static void main(String [] args)
    {
        int x; final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("����������, ������� �������� ���� �: ");
        x = sc.nextInt();
        if (Math.sin(x) < 0)
            System.out.println("����� " + x + " �������� ����� ������������� ��������");
        else
            System.out.println("����� " + x + " �������� ����� ������������� ��������");
        System.out.println("����� " + x + " �������� = " + Math.sin(x));
        if (Math.cos(x) < 0)
            System.out.println("������� " + x + " �������� ����� ������������� ��������");
        else
            System.out.println("������� " + x + " �������� ����� ������������� ��������");
        System.out.println("������� " + x + " �������� = " + Math.cos(x));
        if (Math.tan(x) < 0)
            System.out.println("������� " + x + " �������� ����� ������������� ��������");
        else
            System.out.println("������� " + x + " �������� ����� ������������� ��������");
        System.out.println("������� " + x + " �������� = " + Math.tan(x));
        if (1 / Math.tan(x) < 0)
            System.out.println("��������� " + x + " �������� ����� ������������� ��������");
        else
            System.out.println("��������� " + x + " �������� ����� ������������� ��������");
        System.out.println("��������� " + x + " �������� = " + 1 / Math.tan(x));
    }
}
