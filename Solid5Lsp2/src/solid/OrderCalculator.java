package solid;

import solid.lsp.ValidOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<ValidOrder> {
    private List<ValidOrder> orders = new ArrayList<>();

    public void add(ValidOrder order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (ValidOrder order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<ValidOrder> iterator() {
        return orders.iterator();
    }
}
