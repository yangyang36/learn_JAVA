import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("Please input vaccine name (AZ, BNT,Moderna, Janssen):");
        vaccine = vaccine.toLowerCase();
        if(vaccine.equals("az")){
            JOptionPane.showMessageDialog(null, "AZ\n研發國:英國,瑞典\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:81%");
        }else if (vaccine.equals("bnt")){
            JOptionPane.showMessageDialog(null, "BNT\n研發國:德國,美國\n疫苗類型:mRNA\n劑量:2\n保護力:95%");
        }else if (vaccine.equals("moderna")){
            JOptionPane.showMessageDialog(null, "Moderna\n研發國:美國\n疫苗類型:mRNA\n劑量:2\n保護力:94%");
        }else if(vaccine.equals("janssen")){
            JOptionPane.showMessageDialog(null, "Janssen\n研發國:美國,比利時\n疫苗類型:腸病毒疫苗\n劑量:1\n保護力:86%");
        } else {
            JOptionPane.showMessageDialog(null, "Something wrong.");
        }
    }
}
