import java.util.Scanner;

public class task01
{
    public static void main(String [] args)
    {
        int roadtype;
        float carspeed;
        Scanner sc = new Scanner(System.in);
        System.out.println("����������, ������� ��� ������:" +
                "\n1 - ���������� �����" + // <=60km/h
                "\n2 - ������ � ���������� ���������� �������, ������� �������� ���� �� ������ �������������� �������" + // 60-130 km/h
                "\n3 - ������ ������������� ������"); // <=90 km/h
        roadtype = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("����������, ������� �������� (��/�):");
        carspeed = sc1.nextFloat();
        if (roadtype == 1 && carspeed <= 60)
            System.out.println("�� ��������� � ���������� ��������� � ���������� ������, ���� ������.");
        if (roadtype == 1 && carspeed > 60)
            System.out.println("�� ��������� �������� � ���������� ������.");
        if (roadtype == 2 && carspeed >= 90 && carspeed <= 130)
            System.out.println("�� ��������� � ���������� ��������� �� ������ � ���������� ���������� �������, ������� �������� ���� �� ������ �������������� �������.");
        if (roadtype == 2 && carspeed < 90 && carspeed > 130)
            System.out.println("�� ��������� �������� �� ������ � ���������� ���������� �������, ������� �������� ���� �� ������ �������������� �������, ���� ������.");
        if (roadtype == 3 && carspeed <= 90)
            System.out.println("�� ��������� � ���������� ���������, ���� ������.");
        if (roadtype == 3 && carspeed > 90)
            System.out.println("�� ��������� ��������.");
    }
}
