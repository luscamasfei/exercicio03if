import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        } else {
            if (numero2 > numero1) {
                JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
            } else {
                JOptionPane.showMessageDialog(null, "Os números são iguais!");
            }
        }
    }
}