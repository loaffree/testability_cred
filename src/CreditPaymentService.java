public class CreditPaymentService {
    public double calculate(double creditAmount, double creditPeriod, double annualRate) {
        /*
        Ежемесячный платёж = Коэффициент аннуитета(annuityRatio) * Сумма кредита(creditAmount)
        annualRate - годовая ставка.
        Коэффициент аннуитета вычисляется по формуле:
        annuityRatio = monthlyInterestRate * (1 + monthlyInterestRate) ^ creditPeriod / ((1 + monthlyInterestRate) ^ creditPeriod - 1), где:
        monthlyInterestRate — месячная процентная ставка (annualRate / 12 / 100);
        creditPeriod — количество месяцев, в течение которых выплачивается кредит.
        */
        double monthlyInterestRate = annualRate / 12 / 100;
        double annuityRatio = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), creditPeriod) / (Math.pow((1 + monthlyInterestRate), creditPeriod) - 1));
        return annuityRatio * creditAmount;
    }
}
