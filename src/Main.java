public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("решение задачи №1");
        int total = 0;
        int deposit = 15000;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + deposit;
            System.out.println("Месяц  " + i + ", сумма накоплений равна " + total + " рублей");
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
        System.out.println();
    }

    public static void task3() {
        System.out.println("Решение задачи №3");
        int people = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int result = 12_000_000 / 1000;
        int fertilityResult = result * fertility;
        int mortalityResult = result / mortality;
        int earResult = fertilityResult - mortalityResult;
        int b = 0;
        while (b < 10) {
            b++;
            people = people + earResult;
            System.out.println("Год " + b + " ,численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Решение задачи №4");
        int deposit = 15000;
        int depositPenny = deposit;
        int accumulation = 0;
        int summ = 0;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;

            summ = summ + summ / 100 * 7;
            summ = summ + depositPenny;
            accumulation = summ;
            System.out.println("Месяц " + i + ", сумма накоплений равна  " + accumulation + " рублей");


        }
    }

    public static void task5() {
        System.out.println("Решение задачи №5");
        int deposit = 15000;
        int depositPenny = deposit;
        int accumulation = 0;
        int summ = 0;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;

            summ = summ + summ / 100 * 7;
            summ = summ + depositPenny;
            accumulation = summ;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна  " + accumulation + " рублей");
            }
        }
    }
}