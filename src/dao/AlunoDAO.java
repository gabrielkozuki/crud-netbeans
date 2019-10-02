package dao;

import java.sql.Connection;
import model.Aluno;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlunoDAO {
    
    private Connection conexao;
    private PreparedStatement statement;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Aluno> list = new ArrayList<Aluno>();
    
    public AlunoDAO(){
        conexao = new Conexao().getConexao();
    }
    
    public void inserir(Aluno al){
        String sql = "insert into tb_alunos(nome_aluno, email_aluno, curso_aluno) values (?,?,?)";
        try{
            statement = conexao.prepareStatement(sql);
            statement.setString(1, al.getNome());
            statement.setString(2, al.getEmail());
            statement.setString(3, al.getCurso());
            statement.execute();
            statement.close();
        }catch(Exception e){
            throw new RuntimeException("Erro - inserir: " + e);
        }
    }
    
    public void alterar(Aluno al){
        String sql = "update tb_alunos set nome_aluno = ?, email_aluno = ?, curso_aluno = ? where id_aluno = ?";
        try{
            statement = conexao.prepareStatement(sql);
            statement.setString(1, al.getNome());
            statement.setString(2, al.getEmail());
            statement.setString(3, al.getCurso());
            statement.setInt(4, al.getId());
            statement.execute();
            statement.close();
        }catch(Exception e){
            throw new RuntimeException("Erro - alterar: " + e);
        }
    }
    
    public void excluir(int id){
        String sql = "delete from tb_alunos where id_aluno = " + id;
        try{
            st = conexao.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception e){
            throw new RuntimeException("Erro - excluir: " + e);
        }
    }
    
    public ArrayList<Aluno> listarTodos(){
        String sql = "select * from tb_alunos";
        try{
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Aluno al = new Aluno();
                al.setId(rs.getInt("id_aluno"));
                al.setNome(rs.getString("nome_aluno"));
                al.setEmail(rs.getString("email_aluno"));
                al.setCurso(rs.getString("curso_aluno"));
                list.add(al);
            }
        }catch(Exception e){
            throw new RuntimeException("Erro - listarTodos: " + e);
        }
        return list;
    }
    
    public Aluno listarAluno(int id){
        Aluno al = new Aluno();
        String sql = "select * from tb_alunos where id_aluno = " + id;
        try{
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    al.setId(rs.getInt("id_aluno"));
                    al.setNome(rs.getString("nome_aluno"));
                    al.setEmail(rs.getString("email_aluno"));
                    al.setCurso(rs.getString("curso_aluno"));  
                }
            }
        }catch(Exception e){
            throw new RuntimeException("Erro - listarAluno: " + e);
        }
        return al;
    }
}
