package ru.netology.javaqa.javaqamvn.services;

public class VacationService {

    /**
     * Эмулирует 12 месяцев, выводит детализацию каждого месяца и возвращает число месяцев отдыха.
     *
     * @param income    доход за месяц работы (руб.)
     * @param expenses  обязательные траты в месяц (руб.)
     * @param threshold минимальная сумма для решения «отдыхать» (руб.)
     * @return количество месяцев отдыха за год
     */
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int balance = 0;

        for (int month = 1; month <= 12; month++) {

            System.out.printf("Месяц %d. Денег %d. ", month, balance);

            if (balance >= threshold) {

                int mandatorySpend = expenses;
                int restSpend = (balance - expenses) * 2 / 3;

                System.out.printf("Буду отдыхать. Потратил -%d, затем ещё -%d%n",
                        mandatorySpend, restSpend);


                balance -= mandatorySpend;
                balance = balance / 3;  //

                vacationMonths++;
            } else {

                System.out.printf("Придётся работать. Заработал +%d, потратил -%d%n",
                        income, expenses);

                balance += income;
                balance -= expenses;
            }
        }

        return vacationMonths;
    }
}