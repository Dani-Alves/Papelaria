//Netbeans IDE 17
//Daniela dos Santos Alves 2465728

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lbEscolha = new javax.swing.JLabel();
        MenuBarraPrincipal = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadCaneta = new javax.swing.JMenuItem();
        MenuCadCaderno = new javax.swing.JMenuItem();
        MenuCadMochila = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        lbEscolha.setText("ESTOQUE DE PAPELARIA");
        lbEscolha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuCadastro.setText("Cadastrar");

        MenuCadCaneta.setText("Abrir Cadastro Caneta");
        MenuCadCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadCanetaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadCaneta);

        MenuCadCaderno.setText("Abrir Cadastro Caderno");
        MenuCadCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadCadernoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadCaderno);

        MenuCadMochila.setText("Abrir Cadastro Mochila");
        MenuCadMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadMochilaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadMochila);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuSair);

        MenuBarraPrincipal.add(MenuCadastro);

        setJMenuBar(MenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbEscolha)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadCanetaActionPerformed
        CadCaneta.getCadCan().setVisible(true);
    }//GEN-LAST:event_MenuCadCanetaActionPerformed

    private void MenuCadCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadCadernoActionPerformed
        CadCaderno.getCadCad().setVisible(true);
    }//GEN-LAST:event_MenuCadCadernoActionPerformed

    private void MenuCadMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadMochilaActionPerformed
        CadMochila.getCadMoc().setVisible(true);
    }//GEN-LAST:event_MenuCadMochilaActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        sair();
    }//GEN-LAST:event_MenuSairActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair:", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarraPrincipal;
    private javax.swing.JMenuItem MenuCadCaderno;
    private javax.swing.JMenuItem MenuCadCaneta;
    private javax.swing.JMenuItem MenuCadMochila;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lbEscolha;
    // End of variables declaration//GEN-END:variables
}
