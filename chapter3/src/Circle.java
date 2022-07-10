public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius)  {
        if(radius<0){
            System.out.println("invalid radius");
            return;
        }
            this.radius = radius;
    }
}
