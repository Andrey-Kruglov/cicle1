public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int contribution = 29000;
        int sumTotal = 0;
        for (int i = 0; i < 12; i++) {
            sumTotal = sumTotal + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal);
        }
        System.out.println("Задача 9");
        int contribution1 = 29000;
        int sumTotal1 = 0;
        for (int i = 0; i < 12; i++){
            sumTotal1 = sumTotal1 + contribution1 / 100;
            sumTotal1 = contribution1 + sumTotal1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumTotal1 + " рублей." );
        }
        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i = i + 1){
            int a = 2;
            int b = a * i;
            System.out.println(a + " * " + i + " =" + b);


        }


    }
}