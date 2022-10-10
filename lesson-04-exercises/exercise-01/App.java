public class App {
    public static void main(String[] args) {
        if(args.length!=6){
            System.out.println("Uso: java App <xvertice1> <yvertice1> <xvertice2> <yvertice2> <xvertice3> <yvertice3>");
            return;
        }

        // obtenção dos valores pela linha de comando
        double x1 = Double.parseDouble(args[0]); 
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double x3 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);

        // criação dos pontos
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Ponto p3 = new Ponto(x3, y3);

        // criação do triângulo e cálculo do seu perímetro 
        Triangulo t = new Triangulo(p1, p2, p3);
        System.out.println("Perímetro do Triângulo: " + t.getPerimetro());
    }
}
