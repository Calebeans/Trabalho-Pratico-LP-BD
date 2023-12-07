/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.ItensVenda;

/**
 *
 * @author Calebe
 */
public class DAOItensVenda {
    public boolean incluirItensVenda(ItensVenda itensVenda){
        try {
            Conexao con = new Conexao();
            String sql = "insert into itens_venda(quantidade_produto, id_venda,"
                    + "id_produto";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setDouble(1, itensVenda.getQuantidadeProduto());
            pstm.setInt(2, itensVenda.getVenda().getId());
            pstm.setInt(3, itensVenda.getProduto().getId());
            
            if (pstm.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, 
                        "Item adicionando com sucesso!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Erro!");
                return false;
            }
        } catch (Exception e) {
            System.out.println("SQLExceptin " + e.getMessage());
            return false;
        }
    }
    
    public boolean deletarItensVenda(int id){
        try {
            Conexao con = new Conexao();
            String sql = "delete from itens_venda where id = " + id;
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            if (pstm.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, 
                        "Item excluido com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (Exception e) {
            System.out.println("SQLException " + e.getMessage());
            return false;
        }
    }
    
    public boolean alterarItensVenda(ItensVenda itensVenda){
        try {
            Conexao con = new Conexao();
            String sql = "update itens_venda set quantidade_produto = ?, "
                    + "id_venda = ?, id_produto = ? where id = ?";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            
            pstm.setDouble(1, itensVenda.getQuantidadeProduto());
            pstm.setInt(2, itensVenda.getVenda().getId());
            pstm.setInt(3, itensVenda.getProduto().getId());
            
            pstm.setInt(4, itensVenda.getId());
            
            if (pstm.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, 
                        "Item alterado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro!");
                return false;
            }
        } catch (Exception e) {
            System.out.println("SQLException " + e.getMessage());
            return false;
        }
        
        
    }
}
