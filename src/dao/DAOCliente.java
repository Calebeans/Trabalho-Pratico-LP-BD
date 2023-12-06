package dao;

import conexao.Conexao;
import modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class DAOCliente {

    public boolean incluir(Cliente cliente) {
        try {
            String sql = "insert into cliente (nome, cpf, telefone, data_nascimento, uf, cep, cidade, rua, numero) values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            // Informações pessoais
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setDate(4, new java.sql.Date(cliente.getData_nascimento().getTime()));

            // Endereço
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getCep());
            ps.setString(8, cliente.getCidade());
            ps.setString(9, cliente.getRua());
            ps.setInt(10, cliente.getNumero());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }

        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
            return false;
        }
    }

    public List<Cliente> consultarPorNome(String nome) {
        List<Cliente> lista = new ArrayList<>();
        try {
            String sql = "select * from cliente where nome like '%" + nome + "%'";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                // Informações Pessoais
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setData_nascimento(rs.getDate("data_nascimento"));

                // Endereço
                cliente.setUf(rs.getString("uf"));
                cliente.setCep(rs.getString("cep"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getInt("numero"));

                lista.add(cliente);
            }

        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return lista;
    }

    public boolean deletar(int id) {
        try {
            String sql = "delete from cliente where id = ?";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
            return false;
        }
    }

    public boolean alterar(Cliente cliente) {
        try {
            String sql = "update cliente set nome = ?, cpf = ?, telefone = ?,"
                    + "data_nascimento = ?, uf = ?, cep = ?, cidade = ?,"
                    + "rua = ?, numero = ? where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            // Informações Pessoais
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setDate(4, new java.sql.Date(cliente.getData_nascimento().getTime()));

            // Endereço
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getCep());
            ps.setString(8, cliente.getCidade());
            ps.setString(9, cliente.getRua());
            ps.setInt(10, cliente.getNumero());

            // Where
            ps.setInt(14, cliente.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro");
            System.out.println("SQLException " + ex.getMessage());
            return false;
        }
    }
}
