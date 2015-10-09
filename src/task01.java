import java.util.Scanner;

public class task01
{
    public static void main(String [] args)
    {
        int roadType;
        float carSpeed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, укажите тип дороги:" +
                "\n1 - населенный пункт" + // <=60km/h
                "\n2 - дорога с отдельными проездными частями, которые отделены одна от другой разделительной полосой" + // 60-130 km/h
                "\n3 - другая автомобильная дорога"); // <=90 km/h
        roadType = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Пожалуйста, укажите скорость (км/ч):");
        carSpeed = sc1.nextFloat();
        if (roadType == 1 && carSpeed <= 60)
            System.out.println("Вы движетесь с допустимой скоростью в населенном пункте, либо стоите.");
        if (roadType == 1 && carSpeed > 60)
            System.out.println("Вы превысили скорость в населенном пункте.");
        if (roadType == 2 && carSpeed >= 90 && carSpeed <= 130)
            System.out.println("Вы движетесь с допустимой скоростью по дороге с отдельными проездными частями, которые отделены одна от другой разделительной полосой.");
        if (roadType == 2 && carSpeed < 90 && carSpeed > 130)
            System.out.println("Вы превысили скорость по дороге с отдельными проездными частями, которые отделены одна от другой разделительной полосой, либо стоите.");
        if (roadType == 3 && carSpeed <= 90)
            System.out.println("Вы движетесь с допустимой скоростью, либо стоите.");
        if (roadType == 3 && carSpeed > 90)
            System.out.println("Вы превысили скорость.");
    }
}
