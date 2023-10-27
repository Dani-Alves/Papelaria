//Daniela dos Santos Alves 2465728

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCaneta extends javax.swing.JFrame {

    private Caneta caneta;
    private GerCan gerCan = new GerCan();

    private static CadCaneta cadCanUnico;

    public CadCaneta() {
        initComponents();
    }

    public static CadCaneta getCadCan() {
        if (cadCanUnico == null) {
            cadCanUnico = new CadCaneta();
        }
        return cadCanUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbCodCaneta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cxCodCaneta = new javax.swing.JTextField();
        lbCorTinta = new javax.swing.JLabel();
        cxCorTinta = new javax.swing.JTextField();
        btCadCaneta = new javax.swing.JButton();
        lbPrecoCaneta = new javax.swing.JLabel();
        cxPrecoCaneta = new javax.swing.JTextField();
        lbMarcaCaneta = new javax.swing.JLabel();
        cxMarcaCaneta = new javax.swing.JTextField();
        lbTipoCaneta = new javax.swing.JLabel();
        cxTipoCaneta = new javax.swing.JTextField();
        lbTamanhoPonta = new javax.swing.JLabel();
        cxTamanhoPonta = new javax.swing.JTextField();
        btConsultarCaneta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCaneta = new javax.swing.JTable();
        btAlterarCaneta = new javax.swing.JButton();
        btDeletaCaneta = new javax.swing.JButton();
        lbCaneta = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Caneta");

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

        lbCodCaneta.setText("Codigo da caneta");

        cxCodCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodCanetaActionPerformed(evt);
            }
        });

        lbCorTinta.setText("Cor Tinta");

        cxCorTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorTintaActionPerformed(evt);
            }
        });

        btCadCaneta.setText("Cadastrar");
        btCadCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCanetaActionPerformed(evt);
            }
        });

        lbPrecoCaneta.setText("Preco Caneta");

        lbMarcaCaneta.setText("Marca da Caneta");

        lbTipoCaneta.setText("Tipo de  Caneta 1- Marca-Texto 2 - esferiografica");

        cxTipoCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTipoCanetaActionPerformed(evt);
            }
        });

        lbTamanhoPonta.setText("Tamanho da ponta 1- 0.5 2 - 0.7");

        btConsultarCaneta.setText("Consultar");
        btConsultarCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCanetaActionPerformed(evt);
            }
        });

        tblCaneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Caneta", "Preco Caneta", "Marca Caneta", "Cor Tinta", "Tipo Caneta", "Tamanho Ponta"
            }
        ));
        jScrollPane2.setViewportView(tblCaneta);

        btAlterarCaneta.setText("Alterar ");
        btAlterarCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarCanetaActionPerformed(evt);
            }
        });

        btDeletaCaneta.setText("Deletar ");
        btDeletaCaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletaCanetaActionPerformed(evt);
            }
        });

        lbCaneta.setText("CADASTRO DE CANETA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lbCaneta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadCaneta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsultarCaneta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAlterarCaneta))
                            .addComponent(btSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btLimpar)
                                    .addComponent(btDeletaCaneta))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(567, 567, 567)
                                .addComponent(jLabel1)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecoCaneta)
                            .addComponent(lbMarcaCaneta)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCorTinta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCodCaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbTipoCaneta, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbTamanhoPonta)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cxPrecoCaneta)
                                            .addComponent(cxMarcaCaneta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(cxCorTinta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(cxCodCaneta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(cxTipoCaneta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(cxTamanhoPonta))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCaneta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCodCaneta)
                                    .addComponent(cxCodCaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPrecoCaneta)
                                    .addComponent(cxPrecoCaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMarcaCaneta)
                                    .addComponent(cxMarcaCaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCorTinta)
                                    .addComponent(cxCorTinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cxTipoCaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTipoCaneta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTamanhoPonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTamanhoPonta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadCaneta)
                            .addComponent(btConsultarCaneta)
                            .addComponent(btAlterarCaneta)
                            .addComponent(btDeletaCaneta))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLimpar)
                            .addComponent(btSair))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxCorTintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorTintaActionPerformed
    }//GEN-LAST:event_cxCorTintaActionPerformed

    private void btCadCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCanetaActionPerformed
        cadastrarCaneta();
        listarTabCaneta();
    }//GEN-LAST:event_btCadCanetaActionPerformed

    private void cxCodCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodCanetaActionPerformed
    }//GEN-LAST:event_cxCodCanetaActionPerformed

    private void btConsultarCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCanetaActionPerformed

    }//GEN-LAST:event_btConsultarCanetaActionPerformed

    private void btAlterarCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarCanetaActionPerformed
        alterarCaneta();
        listarTabCaneta();
    }//GEN-LAST:event_btAlterarCanetaActionPerformed

    private void btDeletaCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletaCanetaActionPerformed
        deletaCaneta();
        listarTabCaneta();
    }//GEN-LAST:event_btDeletaCanetaActionPerformed

    private void cxTipoCanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTipoCanetaActionPerformed
    }//GEN-LAST:event_cxTipoCanetaActionPerformed

    public void deletaCaneta() {

        caneta = new Caneta();

        try {
            caneta.setCodProduto(Integer.parseInt(cxCodCaneta.getText()));

            caneta = gerCan.consCanCod(caneta);

            if (caneta != null) {
                cxCodCaneta.setText(Integer.toString(caneta.getCodProduto()));
                cxPrecoCaneta.setText(Float.toString(caneta.getPreco()));
                cxMarcaCaneta.setText(caneta.getMarca());
                cxCorTinta.setText(caneta.getCorTinta());
                cxTipoCaneta.setText(Integer.toString(caneta.getTipoCaneta()));
                cxTamanhoPonta.setText(Integer.toString(caneta.getTamPonta()));

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse produto:", "Confirmacao de exclusao", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == 0) {
                    gerCan.deletaCaneta(caneta);
                    JOptionPane.showConfirmDialog(null, "Produto excluido com sucesso", "Exclusao Produto", JOptionPane.OK_OPTION);
                    limpar();
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaneta.setText("");
            cxCodCaneta.requestFocus();
        }
    }

    public void alterarCaneta() {

        caneta = new Caneta();

        try {

            caneta.setCodProduto(Integer.parseInt(cxCodCaneta.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaneta.setText("");
            cxCodCaneta.requestFocus();
            return;
        }
        caneta = gerCan.atualizaCaneta(caneta);

        if (caneta != null) {
            cxCodCaneta.setText(Integer.toString(caneta.getCodProduto()));

            cxPrecoCaneta.setText(Float.toString(caneta.getPreco()));

            cxMarcaCaneta.setText(caneta.getMarca());
            cxCorTinta.setText(caneta.getCorTinta());
            cxTipoCaneta.setText(Integer.toString(caneta.getTipoCaneta()));
            cxTamanhoPonta.setText(Integer.toString(caneta.getTamPonta()));
            JOptionPane.showMessageDialog(null, "Confirme os dados cadastrados com sucesso", "Confirmacao de Cadastro", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Esse codigo nao existe", "ERRO COD. PRODUTO", 0);
            limpar();
        }

    }

    public void listarTabCaneta() {
        DefaultTableModel modelo = (DefaultTableModel) tblCaneta.getModel();

        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Caneta can : gerCan.getBdCan()) {
            modelo.insertRow(posLin, new Object[]{can.getCodProduto(), can.getPreco(), can.getMarca(), can.getCorTinta(), can.getTipoCaneta(), can.getTamPonta()});
            posLin++;
        }

    }

    public void consultarCaneta() {

        caneta = new Caneta();

        try {
            caneta.setCodProduto(Integer.parseInt(cxCodCaneta.getText()));

            caneta = gerCan.consCanCod(caneta);

            if (caneta != null) {
                cxCodCaneta.setText(Integer.toString(caneta.getCodProduto()));
                cxPrecoCaneta.setText(Float.toString(caneta.getPreco()));
                cxMarcaCaneta.setText(caneta.getMarca());
                cxCorTinta.setText(caneta.getCorTinta());
                cxTipoCaneta.setText(Integer.toString(caneta.getTipoCaneta()));
                cxTamanhoPonta.setText(Integer.toString(caneta.getTamPonta()));

                JOptionPane.showConfirmDialog(null, "Confirme os dados de caneta", "Confirmacao de dados", 1);
                limpar();
            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaneta.setText("");
            cxCodCaneta.requestFocus();

        }
    }

    public void cadastrarCaneta() {

        caneta = new Caneta();
        try {

            caneta.setCodProduto(Integer.parseInt(cxCodCaneta.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodCaneta.setText("");
            cxCodCaneta.requestFocus();
            return;
        }
        try {
            caneta.setPreco(Float.parseFloat(cxPrecoCaneta.getText()));

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "O preço do produto deve ser float", "ERRO PREÇO DO PRODUTO", 0);
            cxPrecoCaneta.setText("");
            cxPrecoCaneta.requestFocus();
            return;
        }

        caneta.setMarca(cxMarcaCaneta.getText());

        caneta.setCorTinta(cxCorTinta.getText());
        caneta.setTipoCaneta(Integer.parseInt(cxTipoCaneta.getText()));
        caneta.setTamPonta(Integer.parseInt(cxTamanhoPonta.getText()));

        caneta = gerCan.cadCan(caneta);

        if (caneta != null) {
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso", "Cadastro Concluido", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Esse produto ja foi cadastrado", "ERRO COD. PRODUTO", 0);
            cxCodCaneta.setText("");
            cxCodCaneta.requestFocus();
        }
        return;

    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair:", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        cxCodCaneta.setText("");
        cxCodCaneta.requestFocus();
        cxPrecoCaneta.setText("");
        cxPrecoCaneta.requestFocus();
        cxMarcaCaneta.setText("");
        cxMarcaCaneta.requestFocus();
        cxCorTinta.setText("");
        cxCorTinta.requestFocus();
        cxTipoCaneta.setText("");
        cxTipoCaneta.requestFocus();
        cxTamanhoPonta.setText("");
        cxTamanhoPonta.requestFocus();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCaneta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarCaneta;
    private javax.swing.JButton btCadCaneta;
    private javax.swing.JButton btConsultarCaneta;
    private javax.swing.JButton btDeletaCaneta;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cxCodCaneta;
    private javax.swing.JTextField cxCorTinta;
    private javax.swing.JTextField cxMarcaCaneta;
    private javax.swing.JTextField cxPrecoCaneta;
    private javax.swing.JTextField cxTamanhoPonta;
    private javax.swing.JTextField cxTipoCaneta;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCaneta;
    private javax.swing.JLabel lbCodCaneta;
    private javax.swing.JLabel lbCorTinta;
    private javax.swing.JLabel lbMarcaCaneta;
    private javax.swing.JLabel lbPrecoCaneta;
    private javax.swing.JLabel lbTamanhoPonta;
    private javax.swing.JLabel lbTipoCaneta;
    private javax.swing.JTable tblCaneta;
    // End of variables declaration//GEN-END:variables
}
