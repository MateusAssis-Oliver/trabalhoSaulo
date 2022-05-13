public class FuncionarioComissionado extends Funcionario{

    private double valorVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome , Departamento dep,  double valorVendas, double percentualComissao) {
 
        setDepartamento(dep);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
        this.setNome(nome);
        
    }



    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    


    @Override
    public double getSalario() {
        
        return ( getValorVendas() * getPercentualComissao() );
    }
    
}
