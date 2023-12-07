/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.ItensCompra;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Compra;
/**
 *
 * @author Igor
 */
public class DAOItensCompra {
    public boolean inserir(ItensCompra i){
        String sql = "insert into itens_compra(quantidade,id_compra,id_produto) values(?, ?, ?)";
        try{
            
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, i.getQuantidade());
            ps.setInt(2, i.getCompra().getId());
            ps.setInt(3, i.getProduto().getId());
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item compra criado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public List<ItensCompra> retornaTodas(){
        List<ItensCompra> retorno = new ArrayList<>();
        String sql = "select * from itens_compra";
        try{
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()){
                ItensCompra itenscompra = new ItensCompra();
                itenscompra.setId(rs.getInt("id"));
                itenscompra.setQuantidade(rs.getDouble("quantidade"));
                itenscompra.setCompra(new DAOCompra().achaPorId(rs.getInt("id_compra")));
                itenscompra.setProduto(new DAOProduto().consultarPorId(rs.getInt("id_produto")));
                retorno.add(itenscompra);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public List<ItensCompra> consultaPorCompra(int id_compra){
        List<ItensCompra> lista = new ArrayList<>();
        String sql = "select * from itens_compra where id_compra = "+id_compra;
        try { 
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                ItensCompra itensCompra = new ItensCompra();
                itensCompra.setId(rs.getInt("id"));
                itensCompra.setQuantidade(rs.getDouble("quantidade"));
                itensCompra.setCompra(new DAOCompra().achaPorId(rs.getInt("id_compra")));
                itensCompra.setProduto(new DAOProduto().consultarPorId(rs.getInt("id_produto")));
                lista.add(itensCompra);
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());            
        }     
        return lista;
    }
    
    public boolean deletar(int id) {
        try {
            String sql = "delete from itens_compra where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item da compra exluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());
            return false;
        }
    }
    
    public boolean alterar(ItensCompra itensCompra){
        try{
            String sql = "update itens_compra set quantidade = ?, id_compra = ?, id_produto = ? where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, itensCompra.getQuantidade());
            ps.setInt(2, itensCompra.getCompra().getId());
            ps.setInt(3, itensCompra.getProduto().getId());
            ps.setInt(4, itensCompra.getId());
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Item da compra alterado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
