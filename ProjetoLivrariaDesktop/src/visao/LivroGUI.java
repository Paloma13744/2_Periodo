/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.LivroDAO;
import modelo.LivroVO;
import modelo.PrateleiraVO;
import modelo.helper.PrateleiraHelper;

/**
 *
 * @author geraldo
 */
public class LivroGUI extends javax.swing.JDialog {

    private PrateleiraVO prateleira;
    
    private LivroDAO livroDAO;
    
    /** Helper para Pralereira */
    private PrateleiraHelper prateleiraHelper;
    
    /**
     * Creates new form LivroGUI
     */
    public LivroGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prateleira=new PrateleiraVO(1, "Agência única!!!");
        prateleiraHelper = PrateleiraHelper.getInstance();
        comboPrateleiras.setModel(new javax.swing.DefaultComboBoxModel(prateleiraHelper.getCodigos()));
        
        try{
                livroDAO = LivroDAO.getInstance("Livraria");
        }
        catch(SQLException e){
            System.out.println("Erro com o Banco de Dados!");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Erro Fatal!");
            System.exit(0);
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        comboPrateleiras = new javax.swing.JComboBox();
        lblPrateleiras = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Autor");

        jLabel4.setText("Preço");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Incluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        comboPrateleiras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPrateleiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrateleirasActionPerformed(evt);
            }
        });

        lblPrateleiras.setText("Prateleiras");

        jButton5.setText("Todos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPrateleiras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPrateleiras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtAutor)
                    .addComponent(txtPreco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPrateleiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrateleiras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int codigo=-1;
        LivroVO livro=null;
        
        try{
            if (txtCodigo.getText()==null || txtCodigo.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Código obrigatório!");
            }
            else{
                codigo=Integer.parseInt(txtCodigo.getText());

                livro=livroDAO.pesquisar(codigo);
                
                if (livro!=null){
                        txtCodigo.setText(""+codigo);
                        txtNome.setText(livro.getNome());
                        txtAutor.setText(livro.getAutor());
                        txtPreco.setText(""+livro.getPreco());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro não encontrado!");
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Valor de código inálido!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int quantidade=0, codigo=0;
        LivroVO livro=null;

        int resultado=JOptionPane.showConfirmDialog(this, "Confirma exclusão?", "Exclusão de livro", JOptionPane.YES_NO_OPTION);
        
        try{
            if (txtCodigo.getText()==null || txtCodigo.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Código obrigatório!");
            }
            else{
                if (resultado==JOptionPane.YES_OPTION){

                    codigo=Integer.parseInt(txtCodigo.getText());

                    quantidade=livroDAO.excluir(codigo);

                    if (quantidade>0){
                        JOptionPane.showMessageDialog(this, "Livro excluído com sucesso!");
                        txtCodigo.setText("");
                        txtNome.setText("");
                        txtAutor.setText("");
                        txtPreco.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Livro não encontrado!");
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Valor de código inálido!");
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int codigo=0;
        String nome=null;
        String autor=null;
        double preco=0;
        int quantidade=-1;
        LivroVO livroVO=null;
        
        try{
            if (txtCodigo.getText()==null || txtCodigo.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Código obrigatório!");
            }
            else{
                codigo=Integer.parseInt(txtCodigo.getText());
                nome=txtNome.getText();
                autor=txtAutor.getText();
                preco=Double.parseDouble(txtPreco.getText());
                livroVO=new LivroVO(codigo, nome, autor, preco);
                        
                try{
                    int codigoPrateleiraSelecionado = Integer.parseInt((String)this.comboPrateleiras.getSelectedItem());
                    PrateleiraVO prateleiraVO = prateleiraHelper.pesquisarPrateleira(codigoPrateleiraSelecionado);
                    livroVO.setPrateleira(prateleiraVO);
                } 
                catch(Exception e){
                    // Livro será inserido sem prateleira
                }
                        
                // Pesquisar Prateleira Selecionada
                quantidade=prateleira.adicionarLivro(livroVO);
                
                quantidade=livroDAO.inserir(livroVO);
                if (quantidade>0){
                    JOptionPane.showMessageDialog(this, "Livro incluído com sucesso!");
                    txtCodigo.setText("");
                    txtNome.setText("");
                    txtAutor.setText("");
                    txtPreco.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro não foi incluído!");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Valor de código inálido!");
        }        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int codigo=0;
        String nome=null;
        String autor=null;
        double preco=0;
        int quantidade=-1;
        LivroVO livro=null;
        
        try{
            if (txtCodigo.getText()==null || txtCodigo.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Código obrigatório!");
            }
            else{
                codigo=Integer.parseInt(txtCodigo.getText());
                nome=txtNome.getText();
                autor=txtAutor.getText();
                preco=Double.parseDouble(txtPreco.getText());
                
                // Pesquisa o livro
                LivroVO livroVO=livroDAO.pesquisar(codigo);
                
                if (livroVO!=null){
                    livroVO.setNome(nome);
                    livroVO.setAutor(autor);
                    livroVO.setPreco(preco);
                    
                    // Atualizar o livro
                    quantidade=livroDAO.alterar(livroVO);
                    
                    if (quantidade>0){
                        JOptionPane.showMessageDialog(this, "Livro alterado com sucesso!");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Livro não foi alterado!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Livro não foi encontrado!");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Valor de código inválido!");
        }        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboPrateleirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrateleirasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPrateleirasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        ArrayList<LivroVO> lista = livroDAO.selecionaTodosLivros();

        for (int i=0; i< lista.size(); i++){                    
            System.out.println("Livro: " + lista.get(i));                    
        }           
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LivroGUI dialog = new LivroGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboPrateleiras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPrateleiras;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    public JComboBox getComboPrateleiras() {
        return comboPrateleiras;
    }

    public void setComboPrateleiras(JComboBox comboPrateleiras) {
        this.comboPrateleiras = comboPrateleiras;
    }
}
