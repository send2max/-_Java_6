package solid.isp;

public class InternetPaymentService implements WebPay{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }
}
