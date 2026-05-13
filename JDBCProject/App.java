import java.sql.*;

public class App {

    public static void main(String[] arg) throws SQLException {

        DBConnection db = new DBConnection();

        Connection obj = db.connect();

        int rollno = 102;
        String name = "Marcus";
        float marks = 95;

        String sql = String.format(
                "INSERT INTO student (rollno, sname, marks) VALUES (%d, '%s', %f)",
                rollno, name, marks);

        Statement st = obj.createStatement();

        int row = st.executeUpdate(sql);

        if (row > 0) {

            System.out.println("1 row inserted");

        } else {

            System.out.println("0 row inserted");
        }

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {

            System.out.println("-------------------------------------");

            System.out.println("Roll No: " + rs.getInt("rollno"));

            System.out.println("Name: " + rs.getString("sname"));

            System.out.println("Marks: " + rs.getFloat("marks"));
        }

        rs.close();
        st.close();
        obj.close();
    }
}