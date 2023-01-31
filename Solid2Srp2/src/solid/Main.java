package solid;

import solid.srp.models.JsonSaver;
import solid.srp.models.Order;
import solid.srp.models.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        View display = new View();
        Order zkz = display.inputFromConsole();
        JsonSaver jss = new JsonSaver();
        jss.saveToJson(zkz);
    }
}
