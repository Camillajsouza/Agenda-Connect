import java.time.LocalDateTime;

public class Compromisso {
    private int id;
    private String data;
    private String horario;
    private String descricao;
    

   

    public Compromisso(int id, String data, String horario, String descricao){
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
     public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}