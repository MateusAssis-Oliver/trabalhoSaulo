import javax.swing.JOptionPane;

public class App extends Empresa {
    

     /* Mostra o Menu na tela  e retoena o valor da opçao selecionada */
    public int startMenu(){
        String opc = "";
        opc = JOptionPane.showInputDialog(" 1 - Casdastrar Departamento\n 2 - Cadastro de Funcionario\n3 - Listar Salario De Um Dep\n4 - Listar Salarios\n 5 Listar Departamentos\n 00 - Sair");
        return ValidaInputs.validaInt(opc);
    }

    /* Cria o departamento x e adiciona na empresa passadas como referencia no contrutor */
    public void cadastraDepartamento(){

        String nome = BoxDeTextoxInputs.msnInputSimplesStr("Digite o Nome Do Departamenoto");
        int  valorHora = BoxDeTextoxInputs.msnInputSimplesNum("Digite o Valor Da hora TRabalhada");

        Departamento dep = new Departamento(emp, nome, valorHora);
        emp.addDepartamento(dep);
    }


    public void cadastraFuncionario(){
        /* ... */
    }


}
