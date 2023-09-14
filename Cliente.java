public class Cliente {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String contato;

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Cliente(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    // Getters para nome e contato
}
