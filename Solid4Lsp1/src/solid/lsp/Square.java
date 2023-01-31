package solid.lsp;

public class Square implements Quad {

    private int side;
    public Square(int side) {
        this.side = side;
    }

    public void setSide(int sideA) {
        this.side = sideA;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSide(), 2);
    }
}
