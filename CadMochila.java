//Daniela dos Santos Alves 2465728

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadMochila extends javax.swing.JFrame {

    private Mochila mochila;
    private GerMoc gerMoc = new GerMoc();

    private static CadMochila cadMocUnico;

    public CadMochila() {
        initComponents();
    }

    public static CadMochila getCadMoc() {
        if (cadMocUnico == null) {
            cadMocUnico = new CadMochila();
        }
        return cadMocUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lbCodMochila = new javax.swing.JLabel();
        cxCodMochila = new javax.swing.JTextField();
        lbMarcaMochila = new javax.swing.JLabel();
        cxMarcaMochila = new javax.swing.JTextField();
        lbPrecoMochila = new javax.swing.JLabel();
        cxPrecoMochila = new javax.swing.JTextField();
        lbCorMochila = new javax.swing.JLabel();
        cxCorMochila = new javax.swing.JTextField();
        lbTamanhoMochila = new javax.swing.JLabel();
        cxTamanhoMochila = new javax.swing.JTextField();
        lbFaixaEtaria = new javax.swing.JLabel();
        cxFaixaEtaria = new javax.swing.JTextField();
        btCadastrarMochila = new javax.swing.JButton();
        lbSexoMochila = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        cxSexo = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMochila = new javax.swing.JTable();
        btAlterarMochila = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Mochila");
        setBackground(new java.awt.Color(0, 0, 0));

        lbCodMochila.setText("Codigo da mochila");

        cxCodMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodMochilaActionPerformed(evt);
            }
        });

        lbMarcaMochila.setText("Marca da mochila");

        cxMarcaMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaMochilaActionPerformed(evt);
            }
        });

        lbPrecoMochila.setText("Preco da mochila");

        lbCorMochila.setText("Cor da mochila");

        cxCorMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorMochilaActionPerformed(evt);
            }
        });

        lbTamanhoMochila.setText("Tamanho da mochila 1 - Peq 2 - Med 3 - Grd");
        lbTamanhoMochila.setToolTipText("");

        cxTamanhoMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTamanhoMochilaActionPerformed(evt);
            }
        });

        lbFaixaEtaria.setText("Faixa Etaria 1- Crianca 2- Jovem 3- Adulto");

        cxFaixaEtaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFaixaEtariaActionPerformed(evt);
            }
        });

        btCadastrarMochila.setText("Cadastrar");
        btCadastrarMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMochilaActionPerformed(evt);
            }
        });

        lbSexoMochila.setText("Sexo 1-Fem 2- Mas");

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

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblMochila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo ", "Preco", "Marca", "Cor", "Tamanho", "Faixa Etaria", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tblMochila);

        btAlterarMochila.setText("Alterar");
        btAlterarMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarMochilaActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        lbTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("CADASTRO DE MOCHILA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbFaixaEtaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(cxFaixaEtaria, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCadastrarMochila)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAlterarMochila))
                                    .addComponent(btSair))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btLimpar)
                                    .addComponent(btDeletar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbCodMochila)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                    .addComponent(cxCodMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(244, 244, 244)
                                    .addComponent(lbTitulo))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSexoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTamanhoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMarcaMochila)
                            .addComponent(lbCorMochila)
                            .addComponent(lbPrecoMochila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTamanhoMochila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCorMochila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxMarcaMochila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxPrecoMochila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lbCodMochila)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPrecoMochila)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(cxCodMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPrecoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cxMarcaMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMarcaMochila))
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCorMochila)
                            .addComponent(cxCorMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTamanhoMochila)
                            .addComponent(cxTamanhoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFaixaEtaria)
                            .addComponent(cxFaixaEtaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSexoMochila)
                            .addComponent(cxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrarMochila)
                            .addComponent(btConsultar)
                            .addComponent(btAlterarMochila)
                            .addComponent(btDeletar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCodMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodMochilaActionPerformed


    }//GEN-LAST:event_cxCodMochilaActionPerformed

    private void cxCorMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorMochilaActionPerformed

    }//GEN-LAST:event_cxCorMochilaActionPerformed

    private void cxTamanhoMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTamanhoMochilaActionPerformed

    }//GEN-LAST:event_cxTamanhoMochilaActionPerformed

    private void cxFaixaEtariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFaixaEtariaActionPerformed

    }//GEN-LAST:event_cxFaixaEtariaActionPerformed

    private void btCadastrarMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMochilaActionPerformed
        cadastrarMochila();
        listarTabMochila();
    }//GEN-LAST:event_btCadastrarMochilaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarMochila();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarMochilaActionPerformed
        alterarMochila();
        listarTabMochila();
    }//GEN-LAST:event_btAlterarMochilaActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        deletaMochila();
        listarTabMochila();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void cxMarcaMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaMochilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaMochilaActionPerformed
    public void deletaMochila() {

        mochila = new Mochila();

        try {
            mochila.setCodProduto(Integer.parseInt(cxCodMochila.getText()));

            mochila = gerMoc.consMocCod(mochila);

            if (mochila != null) {

                cxCodMochila.setText(Integer.toString(mochila.getCodProduto()));
                cxPrecoMochila.setText(Float.toString(mochila.getPreco()));
                cxMarcaMochila.setText(mochila.getMarca());
                cxCorMochila.setText(mochila.getCor());

                cxTamanhoMochila.setText(Integer.toString(mochila.getTamanho()));
                cxFaixaEtaria.setText(Integer.toString(mochila.getFaixaEtaria()));
                cxSexo.setText(Integer.toString(mochila.getSexo()));

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse produto:", "Confirmacao de exclusao", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == 0) {
                    gerMoc.deletaMochila(mochila);
                    JOptionPane.showConfirmDialog(null, "Produto excluido com sucesso", "Exclusao Produto", JOptionPane.OK_OPTION);
                    limpar();
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodMochila.setText("");
            cxCodMochila.requestFocus();
        }
    }

    public void alterarMochila() {

        mochila = new Mochila();

        try {

            mochila.setCodProduto(Integer.parseInt(cxCodMochila.getText()));

            mochila = gerMoc.atualizaMochila(mochila);

            if (mochila != null) {
                cxCodMochila.setText(Integer.toString(mochila.getCodProduto()));
                cxPrecoMochila.setText(Float.toString(mochila.getPreco()));
                cxMarcaMochila.setText(mochila.getMarca());
                cxCorMochila.setText(mochila.getCor());

                cxTamanhoMochila.setText(Integer.toString(mochila.getTamanho()));
                cxFaixaEtaria.setText(Integer.toString(mochila.getFaixaEtaria()));
                cxSexo.setText(Integer.toString(mochila.getSexo()));
                JOptionPane.showMessageDialog(null, "Confirme os dados cadastrados com sucesso", "Confirmacao de Cadastro", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Esse codigo nao existe", "ERRO COD. PRODUTO", 0);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodMochila.setText("");
            cxCodMochila.requestFocus();
        }

    }

    public void listarTabMochila() {
        DefaultTableModel modelo = (DefaultTableModel) tblMochila.getModel();

        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Mochila moc : gerMoc.getBdMoc()) {
            modelo.insertRow(posLin, new Object[]{moc.getCodProduto(), moc.getPreco(), moc.getMarca(), moc.getCor(), moc.getTamanho(), moc.getFaixaEtaria(), moc.getSexo()});
            posLin++;
        }

    }

    public void consultarMochila() {

        mochila = new Mochila();

        try {
            mochila.setCodProduto(Integer.parseInt(cxCodMochila.getText()));

            mochila = gerMoc.consMocCod(mochila);

            if (mochila != null) {
                cxCodMochila.setText(Integer.toString(mochila.getCodProduto()));
                cxPrecoMochila.setText(Float.toString(mochila.getPreco()));
                cxMarcaMochila.setText(mochila.getMarca());
                cxCorMochila.setText(mochila.getCor());

                cxTamanhoMochila.setText(Integer.toString(mochila.getTamanho()));
                cxFaixaEtaria.setText(Integer.toString(mochila.getFaixaEtaria()));
                cxSexo.setText(Integer.toString(mochila.getSexo()));

                JOptionPane.showConfirmDialog(null, "Confirme os dados de caneta", "Confirmacao de dados", 1);
                limpar();
            } else {
                JOptionPane.showConfirmDialog(null, "Nao existe produto com esse codigo", "Codigo inexistente", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodMochila.setText("");
            cxCodMochila.requestFocus();

        }
    }

    public void cadastrarMochila() {

        mochila = new Mochila();

        try {

            mochila.setCodProduto(Integer.parseInt(cxCodMochila.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo do produto deve ser inteiro", "ERRO COD. PRODUTO", 0);
            cxCodMochila.setText("");
            cxCodMochila.requestFocus();
            return;
        }
        try {
            mochila.setPreco(Float.parseFloat(cxPrecoMochila.getText()));
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "O preço do produto deve ser float", "ERRO PREÇO DO PRODUTO", 0);
            cxPrecoMochila.setText("");
            cxPrecoMochila.requestFocus();
            return;
        }
        mochila.setMarca(cxMarcaMochila.getText());

        mochila.setCor(cxCorMochila.getText());
        mochila.setTamanho(Integer.parseInt(cxTamanhoMochila.getText()));
        mochila.setFaixaEtaria(Integer.parseInt(cxFaixaEtaria.getText()));
        mochila.setSexo(Integer.parseInt(cxSexo.getText()));

        mochila = gerMoc.cadMoc(mochila);

        if (mochila != null) {
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso", "Cadastro Concluido", 1);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Esse produto ja foi cadastrado", "ERRO COD. PRODUTO", 0);
            cxCodMochila.setText("");
            cxCodMochila.requestFocus();
        }

    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair:", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        cxCodMochila.setText("");
        cxCodMochila.requestFocus();
        cxPrecoMochila.setText("");
        cxPrecoMochila.requestFocus();
        cxMarcaMochila.setText("");
        cxMarcaMochila.requestFocus();
        cxCorMochila.setText("");
        cxCorMochila.requestFocus();
        cxTamanhoMochila.setText("");
        cxTamanhoMochila.requestFocus();
        cxFaixaEtaria.setText("");
        cxFaixaEtaria.requestFocus();
        cxSexo.setText("");
        cxSexo.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(CadMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadMochila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadMochila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarMochila;
    private javax.swing.JButton btCadastrarMochila;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCodMochila;
    private javax.swing.JTextField cxCorMochila;
    private javax.swing.JTextField cxFaixaEtaria;
    private javax.swing.JTextField cxMarcaMochila;
    private javax.swing.JTextField cxPrecoMochila;
    private javax.swing.JTextField cxSexo;
    private javax.swing.JTextField cxTamanhoMochila;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodMochila;
    private javax.swing.JLabel lbCorMochila;
    private javax.swing.JLabel lbFaixaEtaria;
    private javax.swing.JLabel lbMarcaMochila;
    private javax.swing.JLabel lbPrecoMochila;
    private javax.swing.JLabel lbSexoMochila;
    private javax.swing.JLabel lbTamanhoMochila;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tblMochila;
    // End of variables declaration//GEN-END:variables
}
