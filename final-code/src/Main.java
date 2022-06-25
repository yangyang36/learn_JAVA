import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min =0;
        int max = 100;
        Random r = new Random();
        int finalCode = r.nextInt(max-min)+min;
        System.out.println("The final code is " + finalCode);

        while(true){
            System.out.print("Make a guess (between " + min + " and " + max+" ) : ");
            int inputNum = s.nextInt();
            if(inputNum > max || inputNum < min){
                System.out.println("Please make a valid guess.");
                continue;
            }

            if(inputNum == finalCode){
                System.out.println("you win");
                break;
            }else{
               if(inputNum > finalCode){
                   max = inputNum;
               }else{
                   min = inputNum;
               }
                System.out.println("keep guessing");
            }
        }
    }
}
