import empresa.Funcionario;
import empresa.Sala;

public class App {
    public static void main(String[] args) throws Exception {
        Sala s1 = new Sala(1);
        Sala s2 = new Sala(2);

        Funcionario f1 = new Funcionario("F1",2000.0);
        Funcionario f2 = new Funcionario("F2",2000.0);

        //f1.setSalaOcupada(s1);
        //f2.setSalaOcupada(s1);

        s1.adicionaOcupante(f1);
        s1.adicionaOcupante(f2);

        System.out.println(s1);
        System.out.println(s2);

        s2.adicionaOcupante(f1);

        System.out.println(s1);
        System.out.println(s2);
        
    }
}


/*
@startuml
class Funcionario{
    salario : double 
}

Funcionario "0..1" <-> "1" Sala : ocupa >
Sala : -numero : in{readOnly}
@enduml
*/


//Link para documentação: https://plantuml.com/class-diagram
