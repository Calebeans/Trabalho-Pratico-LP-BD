/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
            String sql = "insert into venda(valor, data_venda"
                    + "id_funcionario, id_cliente) values(?,?,?)";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setDouble(1, venda.getValor());
            pstm.setDate(2, new java.sql.Date(venda.getData_venda().getTime()));
            pstm.setInt(3, venda.getFuncionario().getId());
            pstm.setInt(4, venda.getCliente().getId());
            
            if (pstm.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, 
                        "Venda registrada com sucesso!");
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
                JOptionPane.showMessageDialog(null, 
                        "Venda excluída com sucesso!");
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
    
    public boolean alterarVenda(Venda venda) {
        try {
            Conexao con = new Conexao();
            String sql = "update venda set valor = ?, data_venda = ?,"
                    + " id_funcionario = ?, id_clente = ? where id = ?";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            
            pstm.setDouble(1, venda.getValor());
            pstm.setDate(2, new java.sql.Date(venda.getData_venda().getTime()));
            pstm.setInt(3, venda.getFuncionario().getId());
            pstm.setInt(4, venda.getCliente().getId());
            
            pstm.setInt(5, venda.getId());
            
            if (pstm.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, 
                        "Venda alterada com sucesso!");
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
    
    public List<Venda> consultaVenda(){
        List<Venda> lista = new ArrayList<>();
        try {
            String sql = "select * from venda";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                
                venda.setId(rs.getInt("id"));
                venda.setValor(rs.getDouble("valor"));
                venda.setData_venda(rs.getDate("data_venda"));
                //venda.setFuncionario(rs.getInt("id_funcionario"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
