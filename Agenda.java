import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    // Métodos para adicionar, remover e listar compromissos

    public Agenda(Profissional profissional) {
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public void removerCompromisso(Compromisso compromisso) {
        compromissos.remove(compromisso);
    }

    public List<Compromisso> listarCompromissos() {
        return compromissos;
    }
}
