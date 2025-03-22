public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(1_000_000, 12, 9.99));
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(1_000_000, 24, 9.99));
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(1_000_000, 36, 9.99));
    }
}