
/* Faça um programa que leia os elementos de um array de
 tamanho n e mostre o maior e o menor elementos do array*/

public class ExemploArray5 {

    public static void main(String[] args) {
        int n = MyIO.readInt("Digite o numero de elementos: \n");
        int vet[] = new int[n];
        int maior, menor;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Digite um numero\n");
        }

        menor = maior = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if(vet[i] > maior) {
                maior = vet[i];
            } else if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        MyIO.println("Menor: " + menor + "\n" + "Maior: " + maior);

    }


}