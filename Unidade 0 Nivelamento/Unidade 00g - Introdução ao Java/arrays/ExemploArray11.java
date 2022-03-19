/* Faça um programa que leia N números inteiros e mostre na tela a soma do
primeiro e do último, a do segundo e do penúltimo, a do terceiro e do
antepenúltimo etc */

public class ExemploArray11 {
    public static void main(String[] args) {
        
        //Variaveis
        int n = MyIO.readInt("Insira quantos elementos\n");
        int[] vet = new int[n];
        int soma = 0;

        //Preenchendo vetor com dados inseridos pelo usuario
        for(int i = 0; i < vet.length ; i++){
            MyIO.println("\n");
            vet[i] = MyIO.readInt("Insira um numero\n");
        }

        MyIO.println("\n");

        for (int i = 0; i < vet.length ; i++) {
            soma = vet[i] + vet[n - 1 - i];


            MyIO.println("Soma do elemento na posicao " + i +
             " com o elemento na posicao " + (n - 1 - i) + " Resulta em: " + soma);
        }



    }
}