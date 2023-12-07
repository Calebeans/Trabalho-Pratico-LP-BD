package modelo;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private Unidade unidade;

    public Object[] getDadosModel() {
        Object[] retorno = new Object[] { getId(), getNome(), getPreco(), 
            getEstoque(), getUnidade().getId(), getUnidade().getDescricao()};
        return retorno;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }       

    @Override
    public String toString() {
        return id + " - " + nome;
    }
    
}
