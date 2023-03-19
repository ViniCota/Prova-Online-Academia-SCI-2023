package provasci;

import java.util.Scanner;

/**
 *
 * @author vinicius cota
 */
public class QuatroJava {

    public static void main(String[] args) {

        int[] vet = new int[5];
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe 5 numeros inteiros: ");
            vet[i] = x.nextInt();

        }
        System.out.println("O valor da posicao 3 é: " + vet[2]);
    }
}
