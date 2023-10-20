/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifmg.poo.projetoconjunto.view;

/**
 *
 * @author geraldo.souza
 */
public class ProjetoConjuntoViewMain extends javax.swing.JFrame {

    private ManutencaoConjuntoView manutencaoConjuntoView;
    
    /**
     * Creates new form ProjetoConjuntoViewMain
     */
    public ProjetoConjuntoViewMain() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemNovo = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuConjunto = new javax.swing.JMenu();
        menuItemConjuntoManutencao = new javax.swing.JMenuItem();
        menuPonto = new javax.swing.JMenu();
        menuItemPontoManutencao = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setMnemonic('A');
        menuArquivo.setText("Arquivo");

        menuItemNovo.setMnemonic('N');
        menuItemNovo.setText("Novo");
        menuArquivo.add(menuItemNovo);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemSair.setMnemonic('S');
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        jMenuBar1.add(menuArquivo);

        menuEditar.setMnemonic('E');
        menuEditar.setText("Editar");
        jMenuBar1.add(menuEditar);

        menuConjunto.setMnemonic('C');
        menuConjunto.setText("Conjunto");

        menuItemConjuntoManutencao.setText("Manutenção...");
        menuItemConjuntoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConjuntoManutencaoActionPerformed(evt);
            }
        });
        menuConjunto.add(menuItemConjuntoManutencao);

        jMenuBar1.add(menuConjunto);

        menuPonto.setMnemonic('P');
        menuPonto.setText("Ponto");

        menuItemPontoManutencao.setText("Manutenção");
        menuPonto.add(menuItemPontoManutencao);

        jMenuBar1.add(menuPonto);

        menuSobre.setMnemonic('s');
        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemConjuntoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConjuntoManutencaoActionPerformed
        // TODO add your handling code here:
        if (manutencaoConjuntoView==null){
manutencaoConjuntoView = new ManutencaoConjuntoView(this, true);
        }
        manutencaoConjuntoView.setVisible(true);
    }//GEN-LAST:event_menuItemConjuntoManutencaoActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoConjuntoViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuConjunto;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemConjuntoManutencao;
    private javax.swing.JMenuItem menuItemNovo;
    private javax.swing.JMenuItem menuItemPontoManutencao;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuPonto;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}