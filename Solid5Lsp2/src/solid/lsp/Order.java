package solid.lsp;

public class Order extends ValidOrder{
    public Order(int qnt, int price) { super(qnt, price); }

    public int getAmount() {
        return super.getQnt() * super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
