public class Main {
    public static void main(String[] args) {
        task1();// задача 1
        task2();// задача 2
        task3();// задача 3
        task4();// задача 4
        task5();// задача 5


    }

    public static void task1() {
        System.out.println("Задание 1");

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");


        int OIS = 0;
        int Android = 1;
        int clientOS = 0;
        int clientDeviceYear = 2012;

        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.printf("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.printf("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }
    }

    public static void task3() {
        System.out.println("\nЗадание 3");

        int year = 2024;
        boolean leapyear = (year > 1584 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        if (leapyear) {
            System.out.println("Год " + year + " вискоксный");
        } else {
            System.out.println("Год " + year + " не вискоксный");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        int day1 = 1;
        int day2 = 2;
        int day3 = 3;
        int deliveryDistance = 145;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day1);
        } else if (deliveryDistance > 21 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + day2);
        } else if (deliveryDistance > 61 && deliveryDistance <= 100) {
                    System.out.println("Потребуется дней: " + day3);
        } else if (deliveryDistance > 101) {
                    System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
