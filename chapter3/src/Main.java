import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Filename : ");
        File f = new File(fileName);
        int line_count = 0;
        int word_count=0;
        int char_count=0;
        try {
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                line_count ++;
                String line = scanner.nextLine();
                String[] line_arr = line.split(" ");
                for(String word : line_arr){
                    word_count++;
                }
                char_count += line.length();
            }
            scanner.close();
            System.out.println("line count => " + line_count);
            System.out.println("word count => " + word_count);
            System.out.println("char count => " + char_count);

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("File not found");
        }

    }
}
