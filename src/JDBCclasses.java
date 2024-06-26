import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCclasses {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:postgresql://localhost:5432/test1";
        Connection conn =null;
        String SQL = "INSERT INTO public.students(\n" +
                "\tid, roll_no, name, age)\n" +
                "\tVALUES (2,002,'J.Bose',25);";
        try{
            conn = DriverManager.getConnection(url,"postgres","root");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(SQL);
            if(m==1){
                System.out.println("Data Inserted Successfully " + m);
            }else{
                System.out.println("insertion Failed");
            }
        }catch (Exception ex){
            System.out.println("Some db exception " + ex);
        }finally {
            assert conn != null;
            conn.close();
        }
    }
}
