import javax.swing.JOptionPane;

public class ValidaInputs {

    public static int validaInt(String i) {

        int valor;

        try {

            valor = Integer.parseInt(i);

            return valor;

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Valor inserido não e valido", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return -1;
    }
}
