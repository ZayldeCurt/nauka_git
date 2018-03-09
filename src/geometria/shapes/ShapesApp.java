package geometria.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Shape newShape = new Square(5);
        Shape[] shapes = {new Square(5), new Rectangle(2,3)};
        showShapes(shapes);

    }

    private static void showShapes(Shape[] shapes)
    {

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Square)
            {
                Square square = (Square) shapes[i];
                System.out.println("blabla");
            }
            System.out.println("Field = "+shapes[i].field());
            System.out.println("Field = "+shapes[i].circuit());
            System.out.println("Field = "+shapes[i].diagonal());
        }
    }

    private static void showSquare(Square square){
        System.out.println("Square: field: "+ square.field() + ", circuit: "+square.circuit()+ ", diagonal: "+square.diagonal());
    }
    public void showRectangle(Rectangle rectangle){
        System.out.println("Square: field: "+ rectangle.field() + ", circuit: "+rectangle.circuit()+ ", diagonal: "+rectangle.diagonal());
    }

}
