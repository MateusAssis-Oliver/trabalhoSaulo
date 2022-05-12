import java.util.ArrayList;

public class Departamento {

    private ArrayList<Funcionario> listFuncionario;
    private String descricao;
    private double valorHoraTrabalhada;
    private Empresa empresa;

    public Departamento(Empresa empresa , String descricao, double valorHora) {

        this.empresa = empresa;
        listFuncionario = new ArrayList<Funcionario>();
        this.descricao = descricao;
        this.valorHoraTrabalhada = valorHora;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public void setvalorHoraTrabalhada(double horaTrabalhada) {
        this.valorHoraTrabalhada = horaTrabalhada;
    }

    public double getvalorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void listaSalarios() {

        for (Funcionario i : listFuncionario) {

            if (i instanceof FuncionarioComissionado) {
                System.out.println(((FuncionarioComissionado) i).getSalario());
            } else if (i instanceof FuncionarioHorista) {
                System.out.println(valorHoraTrabalhada * ((FuncionarioHorista) i).getQuantHorasTrabalhadas());
            } else if (i instanceof FuncionarioMensalista) {
                System.out.println(((FuncionarioMensalista) i).getSalario());
            }
        }

    }

}
