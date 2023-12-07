package visual;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import dao.DAOCliente;
/**
 *
 * @author Henrique
 */
public class AlterarCliente extends javax.swing.JFrame {
    private Cliente cliente;
    private DAOCliente daoCliente = new DAOCliente();
    private ConsultaCliente consulta;
    
    public AlterarCliente(Cliente cliente, ConsultaCliente consulta){
        this();
        this.cliente = cliente;
        this.consulta = consulta;
        preencherCampos();
    }
    
    public AlterarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        labelDataNascimento = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
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
        botaoAlterar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNome1.setText("Nome");

        labelCpf.setText("CPF");

        labelTelefone.setText("Telefone");

        labelDataNascimento.setText("Data Nascimento");

        labelUf.setText("UF");

        labelCep.setText("CEP");

        labelCidade.setText("Cidade");

        labelRua.setText("Rua");

        labelNumero.setText("Número");

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoRua)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(labelNome1, javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(labelDataNascimento)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade)
                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCpf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome1)
                    .addComponent(labelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherCampos() {
        campoNome.setText(cliente.getNome());
        campoCpf.setText(cliente.getCpf());
        campoTelefone.setText(cliente.getTelefone());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        campoDataNascimento.setText(formatter.format(cliente.getData_nascimento()));
        campoUf.setText(cliente.getUf());
        campoCep.setText(cliente.getCep());
        campoCidade.setText(cliente.getCidade());
        campoRua.setText(cliente.getRua());
        campoNumero.setText(String.valueOf(cliente.getNumero()));
    }
    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        boolean inserir = true;

        cliente.setNome(campoNome.getText());
        cliente.setCpf(campoCpf.getText());
        cliente.setTelefone(campoTelefone.getText());

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(campoDataNascimento.getText());
            cliente.setData_nascimento(date);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no formato da data de nascimento!");
            campoDataNascimento.requestFocus();
            inserir = false;
        }

        cliente.setUf(campoUf.getText());
        cliente.setCep(campoCep.getText());
        cliente.setCidade(campoCidade.getText());
        cliente.setRua(campoRua.getText());

        try {
            cliente.setNumero(Integer.parseInt(campoNumero.getText()));
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no número da casa!");
            campoNumero.requestFocus();
            inserir = false;
        }
        if(inserir) {
            daoCliente.alterar(cliente);
            consulta.atualizarTabela();
            this.dispose();
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoUf;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUf;
    // End of variables declaration//GEN-END:variables
}
