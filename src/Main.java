import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Line line = new Line();

        System.out.print("Введите X1: ");
        int x = in.nextInt();
        System.out.print("Введите Y1: ");
        int y = in.nextInt();
        line.setP1(x,y);


        System.out.print("Введите X2: ");
        x = in.nextInt();
        System.out.print("Введите Y2: ");
        y = in.nextInt();
        line.setP2(x,y);

        System.out.print("Длина отрезка равна: ");
        System.out.print(line.length());
    }
}
