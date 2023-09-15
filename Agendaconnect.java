public class Agendaconnect {
    public static void main(String[] args) {
        // Criar um profissional
        Profissional profissional = new Profissional("João", 3);

        // Adicionar uma agenda pessoal e duas agendas profissionais
        Agenda agendaPessoal = profissional.criarAgenda("Pessoal");
        Agenda agendaTrabalho = profissional.criarAgenda("Trabalho");
        Agenda agendaReunioes = profissional.criarAgenda("Reuniões");

        System.out.println("Agenda Pessoal: " + agendaPessoal.getNome());

        // Adicionar compromissos às agendas
        Compromisso compromisso1 = new Compromisso("2023-09-15", "10:00", "Reunião de Trabalho");
        agendaTrabalho.adicionarCompromisso(compromisso1);

        Compromisso compromisso2 = new Compromisso("2023-09-16", "14:00", "Consulta com Cliente");
        agendaReunioes.adicionarCompromisso(compromisso2);

        // Criar clientes
        Cliente cliente1 = new Cliente("Maria Silva", "maria@email.com", "123-456-7890");
        Cliente cliente2 = new Cliente("João Santos", "joao@email.com", "987-654-3210");

        // Associar clientes aos compromissos
        compromisso1.setCliente(cliente1);
        compromisso2.setCliente(cliente2);

        // Listar os compromissos do profissional
        System.out.println("Compromissos de " + profissional.getNome() + ":");
        for (Agenda agenda : profissional.getAgendas()) {
            System.out.println("Agenda: " + agenda.getNome());
            for (Compromisso compromisso : agenda.listarCompromissos()) {
                System.out.println("Data: " + compromisso.getData() + ", Horário: " + compromisso.getHorario()
                        + ", Descrição: " + compromisso.getDescricao());
                if (compromisso.getCliente() != null) {
                    System.out.println("Cliente associado: " + compromisso.getCliente().getNome());
                }
            }
        }
    }

@Override
public String toString() {
    return "Profissional: " + profissional.getNome();
}
}
