package visual.funcionario;

import dao.DAOFuncionario;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;

public class ConsultaFuncionario extends javax.swing.JFrame {

    private boolean consultarNome = true;
    private DAOFuncionario daoFuncionario = new DAOFuncionario();

    public ConsultaFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoConsultarNome = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        botaoConsultarCpf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Funcionarios");

        labelNome.setText("Nome");

        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "Data Nascimento", "Salario", "Usuário", "Senha", "Tipo Usuário", "UF", "CEP", "Cidade", "Rua", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionarios);

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

        botaoConsultarNome.setText("Consultar Nome");
        botaoConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarNomeActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelCpf.setText("CPF");

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNome)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoConsultarNome)
                                .addGap(222, 222, 222)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoConsultarCpf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
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
        int id = (Integer) tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 0);
        daoFuncionario.deletar(id);
        atualizarTabela();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        int linha = tabelaFuncionarios.getSelectedRow();

        if (linha == -1) {
            return;
        }

        Funcionario funcionario = new Funcionario();

        funcionario.setId((Integer) tabelaFuncionarios.getValueAt(linha, 0));
        funcionario.setNome((String) tabelaFuncionarios.getValueAt(linha, 1));
        funcionario.setCpf((String) tabelaFuncionarios.getValueAt(linha, 2));
        funcionario.setTelefone((String) tabelaFuncionarios.getValueAt(linha, 3));
        funcionario.setData_nascimento((Date) tabelaFuncionarios.getValueAt(linha, 4));
        funcionario.setSalario((Double) tabelaFuncionarios.getValueAt(linha, 5));
        funcionario.setUsuario((String) tabelaFuncionarios.getValueAt(linha, 6));
        funcionario.setSenha((String) tabelaFuncionarios.getValueAt(linha, 7));
        funcionario.setTipoUsuario((Character) tabelaFuncionarios.getValueAt(linha, 8));
        funcionario.setUf((String) tabelaFuncionarios.getValueAt(linha, 9));
        funcionario.setCep((String) tabelaFuncionarios.getValueAt(linha, 10));
        funcionario.setCidade((String) tabelaFuncionarios.getValueAt(linha, 11));
        funcionario.setRua((String) tabelaFuncionarios.getValueAt(linha, 12));
        funcionario.setNumero((Integer) tabelaFuncionarios.getValueAt(linha, 13));

        new AlterarFuncionario(funcionario, this).setVisible(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        
    }//GEN-LAST:event_campoCpfActionPerformed

    private void botaoConsultarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarCpfActionPerformed
        consultarNome = false;
        atualizarTabela();
    }//GEN-LAST:event_botaoConsultarCpfActionPerformed

    public void atualizarTabela() {
         List<Funcionario> lista;
        if(consultarNome) {
            lista = daoFuncionario.consultarPorNome(campoNome.getText());
        } else {
            lista = daoFuncionario.consultarPorCpf(campoCpf.getText());
        }
        DefaultTableModel model = (DefaultTableModel) tabelaFuncionarios.getModel();
        model.setNumRows(0);
        for (Funcionario i : lista) {
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables

}
