/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Compra;
import java.sql.ResultSet;

/**
 *
 * @author Igor
 */
public class DAOCompra {
    public boolean incluir(Compra compra){
        String sql = "insert into compra(valor,id_fornecedor) values(?, ?)";
        try{
            
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, compra.getValor());
            ps.setInt(2, compra.getFornecedor().getId());
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario criado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return true;
    }
    
    public int retornaUltimo(){
        int retorno = -1;
        try{
            String sql = "select * from compra order by id desc limit 1";
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            rs.next();
            retorno = rs.getInt("id");
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public List<Compra> retornaTodos(){
        List<Compra> retorno = new ArrayList<>();
        String sql = "select * from compra";
        try{
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()){
                Compra compra = new Compra();
                compra.setId(rs.getInt("id"));
                compra.setValor(rs.getDouble("valor"));
                compra.setFornecedor(new DAOFornecedor().consultarPorId(rs.getInt("id_fornecedor")));
                compra.setData_requerimento(rs.getTimestamp("data_requerimento"));
                retorno.add(compra);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public List<Compra> consultaPorFornecedor(int id_fornecedor){
        List<Compra> lista = new ArrayList<>();
        String sql = "select * from compra where id_fornecedor = "+id_fornecedor;
        try { 
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                Compra compra = new Compra();
                compra.setId(rs.getInt("id"));
                compra.setValor(rs.getDouble("valor"));
                compra.setFornecedor(new DAOFornecedor().consultarPorId(rs.getInt("id_fornecedor")));
                compra.setData_requerimento(rs.getTimestamp("data_requerimento"));
                lista.add(compra);
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());            
        }     
        return lista;
    }
    
    public Compra achaPorId(int id){
        Compra retorno = new Compra();
        String sql = "select * from compra where id = "+id;
        try { 
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()) {
                retorno.setId(rs.getInt("id"));
                retorno.setValor(rs.getDouble("valor"));
                retorno.setFornecedor(new DAOFornecedor().consultarPorId(rs.getInt("id_fornecedor")));
                retorno.setData_requerimento(rs.getTimestamp("data_requerimento"));
            }
        } catch(Exception ex) {
            System.out.println("SQLException " + ex.getMessage());            
        }
        return retorno;
    }
    
    public boolean deletar(int id) {
        try {
            String sql = "delete from compra where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Compra exluida com sucesso");
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
    
    public boolean alterar(Compra compra){
        try{
            String sql = "update compra set valor = ?, id_fornecedor = ? where id = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, compra.getValor());
            ps.setInt(2, compra.getFornecedor().getId());
            ps.setInt(3, compra.getId());
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Compra alterada com sucesso");
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
