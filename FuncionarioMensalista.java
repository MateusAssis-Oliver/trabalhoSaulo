public class FuncionarioMensalista extends Funcionario{

    private double salario;

    public FuncionarioMensalista(Departamento dep, double salario) {
        setDepartamento(dep);
        this.salario = salario;
    }

    @Override
    public double getSalario() {
      
        return this.salario;
    }

}