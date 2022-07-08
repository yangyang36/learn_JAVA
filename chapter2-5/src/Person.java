public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(){
        if(this.spouse != null){
            System.out.println("My name is" + name + ", and my spouse is " + spouse.getName());
        } else {
            System.out.println("T.T no spouse");
        }
    }

    public void setSpouse(Person spouse){
        this.spouse = spouse;
    }

    public String getName(){
        return this.name;
    }
}
