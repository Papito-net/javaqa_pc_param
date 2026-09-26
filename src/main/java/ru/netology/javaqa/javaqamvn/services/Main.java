package ru.netology.javaqa.javaqamvn.services;

public class
Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        System.out.println("=== СЦЕНАРИЙ 1 ===");
        System.out.println("Доход: 10 000 руб., расходы: 3 000 руб., порог отдыха: 20 000 руб.");
        int result1 = service.calculate(10000, 3000, 20000);
        System.out.println("Итого месяцев отдыха: " + result1);
        System.out.println();


        System.out.println("=== СЦЕНАРИЙ 2 ===");
        System.out.println("Доход: 100 000 руб., расходы: 60 000 руб., порог отдыха: 150 000 руб.");
        int result2 = service.calculate(100000, 60000, 150000);
        System.out.println("Итого месяцев отдыха: " + result2);
        System.out.println();


        System.out.println("=== СЦЕНАРИЙ 3 ===");
        System.out.println("Доход: 5 000 руб., расходы: 10 000 руб., порог отдыха: 50 000 руб.");
        int result3 = service.calculate(5000, 10000, 50000);
        System.out.println("Итого месяцев отдыха: " + result3);
    }
}

