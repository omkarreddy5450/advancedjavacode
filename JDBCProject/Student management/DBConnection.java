import java.sql.*;

public class DBConnection {

    Connection con;

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "Omkar@2005"
            );

        } catch(Exception e) {
            System.out.println(e);
        }

        return con;
    }
}