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
            String sql = "INSERT INTO studentdemo (sid, sname, qualified) VALUES (103, 'John Doe', false)";
            if(stmt.executeUpdate(sql)==1){
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record insertion failed");

            }
            conn.close();
    }
}
