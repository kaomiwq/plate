import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rFarm;
        int r1UFO;
        int r2UFO;

        System.out.print("Введите радиус поля: ");
        rFarm = scanner.nextInt();
        System.out.print("Введите радиус первой тарелки: ");
        r1UFO = scanner.nextInt();
        System.out.print("Введите радиус второй тарелки: ");
        r2UFO = scanner.nextInt();

        if (r1UFO + r2UFO < rFarm) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}