/* Faça um programa para ler um número inteiro N e N elementos de um
array. Em seguida, se N for par mostrar na tela a soma do 1o e 2o
elemento, 3o e 4o, … */

public class ExemploArray9 {
    public static void main(String[]args) {

        //Variáveis
        int n = MyIO.readInt("Insira a quantidade de elementos\n");
        int vet[] = new int[n];
        int soma;       

        //Preenchendo Array
        for (int i = 0; i < vet.length; i++) {

            vet[i] = MyIO.readInt("Insira um numero\n"); 

        }

        MyIO.println("\n"); 
        //Analisa cada elemento do Array identificando se ele é par ou não
        for(int i = 0 ; i < vet.length ; i++){
            //Se o elemento for par ele será somado ao seu sucessor
            if (vet[i] % 2 == 0) {
                soma = vet[i] + vet[i + 1];
                MyIO.println("Soma do " + (i+1) + "º" + " e " + (i + 2) + "º" +" termos" + " = " + soma);
            } else {
                MyIO.println("----------Numero impar----------");
            }
        }

        
    }

}