package visual.fornecedor;

import dao.DAOFornecedor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedor;

public class ConsultaFornecedor extends javax.swing.JFrame {

    DAOFornecedor daoFornecedor = new DAOFornecedor();
    boolean consultarNome = true;
    
    public ConsultaFornecedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoConsultarNome = new javax.swing.JButton();
        painelTabelaFornecedor = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        labelCnpj = new javax.swing.JLabel();
        campoCnpj = new javax.swing.JTextField();
        botaoConsultarCnpj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Fornecedores");

        labelNome.setText("Nome");

        botaoConsultarNome.setText("Consultar Nome");
        botaoConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarNomeActionPerformed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone", "CNPJ", "UF", "CEP", "Cidade", "Rua", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelTabelaFornecedor.setViewportView(tabelaFornecedores);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        labelCnpj.setText("CNPJ");

        botaoConsultarCnpj.setText("Consultar CNPJ");
        botaoConsultarCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarCnpjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabelaFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoConsultarNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoConsultarCnpj))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCnpj)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultarNome)
                    .addComponent(botaoConsultarCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabelaFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCancelar))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConsultarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarNomeActionPerformed
        consultarNome = true;
        atualizarTabela();
    }//GEN-LAST:event_botaoConsultarNomeActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        int linha = tabelaFornecedores.getSelectedRow();

        if (linha == -1) {
            return;
        }

        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setId((Integer) tabelaFornecedores.getValueAt(linha, 0));
        fornecedor.setNome((String) tabelaFornecedores.getValueAt(linha, 1));
        fornecedor.setTelefone((String) tabelaFornecedores.getValueAt(linha, 2));
        fornecedor.setCnpj((String) tabelaFornecedores.getValueAt(linha, 3));
        fornecedor.setUf((String) tabelaFornecedores.getValueAt(linha, 4));
        fornecedor.setCep((String) tabelaFornecedores.getValueAt(linha, 5));
        fornecedor.setCidade((String) tabelaFornecedores.getValueAt(linha, 6));
        fornecedor.setRua((String) tabelaFornecedores.getValueAt(linha, 7));
        fornecedor.setNumero((Integer) tabelaFornecedores.getValueAt(linha, 8));

        new AlterarFornecedor(fornecedor, this).setVisible(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int id = (Integer) tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 0);
        daoFornecedor.deletar(id);
        atualizarTabela();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarCnpjActionPerformed
        consultarNome = false;
        atualizarTabela();
    }//GEN-LAST:event_botaoConsultarCnpjActionPerformed
    
    public void atualizarTabela() {
        List<Fornecedor> lista;
        if(consultarNome) {
            lista = daoFornecedor.consultarPorNome(campoNome.getText());
        } else  {
            lista = daoFornecedor.consultarPorCnpj(campoCnpj.getText());
        }
        DefaultTableModel model = (DefaultTableModel) tabelaFornecedores.getModel();
        model.setNumRows(0);
        for (Fornecedor i : lista) {
            model.addRow(i.getDadosModel());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConsultarCnpj;
    private javax.swing.JButton botaoConsultarNome;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoCnpj;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelNome;
    private javax.swing.JScrollPane painelTabelaFornecedor;
    private javax.swing.JTable tabelaFornecedores;
    // End of variables declaration//GEN-END:variables
}
