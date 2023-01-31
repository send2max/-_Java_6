package solid.ocp;

public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double ComputeSurface() {
        return Math.pow(this.side,2);
    }
}
