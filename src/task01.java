import java.util.Scanner;

public class task01
{
    public static void main(String [] args)
    {
        int roadtype;
        float carspeed;
        Scanner sc = new Scanner(System.in);
        System.out.println("ѕожалуйста, укажите тип дороги:" +
                "\n1 - населенный пункт" + // <=60km/h
                "\n2 - дорога с отдельными проездными част€ми, которые отделены одна от другой разделительной полосой" + // 60-130 km/h
                "\n3 - друга€ автомобильна€ дорога"); // <=90 km/h
        roadtype = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ѕожалуйста, укажите скорость (км/ч):");
        carspeed = sc1.nextFloat();
        if (roadtype == 1 && carspeed <= 60)
            System.out.println("¬ы движетесь с допустимой скоростью в населенном пункте, либо стоите.");
        if (roadtype == 1 && carspeed > 60)
            System.out.println("¬ы превысили скорость в населенном пункте.");
        if (roadtype == 2 && carspeed >= 90 && carspeed <= 130)
            System.out.println("¬ы движетесь с допустимой скоростью по дороге с отдельными проездными част€ми, которые отделены одна от другой разделительной полосой.");
        if (roadtype == 2 && carspeed < 90 && carspeed > 130)
            System.out.println("¬ы превысили скорость по дороге с отдельными проездными част€ми, которые отделены одна от другой разделительной полосой, либо стоите.");
        if (roadtype == 3 && carspeed <= 90)
            System.out.println("¬ы движетесь с допустимой скоростью, либо стоите.");
        if (roadtype == 3 && carspeed > 90)
            System.out.println("¬ы превысили скорость.");
    }
}
