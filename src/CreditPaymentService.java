public class CreditPaymentService {
    public double calculate(double amount, double months, double rate) {
        /*
        Ежемесячный платёж = Коэффициент аннуитета(annuityRatio) * Сумма кредита(amount)
        rate - годовая ставка.
        Коэффициент аннуитета вычисляется по формуле:
        annuityRatio = i * (1 + i) ^ months / ((1 + i) ^ months - 1), где:
        i — месячная процентная ставка (rate / 12 / 100);
        months — количество месяцев, в течение которых выплачивается кредит.
        */
        double i = rate / 12 / 100;
        double annuityRatio = i * (Math.pow((1 + i), months) / (Math.pow((1 + i), months) - 1));
        return annuityRatio * amount;
    }
}
