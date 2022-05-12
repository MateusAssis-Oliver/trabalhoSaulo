import java.util.ArrayList;

public class Departamento {

    ArrayList<Funcionario> listFuncionario = new ArrayList<Funcionario>();

    private String descricao;
    private double valorHoraTrabalhada;

    public Departamento(String descricao, double valorHora) {

        this.descricao = descricao;
        this.valorHoraTrabalhada = valorHora;
    }

    public void addFuncioanrio(FuncionarioMensalista colaborador) {

        listFuncionario.add(colaborador);
        colaborador.setDepartamento(this);
    }

    public void addFuncioanrio(FuncionarioHorista colaborador) {

        listFuncionario.add(colaborador);
        colaborador.setDepartamento(this);
    }

    public void addFuncioanrio(FuncionarioComissionado colaborador) {

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

    public void listaSalarios() {

        for (Funcionario i : listFuncionario) {

            if (i instanceof FuncionarioComissionado) {
                System.out.println(((FuncionarioComissionado) i).salario());
            } else if (i instanceof FuncionarioHorista) {
                System.out.println(valorHoraTrabalhada * ((FuncionarioHorista) i).getQuantHorasTrabalhadas());
            } else if (i instanceof FuncionarioMensalista) {
                System.out.println(((FuncionarioMensalista) i).getSalario());
            }
        }

    }

}
