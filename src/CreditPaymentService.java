public class CreditPaymentService {
    public double calculate(double creditAmount, double months, double annualRate) {
        /*
        Ежемесячный платёж = Коэффициент аннуитета(annuityRatio) * Сумма кредита(creditAmount)
        annualRate - годовая ставка.
        Коэффициент аннуитета вычисляется по формуле:
        annuityRatio = i * (1 + i) ^ months / ((1 + i) ^ months - 1), где:
        monthlyInterestRate — месячная процентная ставка (rate / 12 / 100);
        months — количество месяцев, в течение которых выплачивается кредит.
        */
        double monthlyInterestRate = annualRate / 12 / 100;
        double annuityRatio = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), months) / (Math.pow((1 + monthlyInterestRate), months) - 1));
        return annuityRatio * creditAmount;
    }
}
