package solid;

import solid.lsp.Quad;
import solid.lsp.Rectangle;

public class ViewShape {

    Quad q;

    public ViewShape(Quad q) {
        this.q = q;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(q.getArea());
    }
}
