package provasci;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius cota
 */
public class TresJava {

    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, media;
        String nome;
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quarta nota: "));

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, nome + " foi aprovado(a) com média " + media);
            } else {
                JOptionPane.showMessageDialog(null, nome + " foi reprovado(a) com média " + media);
            }

            String resposta = JOptionPane.showInputDialog("Deseja continuar? (S/N)");
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
    }
}
