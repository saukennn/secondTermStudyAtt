/* Faça um método que receba um array de inteiros e mostre na
tela o maior e o menor elementos do array. */

import java.util.Arrays;

class ex3slide3 {

    public static void retornaValores(int[] vet) {
        int maior;
        int menor;

        menor = maior = vet[0];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            } else if (maior < vet[i]) {
                maior = vet[i];
            }
        }

        MyIO.println("\n");

        MyIO.println("Maior: " + maior + "\n" + "Menor: " + menor);
    }

    public static void main(String[] args) {
        
        int n = MyIO.readInt("Insira o tamanho do Array\n");
        int[] vet = new int[n];

        MyIO.println("\n");

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Insira um valor\n");
        }

        retornaValores(vet);
        
    }

}
