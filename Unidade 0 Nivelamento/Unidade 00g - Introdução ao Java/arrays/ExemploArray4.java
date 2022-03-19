/* Faça um programa que leia n números e
mostre quais deles são maiores que a média */


public class ExemploArray4 {
    public static void main(String[] args) {
        
        int n = MyIO.readInt("Insira a quantidade de numeros: \n");
        int[] vet = new int[n];
        double media = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Digite um numero: \n");
            //Somando todos valores dentro de cada index para calcular a media na variavel media
            media += vet[i];
        }

        //Media é igual a media dividida pelo numero de elementos
        media /= n;

        MyIO.println("\n" + "Media: " + media + "\n");

        MyIO.println("Numeros superiores a media: ");
        //Mostrando elementos superiores a media
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                MyIO.println(vet[i]);
            }
        }

    }
    
}