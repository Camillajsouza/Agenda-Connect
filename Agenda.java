public class Agenda {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Compromisso[] compromissos;

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    private int numCompromissos;

    public int getNumCompromissos() {
        return numCompromissos;
    }

    public void setNumCompromissos(int numCompromissos) {
        this.numCompromissos = numCompromissos;
    }

    public Agenda(String nome, int maxCompromissos) {
        this.nome = nome;
        this.compromissos = new Compromisso[maxCompromissos];
        this.numCompromissos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        if (numCompromissos < compromissos.length) {
            compromissos[numCompromissos] = compromisso;
            numCompromissos++;
        } else {
            System.out.println("Limite de compromissos atingido.");
        }
    }

    public Compromisso[] listarCompromissos() {
        return compromissos;
    }
}
