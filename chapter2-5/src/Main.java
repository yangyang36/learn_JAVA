

public class Main{

    public static void main(String[] args) {
        Person ashi = new Person("Ashi", 18);
        ashi.talk(); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Person.getName()" because "this.spouse" is null

    }
}
