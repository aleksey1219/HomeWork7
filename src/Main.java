public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}