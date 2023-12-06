package dao;

import conexao.Conexao;
import modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOProduto {
    
    public Produto consultarPorId(int id) {
        Produto produto = null;
        try {
            String sql = "select * from produto where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEstoque(rs.getInt("estoque"));
                produto.setUnidade(new DAOUnidade().consultarPorId(id));
                return produto;
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return produto;        
    }
    
    public List<Produto> consultarProdutos() {
        List<Produto> lista = new ArrayList<>();
        DAOUnidade daoUnidade = new DAOUnidade();
        try {
            String sql = "select * from produto";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEstoque(rs.getInt("unidade"));
                produto.setUnidade(daoUnidade.consultarPorId(rs.getInt("id_unidade")));
                lista.add(produto);
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }        
        return lista;
    }

    public List<Produto> consultarPorNome(String nome) {
        List<Produto> lista = new ArrayList<>();
        DAOUnidade daoUnidade = new DAOUnidade();
        try {
            String sql = "select * from produto where nome like '%"+nome+"%'";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEstoque(rs.getInt("estoque"));
                produto.setUnidade(daoUnidade.consultarPorId(rs.getInt("id_unidade")));
                lista.add(produto);
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }        
        return lista;
    }
}
