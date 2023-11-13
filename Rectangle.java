public class Rectangle implements Type {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        double recArea = width*height;
        return recArea;
    }
}