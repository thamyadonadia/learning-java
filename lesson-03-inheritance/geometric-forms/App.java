import java.util.*;

public class App {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new LinkedList<>();

        formas.add(new Circulo(2.0));
        formas.add(new Retangulo(3.0, 2.0));
        formas.add(new Triangulo(1.0, 1.5, 2.0));
        
        for(FormaGeometrica f: formas){
            System.out.println(f.toString());
        }
    }
}
