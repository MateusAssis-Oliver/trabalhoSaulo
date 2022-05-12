public class FuncionarioComissionado extends Funcionario{

    private double valorVendas;
    private double percentualComissao;

    public FuncionarioComissionado(Departamento dep) {
 
        setDepartamento(dep);
    }



    public double getValorVendas() {
        return valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double salario(){
        return ( getValorVendas() * getPercentualComissao() );
    }
    
}
