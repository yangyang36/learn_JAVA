import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args){
       // BMI Calculator (kg / m^2)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg) :");
        double weight = scanner.nextDouble();
        System.out.print("Please input your height (cm) :");
        double height = scanner.nextDouble()/100;
//        double bmi = weight / (height*height);
        double bmi = Double.parseDouble(DF.format(weight/(height*height)));
        System.out.println("Your BMI is " + bmi);

        if(bmi<18.5){
            System.out.println("too light");
        }else if(bmi <24){
            System.out.println("normal");
        }else if (bmi < 30){
            System.out.println("too weight");
        }else{
            System.out.println("over limit~~");
        }
    }
}
