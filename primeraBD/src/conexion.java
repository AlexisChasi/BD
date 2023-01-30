import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    public conexion() {
        try {

        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion= DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbpoo","root","alexis16");
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("Select * from estudiantes");
            while (rs.next()){
                System.out.println(rs.getString("nombre")+""+rs.getString("telefono")+""+rs.getString("correo"));

            }
            conexion.close();
    }catch (Exception e){
            e.printStackTrace();
        }
    }
}
