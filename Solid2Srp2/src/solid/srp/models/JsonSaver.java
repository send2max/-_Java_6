package solid.srp.models;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver {

    public void saveToJson(Order purchase) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ purchase.getClientName() + "\",\n");
            writer.write("\"product\":\""+purchase.getProduct()+"\",\n");
            writer.write("\"qnt\":"+purchase.getQnt()+",\n");
            writer.write("\"price\":"+purchase.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
