import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int defineYear(int year) {
        if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(+year + " високосный год ");
        } else if (year % 100 != 0) {
            System.out.println(+year + " невисокосный год ");
        }
        return 0;
    }

    public static int toDefineOS(int clientOS) {
        if (clientOS == 1) {
            System.out.println(" для Android по ссылке. ");
        } else {
            System.out.println(" для IOS по ссылке. ");
        }
        return 0;
    }

    public static int toDefineVersion(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear == currentYear) {
            System.out.print("  Вам нужна обычная версия, установите приложение");
        } else {
            System.out.print(" Вам нужна облегченная версия, установите приложение");
        }
        return 0;
    }
    public static int countDaysForDelivery (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println(" Потребуется один день для доставки ");
        } else if (deliveryDistance < 60) {
            System.out.println(" Потребуется 2 дня для доставки ");
        } else if (deliveryDistance <= 100) {
            System.out.println(" Потребуется 3 дня для доставки ");
        } else {
            System.out.println(" Доставки нет ");
        }
        return deliveryDistance;
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int[] Years = {2000, 2022, 1967, 2112, 2011, 1987, 1985, 1960,};
        for (int i = 0; i < Years.length; i++) {
            defineYear(Years[i]);
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int OSClient = 0;
        int yearDevice = 2020;
        toDefineVersion(yearDevice);
        toDefineOS(OSClient);
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int distanceDelivery = 150;
        countDaysForDelivery(distanceDelivery);

    }
}

//   Пыталась сделать код для одного метода, но не понимаю как привязать дни к дистанциям. Подскажите, пожалуйста, направление или логику? :)

//    public static int countDayForDelivery(int [] Distance) {
//        int[] distances = {20, 60, 100};
//        int[] days = {1,2,3};
//        int km = 0;
//        for (int element:distances) {
//            if (km<element) {
//                System.out.println(" Нужно " + days[element]);
//            }
//        }
//        return km;
//    }



