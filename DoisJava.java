package provasci;

import java.util.Scanner;

/**
 *
 * @author vinicius cota
 */
public class DoisJava {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int[] nmrs = new int[5];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i < nmrs.length; i++) {
            System.out.print("Informe 5 numeros inteiros: ");
            nmrs[i] = x.nextInt();
            if (nmrs[i] > maior) {
                maior = nmrs[i];
            }
            if (nmrs[i] < menor) {
                menor = nmrs[i];
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
    }
}
