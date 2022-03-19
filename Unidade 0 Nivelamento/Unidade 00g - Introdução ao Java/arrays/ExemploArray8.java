/* Faça um programa que receba um array e ordene os elementos desse
array */

public class ExemploArray8 {

    public static void main(String[] args) {
        
        int n = MyIO.readInt("Insira o tamanho do Array\n");
        int[] vet = new int[n];
        boolean controle;
        int aux;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Digite um numero\n");
        }

        MyIO.println("-----------------Array Desordenado-----------------");
        MyIO.println("\n");
        for (int i = 0; i < vet.length; i++) {
            MyIO.println("vet[" + i + "] = " + vet[i]);

        }
        MyIO.println("\n");
        //Ordenando Array
        for (int i = 0; i < vet.length; i++) {
            controle = true;
            for (int j = 0; j < (vet.length - 1); j++) {
                
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    controle = false;
                }

            }
            if (controle) {
                break;
            }
        }

        MyIO.println("-----------------Array Ordenado-----------------");
        MyIO.println("\n");
        for (int i = 0; i < vet.length; i++) {
            MyIO.println("vet[" + i + "] = " + vet[i] );
        }
    }


}