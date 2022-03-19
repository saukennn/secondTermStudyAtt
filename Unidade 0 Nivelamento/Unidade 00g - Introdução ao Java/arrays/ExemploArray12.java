/* Faça um programa que leia N números inteiros e mostre na tela a soma
daqueles que forem múltiplos de três */

class ExemploArray12 {
    public static void main(String[] args) {

        int n = MyIO.readInt("Insira quantos numeros inteiros\n");
        int[] vet = new int[n];
        int soma = 0;

        MyIO.println("\n");

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Insira o " + (i + 1) + "º valor\n");
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 3 == 0) {
                soma += vet[i];
            }
        }

        MyIO.println("Soma dos multiplos de tres: " + soma);

    }
}