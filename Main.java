public class Main{
    public static void main(String[] args) {

        Empresa empresa01 = new Empresa();

        while (true) {
            
            int opc = empresa01.app.startMenu();
            
            switch (opc) {
                case 1:{

                
                    break;
                }
                case 2:{
                    


                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                    break;
                }
                case 5:{

                    empresa01.showDepartamentos();
                    break;
                }
            
                default:
                    break;
            }

            if(opc == 00){
                break;
            }
            
        }
        

         /* 
        
        Empresa Ubametra = new Empresa();

        Departamento financeiro = new Departamento(Ubametra , "Financeiro", 20.00);
        Departamento producao = new Departamento(Ubametra, "Produção", 12.50);

        FuncionarioMensalista Mateus = new FuncionarioMensalista(financeiro, 1200);
        FuncionarioComissionado Joao = new FuncionarioComissionado(financeiro,82.90,0.25);
        FuncionarioHorista thiago = new FuncionarioHorista(financeiro,8);

        FuncionarioMensalista Carlos = new FuncionarioMensalista(producao, 1500);
        FuncionarioHorista Vitor = new FuncionarioHorista(producao,16);

        producao.addFuncioanrio(Carlos);
        producao.addFuncioanrio(Vitor);

        producao.listaSalarios();

       financeiro.addFuncioanrio(Mateus);
        financeiro.addFuncioanrio(Joao);
        financeiro.addFuncioanrio(thiago);

        financeiro.listaSalarios(); */
    }

}