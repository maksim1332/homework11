public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int year = 1588;
        checkLeapYear(year);

        int clientOS = 1;
        int clientDeviceYear = 2018;
        recommendAppVersion(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + "!");
        } else {
            System.out.println("Доставки нет!");
        }
    }

    public static void checkLeapYear(int year) {
        System.out.println("Task 1");
        if (year > 1584) {
            boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            System.out.println(year + " год " + (isLeap ? "является" : "не является") + " високосным.");
        }
    }

    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        System.out.println("Task 2");
        boolean isOldDevice = clientDeviceYear < 2015;
        String version = isOldDevice ? "облегченную" : "";
        String os = (clientOS == 0) ? "iOS" : "Android";
        System.out.println("Установите " + version + "версию приложения для " + os + " по ссылке.");
    }
    //task 3
    public static int calculateDeliveryDays(int distance) {
        System.out.println("Task 3");
        if (distance <= 20) return 1;
        if (distance <= 60) return 2;
        if (distance < 100) return 3;
        return 0;
    }
}

