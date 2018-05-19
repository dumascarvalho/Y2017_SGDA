package projeto_sgda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexão_SGDA {
    
    private String comando = null;
    private Connection conexão = null;
    public PreparedStatement parametro = null;
    public ResultSet resultado = null;
    
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexão = DriverManager.getConnection("jdbc:mysql://localhost/database_sgda", "root", "092508");
        } catch (SQLException | NullPointerException | ClassNotFoundException ex) {
            System.out.println("\nExceção: " + ex);
        } 
    }
    
    public void setComando(String comando) {
        this.comando = comando;
    }
    
    public String getComando() {
        return comando;
    }
    
    public void parametrizar()
    {
        try {
            parametro = conexão.prepareStatement(getComando());
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        } 
    }
    
    public void consultar() {
        try {
            resultado = parametro.executeQuery(getComando());
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        } 
    }
    
    public void desconectar() {
        try {
            conexão.close();
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        }
    }
}