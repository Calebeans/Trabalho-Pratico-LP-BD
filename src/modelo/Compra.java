/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Igor
 */
public class Compra {
    private int id;
    private double valor;
    private Fornecedor fornecedor;
    private Date data_requerimento;
    
    public Object[] getDadosModel(){
        Object[] retorno = new Object[]{getId(),getValor(),getFornecedor(),getData_requerimento()};
        return retorno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getData_requerimento() {
        return data_requerimento;
    }

    public void setData_requerimento(Date data_requerimento) {
        this.data_requerimento = data_requerimento;
    }

    @Override
    public String toString() {
        return id + " - " + data_requerimento;
    }
    
    
    
}
