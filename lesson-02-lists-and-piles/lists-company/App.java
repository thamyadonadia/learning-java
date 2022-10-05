public class App {
    
    // função static porque pode ser executado fora do contexto do objeto
    public static void imprimeEmpresa(Empresa e){
        System.out.println("Empresa: " + e.getNome() + "\n");
        for(Departamento d: e.getDepartamentos()){
            System.out.println("Departamento: " + d.getNome());
            System.out.println("   Salário médio: R$" + d.getMediaSalarial() + "\n");
            
            System.out.println("   Funcionários:");
            for(Funcionario f: d.getFuncionarios()){
              System.out.println("       " + f.getNome() + " - R$" + f.getSalario());
            }

            System.out.println();
        }

        System.out.println("\nSalário médio da empresa: R$" + e.getMediaSalarial());
    }       


    public static void main(String[] args) {
        // criação dos funcionários
        Funcionario f1 = new Funcionario("f1", 3000.0f);
        Funcionario f2 = new Funcionario("f2", 2500.0f);
        Funcionario f3 = new Funcionario("f3", 2000.0f);

        // criação dos departamentos 
        Departamento rh = new Departamento("RH");
        rh.addFuncionario(f1);

        Departamento vendas = new Departamento("Vendas");
        vendas.addFuncionario(f2);

        Departamento suporteTI = new Departamento("Suporte TI");
        suporteTI.addFuncionario(f3);

        // criação da empresa
        Empresa java = new Empresa("Java");
        java.addDepartamento(rh);
        java.addDepartamento(vendas);
        java.addDepartamento(suporteTI);

        imprimeEmpresa(java);

        java.aumentaSalario(0.1f);
        System.out.println("\n\nAumento de 10% no salário");

        imprimeEmpresa(java);
    }
}
