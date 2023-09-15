public class Compromisso {
    private String data;
    private String horario;
    private String descricao;
    private Cliente cliente; 

    public Compromisso(String data, String horario, String descricao) {
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Adicione um método para definir o cliente associado
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
