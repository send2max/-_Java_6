package solid.srp.models;

import java.util.Scanner;

public class View {
    public Order inputFromConsole(){
        Order zkz = new Order(
                prompt("Client name: "),
                prompt("Product: "),
                Integer.parseInt(prompt("Quantity: ")),
                Integer.parseInt(prompt("Price: ")));
        return zkz;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
