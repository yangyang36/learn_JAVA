package example;

public class Main {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        boolean whatever = false;
        if(whatever && (n1/n2) != 3){
            System.out.println("cannot get here");
        }
        if (whatever & (n1/n2) != 3 ){
            System.out.println("have error");
        }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
