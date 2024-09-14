import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int carsNumber = 3;
        int minSpeed = 0;
        int maxSpeed = 250;

        Race race = new Race();
        Car currentCar = new Car();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < carsNumber; i++){

            System.out.println("Введите название машины №" + (i + 1));
            currentCar.name = scanner.next();
            System.out.println("Введите скорость машины №" + (i + 1));
            currentCar.speed = scanner.nextInt();

            while (currentCar.speed <= minSpeed || currentCar.speed > maxSpeed){

                System.out.println("Неправильная скорость");
                System.out.println("Введите скорость машины №" + (i + 1));
                currentCar.speed = scanner.nextInt();

            }

            race.whoIsTheLeader(currentCar);
        }

        System.out.println("Самая быстрая машина: " + race.currentLider);

    }
}