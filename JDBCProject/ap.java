import java.sql.*;

public class ap{
   public static void main(String args[])

     throws SQLException{
        Connection con = dd.connect();
        Statement st = con.createStatement();
        String sql = 
        "INSERT INTO student " +
                "VALUES (101,'John',95)";

        int row = st. executeUpdate(sql);
           if(row>0){
            System.out.println("1 row inserted");

           } 
           ResultSet rs =   st.executeQuery(
            "SELECT * FROM student");
            while(rs.next()){
                System.out.println(rs.getInt("roll no"));
                System.out.println(rs.getString("sname"));
                System.out.println(rs.getFloat("marks"));
            }




con.close();
      }
      

   
}
