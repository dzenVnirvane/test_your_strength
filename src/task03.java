import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        final int WHITE = 1;
        final int RED = 2;
        final int BLUE = 3;
        final int YELLOW = 4;
        float x, y, R;
        int color = 0;
        System.out.print("Введите x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        System.out.print("Введите y: ");
        Scanner sc1 = new Scanner(System.in);
        y = sc1.nextFloat();
        System.out.print("Введите радиус круга: ");
        Scanner sc3 = new Scanner(System.in);
        R = sc3.nextFloat();

        if ((x - R) * (x - R) + (y + R) * (y + R) < R * R) {
            if (x < R && y > -R) {
                if ((x + R - y) < 0) {
                    color = BLUE;

                } else {
                    color = WHITE;
                }

            }
            if (x > R && x < 2 * R && y > -2 * R && y < -R) {
                if ((x + 3 * R - y) > 0) {
                    color = BLUE;
                } else {
                    color = WHITE;
                }

            }
            if (x < R && y < -R) {
                if ((-x - R - y) < 0) {
                    color = RED;
                } else {
                    color = WHITE;
                }
            }
            if (x > R && x < 2 * R && y > -R) {
                if ((-x + R - y) > 0) {
                    color = RED;
                } else {
                    color = WHITE;
                }
            }
        } else {
            if (x > 0 && x < R && y < 0 && y > -R) {
                color = WHITE;
            } else {
                color = YELLOW;
            }
        }

        switch (color) {
            case RED: {
                if (x + y == 0)
                    System.out.println("Devide by zero");
                System.out.println("It's a red zone");
                System.out.println("SPO= " + (x + 10 / (x + y)));
            }
                break;
            case WHITE: {
                System.out.println("It's white zone");
                System.out.println("SPO= " + (x * y));
            }
                break;
            case BLUE: {
                if (y == 0)
                    System.out.println("Devide by zero");
                System.out.println("It's blue zone");
                System.out.println("SPO= " + (x + 1 / y));
            }
                break;
            default: {
                if (x == y)
                    System.out.println("Devide by zero");
                System.out.println("It's yellow zone");
                System.out.println("SPO= " + (x / (y - x)));
            }
        }
    }
}