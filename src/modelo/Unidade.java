package modelo;

public class Unidade {
    private int id;
    private String descricao;

    public Object[] getDadosModel() {
        Object[] retorno = new Object[] { getId(), getDescricao()};
        return retorno;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
