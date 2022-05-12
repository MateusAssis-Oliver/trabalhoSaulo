public class Main{
    public static void main(String[] args) {

        Empresa Ubametra = new Empresa();

        Departamento financeiro = new Departamento(Ubametra , "Financeiro", 20.00);

        FuncionarioMensalista Mateus = new FuncionarioMensalista(financeiro);

    }

}