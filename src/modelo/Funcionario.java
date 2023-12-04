package modelo;

import java.util.Date;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private Date data_nascimento;
    
    private double salario;
    
    private String usuario;
    private String senha;
    private char tipoUsuario;
    
    private String uf;
    private String cep;
    private String cidade;
    private String rua;
    private int numero;
    
    public Funcionario() {
        this.id = 0;
    }
    
    public Object[] getDadosModel() {
        Object[] retorno = new Object[]{getId(), getNome(), getCpf(), 
            getTelefone(), getData_nascimento(), getSalario(), getUsuario(), 
            getSenha(), getTipoUsuario(), getUf(), getCep(), getCidade(),
            getRua(), getNumero()};
        return retorno;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
         
}
