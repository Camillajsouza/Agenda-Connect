import java.time.LocalDateTime;

public class SistemaAgenda {
    public static void main(String[] args){
        Profissional profissional1 = new Profissional("Camilla", "camillasouzaarq@gmail.com", "senha123");
        Cliente cliente1 = new Cliente("Maria", "maria@gmail.com");

        Compromisso compromisso1 = new Compromisso(new LocalDateTime(0913, 1400), cliente1);
        profissional1.getAgenda().adicionarCompromisso(compromisso1);
        }
}
