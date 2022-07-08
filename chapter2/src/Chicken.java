public class Chicken extends Animal implements Edible{
    public Chicken(){
        super("Chicken");
    }

    @Override
    public void move(){
        System.out.println("兩隻腳走路...");
    }

    @Override
    public String howToEat() {
        return "Boiled chicken is not bad, BBQ is the best.";
    }
}
