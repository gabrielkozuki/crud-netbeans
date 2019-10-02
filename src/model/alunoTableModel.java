package model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class alunoTableModel extends AbstractTableModel{
    
    public static final int COL_ID_ALUNO = 0;
    public static final int COL_NOME_ALUNO = 1;
    public static final int COL_EMAIL_ALUNO = 2;
    public static final int COL_CURSO_ALUNO = 3;
    public ArrayList<Aluno> list;

    public alunoTableModel(ArrayList<Aluno> l) {
        list = new ArrayList<Aluno>(l);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno al = list.get(rowIndex);
        if(columnIndex == COL_ID_ALUNO) return al.getId();
        if(columnIndex == COL_NOME_ALUNO) return al.getNome();
        if(columnIndex == COL_EMAIL_ALUNO) return al.getEmail();
        if(columnIndex == COL_CURSO_ALUNO) return al.getCurso();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID_ALUNO) return "ID ALUNO";
        if(colunas == COL_NOME_ALUNO) return "NOME ALUNO";
        if(colunas == COL_EMAIL_ALUNO) return "EMAIL ALUNO";
        if(colunas == COL_CURSO_ALUNO) return "CURSO ALUNO";
        return "";
    }
    
}
