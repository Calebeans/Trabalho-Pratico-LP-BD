package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author 0048606
 */
public class Conexao {
    
    private static String url = "jdbc:postgresql://localhost:5432/DBbsi";
    private static String usuario = "postgres";
    private static String senha = "root";
    private static Connection con = null;
    
    public Conexao() throws Exception {
        carregarDrive();
    }
    
    public static Connection getConexao() throws Exception {
        
        try {
            if (con == null) {
                Properties prop = new Properties();
                prop.put("user", usuario);
                prop.put("password", senha);
                con = DriverManager.getConnection(url, prop);
            }
            return con;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    private static void carregarDrive() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
