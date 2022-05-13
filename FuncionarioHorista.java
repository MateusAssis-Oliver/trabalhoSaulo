public class FuncionarioHorista extends Funcionario {

    private double horasTrabalhadas;

    public FuncionarioHorista(Departamento dep, double horasTrabalhadas) {
        this.setDepartamento(dep);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getQuantHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setQuantHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getSalario() {
        
       return  horasTrabalhadas * departamento.getvalorHoraTrabalhada();
    }

   
}
