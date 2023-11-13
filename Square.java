public class Square implements Type {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public double calculateArea() {
        double squArea = side*side;
        return squArea;
    }
}