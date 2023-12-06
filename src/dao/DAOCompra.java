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
//            ps.setInt(2, compra.getFornecedor().getId());
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
    
    public List<Compra> retornaTodos(){
        List<Compra> retorno = new ArrayList<>();
        String sql = "select * from compra";
        try{
            ResultSet rs = Conexao.getConexao().prepareStatement(sql).executeQuery();
            while(rs.next()){
                Compra compra = new Compra();
                compra.setId(rs.getInt("id"));
                compra.setValor(rs.getDouble("valor"));
//                compra.setFornecedor(DAOFornecedor.achaPorId(rs.getInt("id_fornecedor")))
            retorno.add(compra);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    
}
