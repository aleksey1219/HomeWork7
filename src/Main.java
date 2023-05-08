public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("решение задачи №1");
        int total = 0;
        int deposit = 15000;
        int i = 0;
        while (total <= 2_459_000) {
            System.out.println("Месяц  " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
            total = total + deposit;
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
            System.out.println("Месяц " + i + ", сумма накоплений равна  " + accumulation + " рублей");
            summ = summ + summ / 100 * 7;
            summ = summ + depositPenny;
            accumulation = summ;
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
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна  " + accumulation + " рублей");
            }
            summ = summ + summ / 100 * 7;
            summ = summ + depositPenny;
            accumulation = summ;
        }
    }

    public static void task6() {
        System.out.println("Решение задачи №6");
        int deposit = 15000;
        int depositPenny = deposit;
        int accumulation = 0;
        int summ = 0;
        int ear = 9 * 12;
        int i = 0;
        while (i <= ear) {
            i++;
            summ = summ + summ / 100 * 7;
            summ = summ + depositPenny;
            accumulation = summ;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна  " + accumulation + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Решение задачи №7");
        int i = 1;
        while (i < 31) {
            System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет");
            i = i + 7;
        }
    }

    public static void task8() {
        System.out.println("Решение задачи №7");
        int i = 0;
        int ear = 0;
        while (i < 2100) {
            i++;
            ear++;
            if (ear > 1823 && ear < 2000 && ear % 79 == 0) {
                System.out.println(ear);
            } else if (ear > 2000 && ear < 2100 && ear % 79 == 0) {
                System.out.println(ear);
            }
        }
    }
}