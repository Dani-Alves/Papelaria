//Daniela dos Santos Alves 2465728

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCaderno extends javax.swing.JFrame {

    private Caderno caderno;
    private GerCad gerCad = new GerCad();

    private static CadCaderno cadCadUnico;

    public CadCaderno() {
        initComponents();
    }

    public static CadCaderno getCadCad() {
        if (cadCadUnico == null) {
            cadCadUnico = new CadCaderno();
        }
        return cadCadUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodCaderno = new javax.swing.JLabel();
        lbPrecoCaderno = new javax.swing.JLabel();
        lbMarcaCaderno = new javax.swing.JLabel();
        lbTipoFolha = new javax.swing.JLabel();
        lbQtdFolhas = new javax.swing.JLabel();
        cxCodCaderno = new javax.swing.JTextField();
        cxPrecoCaderno = new javax.swing.JTextField();
        cxMarcaCaderno = new javax.swing.JTextField();
        cxTipoFolha = new javax.swing.JTextField();
        cxQtdFolhas = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadCaderno = new javax.swing.JButton();
        cxAlterarCaderno = new javax.swing.JButton();
        btDeletarCaderno = new javax.swing.JButton();
        btConsultarCaderno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaderno = new javax.swing.JTable();
        lbCadernoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Caderno");

        lbCodCaderno.setText("Codigo do Caderno: ");

        lbPrecoCaderno.setText("Preco do caderno: ");

        lbMarcaCaderno.setText("Marca do caderno: ");

        lbTipoFolha.setText("Tipo da folha: 1 - Com pauta 2 - Sem Pauta");

        lbQtdFolhas.setText("Quantidade de folhas: ");

        cxCodCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodCadernoActionPerformed(evt);
            }
        });

        cxMarcaCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaCadernoActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadCaderno.setText("Cadastrar ");
        btCadCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCadernoActionPerformed(evt);
            }
        });

        cxAlterarCaderno.setText("Alterar ");
        cxAlterarCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAlterarCadernoActionPerformed(evt);
            }
        });

        btDeletarCaderno.setText("Deletar ");
        btDeletarCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarCadernoActionPerformed(evt);
            }
        });

        btConsultarCaderno.setText("Consultar ");
        btConsultarCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCadernoActionPerformed(evt);
            }
        });

        tblCaderno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Cderno", "Preco Caderno", "Marca Caderno", "Tipo da Folha", "qtd de Folha"
            }
        ));
        jScrollPane1.setViewportView(tblCaderno);

        lbCadernoTitulo.setText("Cadastro Caderno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbQtdFolhas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxQtdFolhas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbTipoFolha)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxTipoFolha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbCodCaderno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxCodCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbMarcaCaderno)
                                    .addGap(143, 143, 143)
                                    .addComponent(cxMarcaCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPrecoCaderno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxPrecoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSair)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCadCaderno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btConsultarCaderno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxAlterarCaderno)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btDeletarCaderno)
                                    .addComponent(btLimpar))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lbCadernoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadernoTitulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodCaderno)
                            .addComponent(cxCodCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbPrecoCaderno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMarcaCaderno)
                                    .addComponent(cxMarcaCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTipoFolha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxTipoFolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cxPrecoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQtdFolhas)
                            .addComponent(cxQtdFolhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadCaderno)
                            .addComponent(btConsultarCaderno)
                            .addComponent(cxAlterarCaderno)
                            .addComponent(btDeletarCaderno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLimpar)
                            .addComponent(btSair)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCodCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodCadernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodCadernoActionPerformed

    private void cxMarcaCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaCadernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaCadernoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCadernoActionPerformed
        cadastrarCaderno();
        listarTabCaderno();
    }//GEN-LAST:event_btCadCadernoActionPerformed

    private void btConsultarCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCadernoActionPerformed
        consultarCaderno();
    }//GEN-LAST:event_btConsultarCadernoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxAlterarCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAlterarCadernoActionPerformed
        alterarCaderno();
        listarTabCaderno();
    }//GEN-LAST:event_cxAlterarCadernoActionPerformed

    private void btDeletarCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarCadernoActionPerformed
        deletaCaderno();
        listarTabCaderno();
    }//GEN-LAST:event_btDeletarCadernoActionPerformed

    public void deletaCaderno() {

        caderno = new Caderno();

        try {
            caderno.setCodProduto(Integer.parseInt(cxCodCaderno.getText()));

            caderno = gerCad.consultaCaderno(caderno);

            if (caderno != null) {
                cxCodCaderno.setText(Integer.toString(caderno.getCodProduto()));
                cxPrecoCaderno.setText(Float.toString(caderno.getPreco()));
                cxMarcaCaderno.setText(caderno.getMarca());
                cxTipoFolha.setText(Integer.toString(caderno.getTipoFolha()));
                cxQtdFolhas.setText(Integer.toString(caderno.getQtdFolhas()));

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse produto:", "Confirmacao de exclusao", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == 0) {
                    gerCad.deletaCaderno(caderno);
                    JOptionPane.showConfirmDialog(null, "Produto excluido com sucesso", "Exclusao Produto", JOptionPane.OK_OPTION);
                    limpar();
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaderno.setText("");
            cxCodCaderno.requestFocus();
        }
    }

    public void alterarCaderno() {

        caderno = new Caderno();

        try {

            caderno.setCodProduto(Integer.parseInt(cxCodCaderno.getText()));

            caderno = gerCad.atualizaCaderno(caderno);

            if (caderno != null) {
                cxCodCaderno.setText(Integer.toString(caderno.getCodProduto()));
                cxPrecoCaderno.setText(Float.toString(caderno.getPreco()));
                cxMarcaCaderno.setText(caderno.getMarca());
                cxTipoFolha.setText(Integer.toString(caderno.getTipoFolha()));
                cxQtdFolhas.setText(Integer.toString(caderno.getQtdFolhas()));
                JOptionPane.showMessageDialog(null, "Confirme os dados cadastrados com sucesso", "Confirmacao de Cadastro", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Esse codigo nao existe", "ERRO COD. PRODUTO", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaderno.setText("");
            cxCodCaderno.requestFocus();
        }

    }

    public void listarTabCaderno() {
        DefaultTableModel modelo = (DefaultTableModel) tblCaderno.getModel();

        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Caderno cad : gerCad.getBdCad()) {
            modelo.insertRow(posLin, new Object[]{cad.getCodProduto(), cad.getPreco(), cad.getMarca(), cad.getTipoFolha(), cad.getQtdFolhas()});
            posLin++;
        }

    }

    public void consultarCaderno() {

        caderno = new Caderno();

        try {
            caderno.setCodProduto(Integer.parseInt(cxCodCaderno.getText()));

            caderno = gerCad.consultaCaderno(caderno);

            if (caderno != null) {
                cxCodCaderno.setText(Integer.toString(caderno.getCodProduto()));
                cxPrecoCaderno.setText(Float.toString(caderno.getPreco()));
                cxMarcaCaderno.setText(caderno.getMarca());
                cxTipoFolha.setText(Integer.toString(caderno.getTipoFolha()));
                cxQtdFolhas.setText(Integer.toString(caderno.getQtdFolhas()));

                JOptionPane.showConfirmDialog(null, "Confirme os dados de caneta", "Confirmacao de dados", 1);
                limpar();
            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaderno.setText("");
            cxCodCaderno.requestFocus();

        }
    }

    public void cadastrarCaderno() {

        caderno = new Caderno();

        try {

            caderno.setCodProduto(Integer.parseInt(cxCodCaderno.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaderno.setText("");
            cxCodCaderno.requestFocus();
            return;
        }
        try {
            caderno.setPreco(Float.parseFloat(cxPrecoCaderno.getText()));
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "O preço do produto deve ser float", "ERRO PREÇO DO PRODUTO", 0);
            cxPrecoCaderno.setText("");
            cxPrecoCaderno.requestFocus();
            return;
        }
        caderno.setMarca(cxMarcaCaderno.getText());

        caderno.setTipoFolha(Integer.parseInt(cxTipoFolha.getText()));
        caderno.setQtdFolhas(Integer.parseInt(cxQtdFolhas.getText()));

        caderno = gerCad.cadCad(caderno);

        if (caderno != null) {
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso", "Cadastro Concluido", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Esse produto ja foi cadastrado", "ERRO COD. PRODUTO", 0);
            cxCodCaderno.setText("");
            cxCodCaderno.requestFocus();
        }

    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair:", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        cxCodCaderno.setText("");
        cxCodCaderno.requestFocus();
        cxPrecoCaderno.setText("");
        cxPrecoCaderno.requestFocus();
        cxMarcaCaderno.setText("");
        cxMarcaCaderno.requestFocus();
        cxTipoFolha.setText("");
        cxTipoFolha.requestFocus();
        cxQtdFolhas.setText("");
        cxQtdFolhas.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(CadCaderno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCaderno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCaderno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCaderno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCaderno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCaderno;
    private javax.swing.JButton btConsultarCaderno;
    private javax.swing.JButton btDeletarCaderno;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton cxAlterarCaderno;
    private javax.swing.JTextField cxCodCaderno;
    private javax.swing.JTextField cxMarcaCaderno;
    private javax.swing.JTextField cxPrecoCaderno;
    private javax.swing.JTextField cxQtdFolhas;
    private javax.swing.JTextField cxTipoFolha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCadernoTitulo;
    private javax.swing.JLabel lbCodCaderno;
    private javax.swing.JLabel lbMarcaCaderno;
    private javax.swing.JLabel lbPrecoCaderno;
    private javax.swing.JLabel lbQtdFolhas;
    private javax.swing.JLabel lbTipoFolha;
    private javax.swing.JTable tblCaderno;
    // End of variables declaration//GEN-END:variables
}
