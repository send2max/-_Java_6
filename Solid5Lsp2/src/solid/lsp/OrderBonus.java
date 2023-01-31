package solid.lsp;

public class OrderBonus extends ValidOrder{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Бонусный заказ! Количество: %d, Цена %d", getQnt(), getPrice());
    }
}
