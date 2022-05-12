public abstract class Funcionario {

    private String nome;
    private String cidade;
    private String estado;
    private double quantHorasTrabalhadas;
    private Departamento departamento;
    

    public Funcionario(Departamento dep) {
        this.departamento = dep;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantHorasTrabalhadas() {
        return quantHorasTrabalhadas;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantHorasTrabalhadas(double quantHorasTrabalhadas) {
        this.quantHorasTrabalhadas = quantHorasTrabalhadas;
    }

   

}
