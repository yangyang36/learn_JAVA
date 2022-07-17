import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    private static Connection c;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        initializeDB();

        String name = JOptionPane.showInputDialog("Input video name");
        String sql_statement = "SELECT * FROM video WHERE videoName = ?";
        PreparedStatement preparedStatement = c.prepareStatement(sql_statement);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            int id = Integer.parseInt(resultSet.getString("videoID"));
            String videoName = resultSet.getString("videoName");
            int price = Integer.parseInt(resultSet.getString("price"));
            JOptionPane.showMessageDialog(null,new Video(id, videoName, price));
        }else{
            JOptionPane.showMessageDialog(null, "Video not found.");
        }


        closeDB();
    }

    private static void initializeDB() throws SQLException {
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnJAVA", "ashi", "20190609");
        if(c != null){
            System.out.println("Connecting ...");
        }else {
            System.out.println("Cannot connect to the database");
        }
    }

    private static void closeDB() throws SQLException {
        c.close();
    }
}