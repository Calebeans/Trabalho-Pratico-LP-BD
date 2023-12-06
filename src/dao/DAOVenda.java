/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Venda;

/**
 *
 * @author Calebe
 */
public class DAOVenda{
    public boolean incluirVenda(Venda venda) throws Exception{
        try {
            Conexao con = new Conexao();
            String sql = "insert into venda(valor, id_funcionario, id_cliente) values(?,?,?)";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setDouble(1, venda.getValor());
            pstm.setInt(2, venda.getFuncionario().getId());
            //pstm.setInt(3, venda.getClinte().getId());
            
            if (pstm.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");
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
    
    public boolean deletarVenda(int id){
        try {
            Conexao con = new Conexao();
            
            String sql = "delete from venda where id = " + id;
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            if (pstm.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Venda excluída com sucesso!");
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
}
