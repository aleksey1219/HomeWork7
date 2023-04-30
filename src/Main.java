public class Main {
    public static void main(String[] args) {
        task1();

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
}