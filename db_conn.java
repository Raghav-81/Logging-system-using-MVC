import java.sql.*;
public class db_conn {

    static public void db_insert(/*String Fname, String Lname, String time*/) {
        //System.out.println(fname + " Refsnes");
        //JDBC driver name and database URL
        String JDBC_DRIVER = "org.postgresql.Driver";
        static final String DB_URL = "jdbc:postgresql://localhost/logging";

        //DB credentials
        static final String USER = "postgres";
        static final String PASS = "Gurukrupa@1881";

        Connection conn = null;
        Statement stmt = null;
        try{
            System.out.println("Connecting to db....");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Executing SQL query");
            stmt = conn.createStatement();

            String sql = "insert into logging(F_name, L_name, Time) values ('l','m','2:10');";
            stmt.executeUpdate(sql);
            System.out.println("Query running successfully");
            stmt.close();
            conn.close();
        };
        catch(Exception e){
            System.out.println(e.getClass());
            System.exit(0);
        }

        System.out.println("Thank you!!");

      }
    }

      