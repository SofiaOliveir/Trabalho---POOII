/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import model.Medicos;
import dao.MedicosDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mestre
 */
public class MedicosGui extends javax.swing.JFrame {

    /**
     * Creates new form MedicosGui2
     */
    public MedicosGui() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema de Gestão Médica");
        initComponents();
        
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeMedicos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCrmMedicos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEspecialidadeMedicos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSalarioMedicos = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdMedicos = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedicos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO DE MÉDICOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        jLabel1.setText("Nome:");

        txtNomeMedicos.setEnabled(false);

        jLabel2.setText("CRM:");

        txtCrmMedicos.setEnabled(false);

        jLabel3.setText("Especialidade:");

        txtEspecialidadeMedicos.setEnabled(false);

        jLabel4.setText("Salário:");

        txtSalarioMedicos.setEnabled(false);

        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.setEnabled(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel8.setText("ID:");

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnDeletar.setText("EXCLUIR");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalarioMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCrmMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEspecialidadeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCrmMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEspecialidadeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalarioMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnNovo)
                    .addComponent(btnDeletar)
                    .addComponent(btnAtualizar)))
        );

        jtMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CRM", "ESPECIALIDADE", "SALÁRIO"
            }
        ));
        jScrollPane1.setViewportView(jtMedicos);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("LISTA DE MÉDICOS");

        jLabel6.setText("Pesquisar por Nome:");

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");

        jLabel7.setText("REGISTRO:");

        jMenu1.setText("Médicos");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      
        Medicos medicos = new Medicos();
        medicos.setNome_medicos(txtNomeMedicos.getText());
        medicos.setCrm_medicos(txtCrmMedicos.getText());
        medicos.setEspecialidade_medicos(txtEspecialidadeMedicos.getText());
        medicos.setSalario_medicos(Double.parseDouble(txtSalarioMedicos.getText()));
        
        if (txtNomeMedicos.getText().isEmpty() || 
            txtCrmMedicos.getText().isEmpty()  || 
            txtEspecialidadeMedicos.getText().isEmpty() ||
            txtSalarioMedicos.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
       
            
        }
        else{
            
            MedicosDAO dao = new MedicosDAO();
            dao.inserir(medicos);
            
             JOptionPane.showMessageDialog(null, "Medico "+ txtNomeMedicos.getText()
                    +" foi inserido com sucesso"); 
            
        }
        
          txtNomeMedicos.setText("");
          txtCrmMedicos.setText("");
          txtEspecialidadeMedicos.setText("");
          txtSalarioMedicos.setText("");
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       
         txtNomeMedicos.setText("");
         txtCrmMedicos.setText("");
         txtEspecialidadeMedicos.setText("");
         txtSalarioMedicos.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        txtNomeMedicos.setEnabled(true);
         txtCrmMedicos.setEnabled(true);
         txtEspecialidadeMedicos.setEnabled(true);
         txtSalarioMedicos.setEnabled(true);
         btnLimpar.setEnabled(true);
         btnDeletar.setEnabled(true);
         btnAtualizar.setEnabled(true);
         
        if (txtPesquisar.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Digite o Nome do Médico");
            
            
            
        } else {
            
            
            Medicos medicos = new Medicos();
            medicos.setId_medicos(Integer.parseInt(txtPesquisar.getText()));
            
            MedicosDAO dao = new MedicosDAO();
            medicos = dao.consultanome(medicos);
            
            if(medicos != null){
                
                txtNomeMedicos.setText(medicos.getNome_medicos());
                txtCrmMedicos.setText(medicos.getCrm_medicos());
                txtEspecialidadeMedicos.setText(medicos.getEspecialidade_medicos());
                txtSalarioMedicos.setText(String.valueOf(medicos.getSalario_medicos()));
                
                
                
                
            }
            
            else{
                
               JOptionPane.showMessageDialog(null, "Nome Inválido");
            
                
            }
            
        }
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       
        int opcao = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente sair?", "Aviso",JOptionPane.YES_NO_OPTION);
        if (opcao ==0){
            System.exit(0);
            
        }
        else{
            
        }
        
        
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
       txtNomeMedicos.setEnabled(true);
       txtCrmMedicos.setEnabled(true);
       txtEspecialidadeMedicos.setEnabled(true);
       txtSalarioMedicos.setEnabled(true);
       btnSalvar.setEnabled(true);
       btnLimpar.setEnabled(true);
       btnPesquisar.setEnabled(false);
        
       txtIdMedicos.setEnabled(false);
       txtIdMedicos.setText("");
       txtNomeMedicos.setText("");
       txtCrmMedicos.setText("");
       txtEspecialidadeMedicos.setText("");
       txtSalarioMedicos.setText("");
       
      
       
       
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
       txtIdMedicos.setText("");
       txtNomeMedicos.setText("");
       txtCrmMedicos.setText("");
       txtEspecialidadeMedicos.setText("");
       txtSalarioMedicos.setText("");
        
       txtIdMedicos.setEnabled(true);
       txtNomeMedicos.setEnabled(false);
       txtCrmMedicos.setEnabled(false);
       txtEspecialidadeMedicos.setEnabled(false);
       txtSalarioMedicos.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnLimpar.setEnabled(false);
       btnDeletar.setEnabled(false);
       btnAtualizar.setEnabled(false);
       btnPesquisar.setEnabled(true);
       btnNovo.setEnabled(true);
        
        
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
   
         txtNomeMedicos.setEnabled(true);
         txtCrmMedicos.setEnabled(true);
         txtEspecialidadeMedicos.setEnabled(true);
         txtSalarioMedicos.setEnabled(true);
         btnLimpar.setEnabled(true);
         btnDeletar.setEnabled(true);
         btnAtualizar.setEnabled(true);
         
        if (txtIdMedicos.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Digite o ID do Médico");
            
            
            
        } else {
            
            
            Medicos medicos = new Medicos();
            medicos.setId_medicos(Integer.parseInt(txtIdMedicos.getText()));
            
            MedicosDAO dao = new MedicosDAO();
            medicos = dao.consultar(medicos);
            
            if(medicos != null){
                
                txtNomeMedicos.setText(medicos.getNome_medicos());
                txtCrmMedicos.setText(medicos.getCrm_medicos());
                txtEspecialidadeMedicos.setText(medicos.getEspecialidade_medicos());
                txtSalarioMedicos.setText(String.valueOf(medicos.getSalario_medicos()));
                
                
                
                
            }
            
            else{
                
               JOptionPane.showMessageDialog(null, "ID Inválido");
            
                
            }
            
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        
        if(txtIdMedicos.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Digite o ID do Médico");
            
        }
        
        else{
            
            try {
                
              Class.forName("com.mysql.cj.jdbc.Driver");
               
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicos?useTimezone=true&serverTimezone=UTC","root","");
               
               java.sql.Statement st = conn.createStatement();
               st.executeUpdate("delete from medicos where id_medicos = ?  + this.txtIdMedicos.getText()");
               JOptionPane.showMessageDialog(rootPane, "Médico excluído com sucesso!");
              
                
            } catch (ClassNotFoundException e) {
               JOptionPane.showMessageDialog(rootPane, e);  
                
            } catch (SQLException ex) {
                Logger.getLogger(MedicosGui.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             txtNomeMedicos.setText("");
             txtCrmMedicos.setText("");
             txtEspecialidadeMedicos.setText("");
             txtSalarioMedicos.setText("");
        
        } 
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Medicos medicos = new Medicos();
        medicos.setNome_medicos(txtNomeMedicos.getText());
        medicos.setCrm_medicos(txtCrmMedicos.getText());
        medicos.setEspecialidade_medicos(txtEspecialidadeMedicos.getText());
        medicos.setSalario_medicos(Double.parseDouble(txtSalarioMedicos.getText()));
        
        if (txtNomeMedicos.getText().isEmpty() || 
            txtCrmMedicos.getText().isEmpty()  || 
            txtEspecialidadeMedicos.getText().isEmpty() ||
            txtSalarioMedicos.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
       
            
        }
        else{
            
            MedicosDAO dao = new MedicosDAO();
            dao.inserir(medicos);
            
             JOptionPane.showMessageDialog(null, "Medico "+ txtNomeMedicos.getText()
                    +" foi atualizado com sucesso"); 
            
        }
        
          txtNomeMedicos.setText("");
          txtCrmMedicos.setText("");
          txtEspecialidadeMedicos.setText("");
          txtSalarioMedicos.setText("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedicosGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicosGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicosGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicosGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicosGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMedicos;
    private javax.swing.JTextField txtCrmMedicos;
    private javax.swing.JTextField txtEspecialidadeMedicos;
    private javax.swing.JTextField txtIdMedicos;
    private javax.swing.JTextField txtNomeMedicos;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSalarioMedicos;
    // End of variables declaration//GEN-END:variables
}
