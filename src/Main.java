public class Main {
    public static void main(String[] args) {

        // Задание № 1
        int number = 1;
        while (number < 11) {
            System.out.println("Число" + number);
            number = number + 1;
        }

        for (int date = 10; date >= 1; date--) {
            System.out.println("Число" + date);
        }

        //задание №2
        for (int friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница" + friday + "-е число. Необходимо подготовить отчет");
        }
        //Задание №3

        for (int comet = 1896; comet < 2133; comet = comet + 79) {
            System.out.println("Годы прилета кометы" + comet);
        }

        // Задание № 4

        for (int num = 1; num <= 30; ++num) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + "Ping pong");
            } else if (num % 3 == 0) {
                System.out.println(num + "pong");
            } else if ((num % 5 == 0)) {
                System.out.println(num + "Ping");
            } else {
                System.out.println(num + ":");

            }
        }
    }
}
















