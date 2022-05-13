import javax.swing.JOptionPane;

public class BoxDeTextoxInputs {
    
    public static String msnInputSimplesStr(String message){

       return JOptionPane.showInputDialog(null, message);
        
    }

    public static int msnInputSimplesNum(String message){

      return ValidaInputs.validaInt(JOptionPane.showInputDialog(null, message)); 
         
     }
}
