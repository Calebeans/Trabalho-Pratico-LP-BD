package dao;

import conexao.Conexao;
import modelo.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFuncionario {

    public boolean incluir(Funcionario funcionario) {
        try {
            String sql = "insert into funcionario(nome, cpf, telefone, data_nascimento, salario, uf, cep, cidade, rua, numero, usuario, senha, tipo_usuario) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            // Informações Pessoais
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getTelefone());
            ps.setDate(4, new java.sql.Date(funcionario.getData_nascimento().getTime()));

            // Salario
            ps.setDouble(5, funcionario.getSalario());

            // Endereço
            ps.setString(6, funcionario.getUf());
            ps.setString(7, funcionario.getCep());
            ps.setString(8, funcionario.getCidade());
            ps.setString(9, funcionario.getRua());
            ps.setInt(10, funcionario.getNumero());

            // Login
            ps.setString(11, funcionario.getUsuario());
            ps.setString(12, funcionario.getSenha());
            ps.setString(13, String.valueOf(funcionario.getTipoUsuario()));

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario criado com sucesso");
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
    
    public Funcionario consultarPorId(int id) {
        try {
            String sql = "select id, nome, cpf, telefone, data_nascimento, salario, usuario, tipo_usuario, uf, cep, cidade, rua, numero from funcionario where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                // Informações Pessoais
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setData_nascimento(rs.getDate("data_nascimento"));

                // Salario
                funcionario.setSalario(rs.getDouble("salario"));

                // Login
                funcionario.setUsuario(rs.getString(("usuario")));
                funcionario.setTipoUsuario(rs.getString("tipo_usuario").charAt(0));

                // Endereço
                funcionario.setUf(rs.getString("uf"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setRua(rs.getString("rua"));
                funcionario.setNumero(rs.getInt("numero"));

                return funcionario;
            }

        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return null;
    }

    public List<Funcionario> consultarPorNome(String nome) {
        List<Funcionario> lista = new ArrayList<>();
        try {
            String sql = "select * from funcionario where nome like '%" + nome + "%'";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                // Informações Pessoais
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setData_nascimento(rs.getDate("data_nascimento"));

                // Salario
                funcionario.setSalario(rs.getDouble("salario"));

                // Login
                funcionario.setUsuario(rs.getString(("usuario")));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setTipoUsuario(rs.getString("tipo_usuario").charAt(0));

                // Endereço
                funcionario.setUf(rs.getString("uf"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setRua(rs.getString("rua"));
                funcionario.setNumero(rs.getInt("numero"));

                lista.add(funcionario);
            }

        } catch (Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return lista;
    }

    public boolean deletar(int id) {
        try {
            String sql = "delete from funcionario where id = ?";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario excluído com sucesso");
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

    public boolean alterar(Funcionario funcionario) {
        try {
            String sql = "update funcionario set nome = ?, cpf = ?, telefone = ?,"
                    + "data_nascimento = ?, salario = ?, uf = ?, cep = ?, cidade = ?,"
                    + "rua = ?, numero = ?, usuario = ?, senha = ?, tipo_usuario = ? where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            // Informações Pessoais
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getTelefone());
            ps.setDate(4, new java.sql.Date(funcionario.getData_nascimento().getTime()));

            // Salario
            ps.setDouble(5, funcionario.getSalario());

            // Endereço
            ps.setString(6, funcionario.getUf());
            ps.setString(7, funcionario.getCep());
            ps.setString(8, funcionario.getCidade());
            ps.setString(9, funcionario.getRua());
            ps.setInt(10, funcionario.getNumero());

            // Login
            ps.setString(11, funcionario.getUsuario());
            ps.setString(12, funcionario.getSenha());
            ps.setString(13, String.valueOf(funcionario.getTipoUsuario()));

            // Where
            ps.setInt(14, funcionario.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso");
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

}
