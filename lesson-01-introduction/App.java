import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        // construção das cidades e das suas respectivas unidades federativas
        UnidadeDaFederação rj_estado = new UnidadeDaFederação("Rio de Janeiro", "RJ");
        Cidade rj_cidade = new Cidade("Rio de Janeiro", "RJ", rj_estado);

        UnidadeDaFederação mg = new UnidadeDaFederação("Minas Gerais", "MG");
        Cidade bh = new Cidade("Belo Horizonte", "BH", mg);

        // construção dos times
        Time fla = new Time("Flamengo", rj_cidade);
        Time flu = new Time("Fluminense", rj_cidade);
        Time cruzeiro = new Time("Cruzeiro", bh);

        // construção da partida 1 
        Partida p1 = new Partida(fla, flu, LocalDate.of(2022, 9, 16), bh);
        System.out.println("Partida 1: " + p1.getTimeA().getNome() + " X " + p1.getTimeB().getNome());
        p1.marcaGolTimeA(); 

        System.out.print("Placar:\n\t" + p1.getTimeA().getNome() + " - " + p1.getGolsTimeA() + " gols\n");
        System.out.println("\t" + p1.getTimeB().getNome() +  " - " + p1.getGolsTimeB() + " gols");

        System.out.println("Local da partida: " + p1.getCidade().getNome() + " - " + p1.getCidade().getUF().getNome());
        System.out.println("Data da partida: " + p1.getDataPartida());

        // construção da partida 2
        Partida p2 = new Partida(fla, cruzeiro, LocalDate.of(2022, 9, 15), rj_cidade);
        System.out.println("\nPartida 1: " + p2.getTimeA().getNome() + " X " + p2.getTimeB().getNome());
        p2.marcaGolTimeB(); 

        System.out.println("Placar:\n\t" + p2.getTimeA().getNome() + " - " + p2.getGolsTimeA() + " gols");
        System.out.println("\t" + p2.getTimeB().getNome() + " - " + p2.getGolsTimeB() + " gols");

        System.out.println("Local da partida: " + p2.getCidade().getNome() + " - " + p2.getCidade().getUF().getNome());
        System.out.println("Data da partida: " + p2.getDataPartida());
    }
}
