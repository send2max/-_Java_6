package solid.srp;

public class Malevich {
    private Square black;

    public Malevich (Square sq){
        this.black = sq;
    }

    public void draw() {
        for (int i = 0; i < black.getSide(); i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < black.getSide(); i++) {
            System.out.print("*");
            for (int j = 1; j < black.getSide() - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < black.getSide(); i++) {
            System.out.print("*");
        }
    }
}
