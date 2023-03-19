package provasci;

import java.util.Scanner;

/**
 *
 * @author vinicius cota
 */
public class UmJava {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int soma = 0, nmrspar = 0, nmrsimpar = 0;
        int[] nmrs = new int[5];
        double Media;
        for (int i = 0; i < nmrs.length; i++) {
            System.out.print("Informe 5 numeros inteiros: ");
            nmrs[i]++;
            nmrs[i] = entrada.nextInt();
            soma += nmrs[i];

            if (nmrs[i] % 2 == 0) {
                nmrspar++;
            } else {
                nmrsimpar++;
            }
        }
        System.out.print("Os numeros pares sao: ");
        for (int i = 0; i < nmrs.length; i++) {
            if (nmrs[i] % 2 == 0) {
                System.out.print(nmrs[i] + " ");
            }
        }
        System.out.print("\nOs numeros impares sao: ");
        for (int i = 0; i < nmrs.length; i++) {
            if (nmrs[i] % 2 != 0) {
                System.out.print(nmrs[i] + " ");
            }
        }
        Media = (double) soma / nmrs.length;
        System.out.println("\nMedia: " + Media);

    }

}
