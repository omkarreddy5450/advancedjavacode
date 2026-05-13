import java.sql.*;

class DBConnection {

    static String username = "root";

    static String pass = "Omkar@2005";

    static String url =
            "jdbc:mysql://127.0.0.1:3306/StudentData";

    static Connection con;

    public static Connection connect() {

        try {

            con = DriverManager.getConnection(
                    url,
                    username,
                    pass
            );

            System.out.println("Connection Established");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return con;
    }
}