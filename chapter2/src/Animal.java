public abstract class Animal {
    protected String animalType;

    public Animal(String animalType){
        this.animalType = animalType;
    }

    public void sleep(){
        System.out.println("this " + animalType + " is sleeping...");
    }

    public abstract void move();
}
