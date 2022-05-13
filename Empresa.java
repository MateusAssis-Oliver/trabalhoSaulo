import java.util.ArrayList;

public class Empresa {

    private ArrayList<Departamento> listDepartamento;
    App app;
    private String nome;

   

    public Empresa(){
        
        listDepartamento = new ArrayList<Departamento>();
    }

    public void  addDepartamento(Departamento dep){

        listDepartamento.add(dep);
    }

    public void listarDepartamentos(){

        for (Departamento i : listDepartamento) {
            
            System.out.println(i.getDescricao());
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void showDepartamentos(){
      
        String a = "";
        int b = 0;
        for (Departamento i : listDepartamento) {
            
            a += b + "- " + i.getDescricao()+"\n";
            b++;

        }

        BoxDeTextoxInputs.msnInputSimplesNum(a);

        
    }
    
}
