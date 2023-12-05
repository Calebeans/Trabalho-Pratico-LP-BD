/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.ItensCompra;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            //ps.setInt(3, i.getProduto().getId());
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario criado com sucesso");
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
        
        return retorno;
    }
}
