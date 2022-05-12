import java.util.ArrayList;

public class Departamento {
    
    ArrayList<Funcionario> listFuncionario = new ArrayList<Funcionario>();

    
    String descricao;
    double valorHoraTrabalhada;

    public Departamento( String descricao, double valorHora){

        this.descricao = descricao;
        this.valorHoraTrabalhada =  valorHora;
    }

    public void addFuncioanrio(Funcionario colaborador){

        listFuncionario.add(colaborador);
        colaborador.setDepartamento(this);
    }

    public String getDescricao() {
        return descricao;
    }
    public void setHoraTrabalhada(double horaTrabalhada) {
        this.valorHoraTrabalhada = horaTrabalhada;
    }
    public double getHoraTrabalhada() {
        return valorHoraTrabalhada;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }





    
}
