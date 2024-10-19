import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины № " + i);
            String name = scanner.next();
            System.out.println("Введите скорость машины № " + i + " в пределах от 0 до 250");
            int speed = 0;
            while (true) {
                try {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введите скорость машины в пределах от 0 до 250");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод скорости. Введите целое число от 0 до 250");
                    scanner.next();
                }
            }
            carList.add(new Car(name, speed));
            Race.race();
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + Race.leader);
    }
}
