public class FuncionarioMensalista extends Funcionario{

    private double salario;

    public FuncionarioMensalista(Departamento dep) {
        setDepartamento(dep);
    }

    @Override
    public double getSalario() {
      
        return this.salario;
    }

}