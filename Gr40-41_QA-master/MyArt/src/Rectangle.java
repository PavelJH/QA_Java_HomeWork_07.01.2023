public class Rectangle extends Figure{
   private int height;
   private int weight;


    public Rectangle(char symbol, Color color, int height, int weight) {
        super(symbol, color);
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Rectangle setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public void calculateArea() {
        System.out.println(height*weight);
    }

    @Override
    public void drawFigure() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print(getSymbol());
                System.out.print(" ");
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
