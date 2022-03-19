/* Faça um programa que leia os elementos de um array de tamanho n e
mostre a posição do menor elemento do array */

public class ExemploArray7 {
    public static void main(String[] args){
        
        int n = MyIO.readInt("Insira a quantidade de elementos\n");
        int[] vet = new int[n];

        int maior, menor, pos = 0;

        for (int i = 0; i < n; i++){
            vet[i] = MyIO.readInt("Insira um numero\n");
        }

        menor = maior = vet[0];

        for (int i = 1; i < n; i++){
            if (vet[i] > maior) {
                maior = vet[i];
            }else if (vet[i] < menor) {
                menor = vet[i];
                pos++;
            }
        }
        MyIO.println("Menor elemento: " + menor + "\n");
        MyIO.println("Posicao do menor elemento " + pos);
        
    }
}