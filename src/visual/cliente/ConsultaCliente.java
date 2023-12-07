package visual.cliente;

import dao.DAOCliente;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ConsultaCliente extends javax.swing.JFrame {

    private boolean consultarNome = true;
    private DAOCliente daoCliente = new DAOCliente();
    
    public ConsultaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoConsultarNome = new javax.swing.JButton();
        painelTabelaClientes = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        botaoConsultarCpf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Clientes");

        labelNome.setText("Nome");

        botaoConsultarNome.setText("Consultar Nome");
        botaoConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarNomeActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "Data Nascimento", "UF", "CEP", "Cidade", "Rua", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelTabelaClientes.setViewportView(tabelaClientes);

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

        labelCpf.setText("CPF");

        botaoConsultarCpf.setText("Consultar CPF");
        botaoConsultarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabelaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
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
                                .addComponent(labelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoConsultarCpf))
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
                    .addComponent(labelCpf)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultarNome)
                    .addComponent(botaoConsultarCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabelaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
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

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int id = (Integer)tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0);
        daoCliente.deletar(id);
        atualizarTabela();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        int linha = tabelaClientes.getSelectedRow();

        if(linha == -1) return;

        Cliente cliente = new Cliente();

        cliente.setId((Integer) tabelaClientes.getValueAt(linha, 0));
        cliente.setNome((String) tabelaClientes.getValueAt(linha, 1));
        cliente.setCpf((String) tabelaClientes.getValueAt(linha, 2));
        cliente.setTelefone((String) tabelaClientes.getValueAt(linha, 3));
        cliente.setData_nascimento((Date) tabelaClientes.getValueAt(linha, 4));
        cliente.setUf((String) tabelaClientes.getValueAt(linha, 5));
        cliente.setCep((String) tabelaClientes.getValueAt(linha, 6));
        cliente.setCidade((String) tabelaClientes.getValueAt(linha, 7));
        cliente.setRua((String) tabelaClientes.getValueAt(linha, 8));
        cliente.setNumero((Integer) tabelaClientes.getValueAt(linha, 9));

        new AlterarCliente(cliente, this).setVisible(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConsultarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarCpfActionPerformed
        consultarNome = false;
        atualizarTabela();
    }//GEN-LAST:event_botaoConsultarCpfActionPerformed

    public void atualizarTabela() {
        List<Cliente> lista;
        if(consultarNome) {
            lista = daoCliente.consultarPorNome(campoNome.getText());
        } else {
            lista = daoCliente.consultarPorCpf(campoNome.getText());
        }
        DefaultTableModel model = (DefaultTableModel)tabelaClientes.getModel();
        model.setNumRows(0);
        for(Cliente i : lista) {
            model.addRow(i.getDadosModel());
        }
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConsultarCpf;
    private javax.swing.JButton botaoConsultarNome;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelNome;
    private javax.swing.JScrollPane painelTabelaClientes;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
