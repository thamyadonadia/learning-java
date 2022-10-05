public class App {
    
    // função static porque pode ser executado fora do contexto do objeto
    public static void imprimeEmpresa(Empresa e){
        System.out.println(e.toString());
        for(Departamento d: e.getDepartamentos()){
            System.out.println(d.toString());
            System.out.println("   Funcionários:");
           
            for(Funcionario f: d.getFuncionarios()){
                System.out.println(f.toString());
            }

            System.out.println();
        }

        System.out.println("\nSalário médio da empresa: R$" + e.getMediaSalarial());
    }       


    public static void main(String[] args) {
        // criação dos funcionários 
        FuncionarioTempoParcial f1 = new FuncionarioTempoParcial("f1", 3000.0f, 20);
        FuncionarioTempoIntegral f2 = new FuncionarioTempoIntegral("f2", 2500.0f);
        FuncionarioTempoParcial f3 = new FuncionarioTempoParcial("f3", 2000.0f, 20);
        FuncionarioTempoIntegral f4 = new FuncionarioTempoIntegral("f4", 1500.0f);

        // criação dos departamentos 
        Departamento rh = new Departamento("RH");
        rh.addFuncionario(f1);
        rh.addFuncionario(f2);

        Departamento suporteTI = new Departamento("Suporte TI");
        suporteTI.addFuncionario(f3);
        suporteTI.addFuncionario(f4);

        // criação da empresa
        Empresa java = new Empresa("Java");
        java.addDepartamento(rh);
        java.addDepartamento(suporteTI);

        imprimeEmpresa(java);

        java.aumentaSalario(0.1f);
        System.out.println("\n\nAumento de 10% no salário");

        imprimeEmpresa(java);
    }

    // TODO: indica uma feature que vc ainda não implementou e precisa implementar
    // FIXME: indica algo que você precisa corrigir no código
}
