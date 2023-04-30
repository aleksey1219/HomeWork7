public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("решение задачи №1");
        int total = 0;
        int deposit = 15000;
        int i = 0;
        while (total <= 2_459_000) {
            if (total <= 2_459_000) {
                i++;
                total = total + deposit;
                System.out.println("Месяц  " + i + ", сумма накоплений равна " + total + " рублей");
            } else break;
        }
    }

    public static void task2() {
        System.out.println("решение задачи №2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");

        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(" " + i + " ");
        }
    }

    public static void task3() {
        System.out.println("Решение задачи №3");
        int people = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int result = 12_000_000 / 1000;
        int fertilityResult = result * fertility;
        int mortalityResult = result / mortality;
        int earResult = people + fertilityResult - mortalityResult;
        int i = 0;
        int b = 0;
        while (i < 10) {
            if (b < 10) {
                b++;
                earResult++;
                System.out.println("Год " + b + " ,численность населения составляет " + earResult);
            } else break;
        }
    }
}