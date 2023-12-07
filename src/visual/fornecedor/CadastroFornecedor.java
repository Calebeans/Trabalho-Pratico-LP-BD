package visual.fornecedor;

import dao.DAOFornecedor;
import javax.swing.JOptionPane;
import modelo.Fornecedor;

public class CadastroFornecedor extends javax.swing.JFrame {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    public CadastroFornecedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelCnpj = new javax.swing.JLabel();
        campoCnpj = new javax.swing.JTextField();
        labelUf = new javax.swing.JLabel();
        campoUf = new javax.swing.JTextField();
        labelCep = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        labelRua = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Fornecedor");

        labelNome.setText("Nome");

        labelTelefone.setText("Telefone");

        labelCnpj.setText("CNPJ");

        labelUf.setText("UF");

        labelCep.setText("CEP");

        labelCidade.setText("Cidade");

        labelRua.setText("Rua");

        labelNumero.setText("Número");

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(botaoInserir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botaoCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoRua)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                .addComponent(labelNome, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelUf))
                                            .addGap(18, 18, 18)
                                            .addComponent(labelCep)))
                                    .addComponent(labelRua))
                                .addComponent(labelTelefone))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNumero)
                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCidade)
                                .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCnpj))))
                    .addGap(4, 4, 4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNome)
                                .addComponent(labelCnpj))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelUf)
                                .addComponent(labelCep)
                                .addComponent(labelCidade))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelRua)
                                .addComponent(labelNumero))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(164, 164, 164))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoCancelar)
                                .addComponent(botaoInserir))))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        boolean inserir = true;

        fornecedor.setNome(campoNome.getText());
        fornecedor.setTelefone(campoTelefone.getText());
        fornecedor.setCnpj(campoCnpj.getText());

        fornecedor.setUf(campoUf.getText());
        fornecedor.setCep(campoCep.getText());
        fornecedor.setCidade(campoCidade.getText());
        fornecedor.setRua(campoRua.getText());

        try {
            fornecedor.setNumero(Integer.parseInt(campoNumero.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no número da casa!");
            campoNumero.requestFocus();
            inserir = false;
        }
        if (inserir) {
            if (daoFornecedor.incluir(fornecedor)) {
                limparCampos();
            }
        }
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void limparCampos() {
        campoNome.setText("");
        campoTelefone.setText("");
        campoCnpj.setText("");
        campoUf.setText("");
        campoCep.setText("");
        campoCidade.setText("");
        campoRua.setText("");
        campoNumero.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCnpj;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoUf;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUf;
    // End of variables declaration//GEN-END:variables
}
