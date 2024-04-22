import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        // Создание массива автомобилей
        String[] carModels = {"Toyota Camry", "Honda Civic", "Ford Mustang"};
        int[] carYears = {2018, 2019, 2020};
        double[] carPrices = {25000.0, 20000.0, 30000.0};

        // Создание объекта Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вывод списка автомобилей
        System.out.println("Car list:");
        for (int i = 0; i < carModels.length; i++) {
            System.out.println((i + 1) + ". " + carModels[i] + " (" + carYears[i] + "), $" + carPrices[i]);
        }

        // Ввод номера автомобиля
        System.out.print("Enter the car number: ");
        int carNumber = scanner.nextInt();

        // Проверка, существует ли автомобиль с заданным номером
        if (carNumber >= 1 && carNumber <= carModels.length) {
            // Вывод информации об автомобиле
            System.out.println("Car model: " + carModels[carNumber - 1]);
            System.out.println("Year: " + carYears[carNumber - 1]);
            System.out.println("Price: $" + carPrices[carNumber - 1]);
        } else {
            // Вывод сообщения об ошибке
            System.out.println("Error: invalid car number.");
        }
    }
}
