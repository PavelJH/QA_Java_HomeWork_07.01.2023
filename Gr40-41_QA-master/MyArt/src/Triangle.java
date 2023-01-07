public class Triangle extends Figure {

    private int base;
    private int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(base*height*height);
    }

    @Override
    public void drawFigure() {

        for (int i = 0; i < base; i++) {
            for (int k = 0; k < height/2; k++) {
                System.out.print(" ");
            }
            for (int j = height-1-i; j < height; j++) {
                System.out.print(getSymbol());
            }
            System.out.println();


        }

    }

    @Override
    public void paintFigure() {
        setColor(Color.PINK);
        System.out.println("NOw color figure is ..." + getColor());
    }
}
