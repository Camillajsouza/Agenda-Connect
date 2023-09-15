public class Profissional {
    private String nome;
    private Agenda[] agendas;
    private int numAgendas;

    public Profissional(String nome, int maxAgendas) {
        this.nome = nome;
        this.agendas = new Agenda[maxAgendas];
        this.numAgendas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAgenda(Agenda agenda) {
        if (numAgendas < agendas.length) {
            agendas[numAgendas] = agenda;
            numAgendas++;
        } else {
            System.out.println("Limite de agendas atingido.");
        }
    }

    public Agenda criarAgenda(String nome) {
        if (numAgendas < agendas.length) {
            Agenda novaAgenda = new Agenda(nome);
            agendas[numAgendas] = novaAgenda;
            numAgendas++;
            return novaAgenda;
        } else {
            System.out.println("Limite de agendas atingido.");
            return null;
        }
    }

    public Agenda[] getAgendas() {
        return agendas;
    }
}
