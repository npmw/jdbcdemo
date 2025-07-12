import java.sql.*;

public class DemoJdbc {
    public static <Resultset> void main(String[] args) throws Exception{

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","postgrenew123");
            System.out.println("Connection established successfully");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from studentdemo");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            conn.close();
    }
}
