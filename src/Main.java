public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int year = 1588;
        checkLeapYear(year);

        int clientOS = 1;
        int clientDeviceYear = 2018;
        recommendAppVersion(clientOS, clientDeviceYear);
    }

    //task1
    public static void checkLeapYear(int year) {
        System.out.println("Task 1");
        if (year > 1584) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным.");
                } else {
                    System.out.println(year + " год не является високосным.");
                }
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }
    }

    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        System.out.println("Task 2");

        int currentYear = 2023;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        //task 3
        System.out.println("Task 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days + "!");
        } else {
            System.out.println("Доставки нет!");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}

