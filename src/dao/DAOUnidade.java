package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Unidade;

public class DAOUnidade {
    
    public Unidade consultarPorId(int id) {
        Unidade unidade = null;
        try {
            String sql = "select * from unidade where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                unidade = new Unidade();
                unidade.setId(rs.getInt("id"));
                unidade.setDescricao(rs.getString("descricao"));
                return unidade;
            }
        } catch(Exception ex) {           
            System.out.println("SQLException " + ex.getMessage());
        }
        return unidade;
    }
    
    public List<Unidade> consultarUnidades() {
        List<Unidade> lista = new ArrayList<>();
        try {
            String sql = "select * from unidade";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                Unidade unidade = new Unidade();
                unidade.setId(rs.getInt("id"));
                unidade.setDescricao(rs.getString("descricao"));
                lista.add(unidade);
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
        }
        return lista;
    }
}
