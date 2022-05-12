import java.util.ArrayList;

public class Empresa {

   private ArrayList<Departamento> listDepartamento ;

   

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

    
}
