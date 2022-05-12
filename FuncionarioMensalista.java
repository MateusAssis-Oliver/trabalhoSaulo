public class FuncionarioMensalista extends Funcionario{

    public double salario;

    public FuncionarioMensalista(Departamento dep , double salario) {
    
        setDepartamento(dep);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    };

}