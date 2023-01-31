package solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements CardPay {
    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

}
