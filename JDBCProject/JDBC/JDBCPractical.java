import java.sql.*;

class JDBCPractical {

    public static void main(String args[]) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo",
                    "root",
                    "Omkar@2005"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Insert Data
            stmt.executeUpdate(
                    "INSERT INTO student VALUES(1,'Omkar')"
            );

            // Display Data
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM student"
            );

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2)
                );
            }

            // Close Connection
            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}