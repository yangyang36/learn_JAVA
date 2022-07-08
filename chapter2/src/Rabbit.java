public class Rabbit extends Animal {
    public Rabbit(){
        super("Rabbit");
    }

    @Override
    public void move() {
        System.out.println("跳跳跳");
    }
}
