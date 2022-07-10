package example;

/**
 * This class shows how to create a person by name and Nationality.
 */
public class Person {
    private String name;
    private Nationality homeland;

    /**
     * This constructor instantiates a person by name and nationality.
     * @param n person name
     * @param h Enum nationality
     */
    public Person(String n, Nationality h){
        name = n;
        homeland = h;
    }

    /**
     * Getter method for private field name
     * @return a string, a person name.
     */
    public String getName(){
        return this.name;
    }
}
