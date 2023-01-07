public class Square extends Figure{

    private int side;

    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side*side);
    }

    @Override
    public void drawFigure() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(getSymbol());
                System.out.print(" ");

            }

        }
    }

    @Override
    public void paintFigure() {
        setColor(Color.PINK);
        System.out.println("NOw color figure is ..." + getColor());
    }
}
