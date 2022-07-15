import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql_statment = "select * from video";

        // 連接 DB (url, username, pwd)
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnJAVA", "ashi", "20190609");
        if(c != null){
            System.out.println("Connecting ...");
        }else {
            System.out.println("Cannot connect to the database");
        }

        PreparedStatement pps = c.prepareStatement(sql_statment);

        // 執行 line 5 的 sql
        ResultSet rs = pps.executeQuery();

        ArrayList<Video> result = new ArrayList<>();
        while(rs.next()){
            Video v = new Video(Integer.parseInt(rs.getString("videoId")), rs.getString("videoName"), Integer.parseInt(rs.getString("price")));
            result.add(v);
        }

        for(Video v : result){
            System.out.println(v.toString());
        }
        c.close();
    }
}