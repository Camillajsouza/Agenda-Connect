public class Cliente {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    private String telefone;

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
