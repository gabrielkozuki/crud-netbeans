package view;

import dao.AlunoDAO;
import javax.swing.JOptionPane;
import model.Aluno;

public class CadastroAlunos extends javax.swing.JFrame {
    
    Aluno al = new Aluno();
    AlunoDAO alDAO = new AlunoDAO();

    public CadastroAlunos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tv_nomealuno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nomealuno1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_emailaluno1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_cursoaluno1 = new javax.swing.JTextField();
        btn_limpar1 = new javax.swing.JButton();
        btn_cadastrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME ALUNO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("EMAIL ALUNO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CURSO ALUNO");

        btn_limpar1.setText("LIMPAR");
        btn_limpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar1ActionPerformed(evt);
            }
        });

        btn_cadastrar1.setText("CADASTRAR");
        btn_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tv_nomealunoLayout = new javax.swing.GroupLayout(tv_nomealuno);
        tv_nomealuno.setLayout(tv_nomealunoLayout);
        tv_nomealunoLayout.setHorizontalGroup(
            tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tv_nomealunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tv_nomealunoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_cursoaluno1))
                    .addGroup(tv_nomealunoLayout.createSequentialGroup()
                        .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tv_nomealunoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(tv_nomealunoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)))
                        .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tv_nomealunoLayout.createSequentialGroup()
                                .addComponent(btn_limpar1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_nomealuno1)
                            .addComponent(tf_emailaluno1))))
                .addContainerGap())
        );
        tv_nomealunoLayout.setVerticalGroup(
            tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tv_nomealunoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nomealuno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_emailaluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_cursoaluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(tv_nomealunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tv_nomealuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tv_nomealuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar1ActionPerformed
        tf_nomealuno1.setText("");
        tf_emailaluno1.setText("");
        tf_cursoaluno1.setText("");
    }//GEN-LAST:event_btn_limpar1ActionPerformed

    private void btn_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar1ActionPerformed
        if(tf_nomealuno1.getText().equals("") || tf_emailaluno1.getText().equals("") || tf_cursoaluno1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Alguns campos estão incompletos.", "Erro", JOptionPane.WARNING_MESSAGE, null);
        } else{
            //inserir no bd
            al.setNome(tf_nomealuno1.getText());
            al.setEmail(tf_emailaluno1.getText());
            al.setCurso(tf_cursoaluno1.getText());
            alDAO.inserir(al);
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE, null);
            
            tf_nomealuno1.setText("");
            tf_emailaluno1.setText("");
            tf_cursoaluno1.setText("");
        }
    }//GEN-LAST:event_btn_cadastrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar1;
    private javax.swing.JButton btn_limpar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf_cursoaluno1;
    private javax.swing.JTextField tf_emailaluno1;
    private javax.swing.JTextField tf_nomealuno1;
    private javax.swing.JPanel tv_nomealuno;
    // End of variables declaration//GEN-END:variables
}
