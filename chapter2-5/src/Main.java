import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Person p1 = new Person("Ashi", 18);
        Person p2 = new Person("Yuni", 55);
        p1 = p2;
        p1.talk(); //My name is Yuni
        p2.talk(); //My name is Yuni
//        此時 p1 就沒有 reference，他沒有在 control pool 裏面，所以會
//        造成 memory leak 的問題。
    }
}
