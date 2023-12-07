package modelo;

public class Unidade {
    private int id;
    private String descricao;

    public Unidade(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Unidade() {
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Unidade other = (Unidade) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
      
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
