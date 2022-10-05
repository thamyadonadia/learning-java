import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private Time timeB;
    private LocalDate dataPartida;
    private Cidade cidade;
    private int golsTimeA;
    private int golsTimeB;

    // o construtor é um método público, que tem o mesmo nome da classe
    public Partida(Time timeA, Time timeB, LocalDate dataPartida, Cidade cidade){
        this.timeA = timeA;
        this.timeB = timeB;
        this.dataPartida = dataPartida;
        this.cidade = cidade;
    }

    // métodos que manipulam os gols dos times
    public int getGolsTimeA() {
        return golsTimeA;
    }

    public int getGolsTimeB() {
        return golsTimeB;
    }

    public void marcaGolTimeA(){
        golsTimeA++;
    }

    public void marcaGolTimeB(){
        golsTimeB++;
    }

    // métodos que manipulam as informações gerais dos times
    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public Cidade getCidade() {
        return cidade;
    }
}
