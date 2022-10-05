public class Main {
    public static void main(String[] args) {

        // Задание 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total);
        }
        System.out.println(total);
        System.out.println();

        // Задание 9
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++){
            total2 = total2 + total2/100;
            total2 = total2 + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total2);
        }
        System.out.println(total2);

    }
}