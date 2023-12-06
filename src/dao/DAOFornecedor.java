package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;

/**
 *
 * @author Henrique
 */
public class DAOFornecedor {

    public boolean incluir(Fornecedor fornecedor) {
        try {
            String sql = "insert into fornecedor (nome, telefone, cnpj, uf, cep, cidade, rua, numero) values (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            // Informações do fornecedor
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getTelefone());
            ps.setString(3, fornecedor.getCnpj());

            // Endereço
            ps.setString(4, fornecedor.getUf());
            ps.setString(5, fornecedor.getCep());
            ps.setString(6, fornecedor.getCidade());
            ps.setString(7, fornecedor.getRua());
            ps.setInt(8, fornecedor.getNumero());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "fornecedor registrado com sucesso!");
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

    public List<Fornecedor> consultarPorNome(String nome) {
        List<Fornecedor> lista = new ArrayList<>();
        try {
            String sql = "select * from fornecedor where nome like '%" + nome + "%'";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();

                // Informações do fornecedor
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCnpj(rs.getString("cnpj"));

                // Endereço
                fornecedor.setUf(rs.getString("uf"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setRua(rs.getString("rua"));
                fornecedor.setNumero(rs.getInt("numero"));

                lista.add(fornecedor);
            }

        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return lista;
    }

    public boolean deletar(int id) {
        try {
            String sql = "delete from fornecedor where id = ?";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso!");
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

    public boolean alterar(Fornecedor fornecedor) {
        try {
            String sql = "update fornecedor set nome = ?, telefone = ?,"
                    + "cnpj = ?, uf = ?, cep = ?, cidade = ?,"
                    + "rua = ?, numero = ? where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            // Informações do fornecedor
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getTelefone());
            ps.setString(3, fornecedor.getCnpj());

            // Endereço
            ps.setString(4, fornecedor.getUf());
            ps.setString(5, fornecedor.getCep());
            ps.setString(6, fornecedor.getCidade());
            ps.setString(7, fornecedor.getRua());
            ps.setInt(8, fornecedor.getNumero());

            // Where
            ps.setInt(9, fornecedor.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso");
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
