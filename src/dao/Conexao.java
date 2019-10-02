package dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {
    
    public Connection getConexao(){
        
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projeto_ianes","root","Gabriel1207");
        }catch(Exception e){
            throw new RuntimeException("Erro - getConexao: " + e);
        }
    }
}
