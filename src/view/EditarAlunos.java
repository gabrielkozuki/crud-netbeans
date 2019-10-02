package view;

import dao.AlunoDAO;
import javax.swing.JOptionPane;
import model.Aluno;

public class EditarAlunos extends javax.swing.JFrame {
    
    Aluno al = new Aluno();
    AlunoDAO alDAO = new AlunoDAO();

    public EditarAlunos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_nomealuno2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_emailaluno2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_cursoaluno2 = new javax.swing.JTextField();
        btn_buscar2 = new javax.swing.JButton();
        btn_excluir2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_idaluno2 = new javax.swing.JTextField();
        btn_atualizar2 = new javax.swing.JButton();
        btn_limpar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME ALUNO");

        tf_nomealuno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomealuno2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("EMAIL ALUNO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CURSO ALUNO");

        btn_buscar2.setText("BUSCAR");
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });

        btn_excluir2.setText("EXCLUIR");
        btn_excluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID ALUNO");

        tf_idaluno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idaluno2ActionPerformed(evt);
            }
        });

        btn_atualizar2.setText("ATUALIZAR");
        btn_atualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizar2ActionPerformed(evt);
            }
        });

        btn_limpar2.setText("LIMPAR");
        btn_limpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_idaluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nomealuno2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(tf_emailaluno2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_limpar2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_atualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_cursoaluno2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tf_idaluno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nomealuno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_emailaluno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_cursoaluno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        // TODO add your handling code here:
        if(tf_idaluno2.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "O campo está incompleto.", "Erro", JOptionPane.WARNING_MESSAGE, null);
        } else{
            int id = Integer.parseInt(tf_idaluno2.getText());
            Aluno al = alDAO.listarAluno(id);
            if(al.getId() != 0){
                tf_nomealuno2.setText(al.getNome());
                tf_emailaluno2.setText(al.getEmail());
                tf_cursoaluno2.setText(al.getCurso());
                tf_idaluno2.setText(Integer.toString(al.getId()));
                tf_idaluno2.setEditable(false); 
            } else{
                JOptionPane.showMessageDialog(rootPane, "nenhum registro encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE, null);
            }
        }
        
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    private void btn_atualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizar2ActionPerformed
        if(tf_idaluno2.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Nenhuma busca foi feita.", "Erro", JOptionPane.WARNING_MESSAGE, null);
        } else{
            if(tf_idaluno2.getText().equals("") || tf_nomealuno2.getText().equals("") || tf_emailaluno2.getText().equals("") || tf_cursoaluno2.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Alguns campos estão incompletos.", "Erro", JOptionPane.WARNING_MESSAGE, null);
            } else{
                //alterar dados do bd
                al.setNome(tf_nomealuno2.getText());
                al.setEmail(tf_emailaluno2.getText());
                al.setCurso(tf_cursoaluno2.getText());
                al.setId(Integer.parseInt(tf_idaluno2.getText()));
                alDAO.alterar(al);
                
                JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE, null);
            
                tf_nomealuno2.setText("");
                tf_emailaluno2.setText("");
                tf_cursoaluno2.setText("");
                tf_idaluno2.setText("");
                tf_idaluno2.setEditable(true);
            }
        }
    }//GEN-LAST:event_btn_atualizar2ActionPerformed

    private void tf_nomealuno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomealuno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomealuno2ActionPerformed

    private void btn_limpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar2ActionPerformed
        // TODO add your handling code here:
        tf_nomealuno2.setText("");
        tf_emailaluno2.setText("");
        tf_cursoaluno2.setText("");
        tf_idaluno2.setText("");
        tf_idaluno2.setEditable(true);
    }//GEN-LAST:event_btn_limpar2ActionPerformed

    private void tf_idaluno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idaluno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idaluno2ActionPerformed

    private void btn_excluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir2ActionPerformed
        // TODO add your handling code here:
        if(tf_idaluno2.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Nenhuma busca foi feita.", "Erro", JOptionPane.WARNING_MESSAGE, null);
        } else{
            int id = Integer.parseInt(tf_idaluno2.getText());
            alDAO.excluir(id);
            
            JOptionPane.showMessageDialog(rootPane, "Registro excluído com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE, null);
            
            tf_nomealuno2.setText("");
            tf_emailaluno2.setText("");
            tf_cursoaluno2.setText("");
            tf_idaluno2.setText("");
            tf_idaluno2.setEditable(true);
        }
    }//GEN-LAST:event_btn_excluir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar2;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_excluir2;
    private javax.swing.JButton btn_limpar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_cursoaluno2;
    private javax.swing.JTextField tf_emailaluno2;
    private javax.swing.JTextField tf_idaluno2;
    private javax.swing.JTextField tf_nomealuno2;
    // End of variables declaration//GEN-END:variables
}
