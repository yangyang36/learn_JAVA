public class Dog extends Animal{

    public Dog(){
        super("Dog");
    }
    @Override
    public void move() {
        System.out.println("跑跑跑");
    }
}
