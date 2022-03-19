/* Faça um programa que leia dois arrays e 
mostre na tela seus elementos intercalados */

class ExemploArray6 {
    public static void main(String[] args) {

        int tamMaior;

        int tam1 = MyIO.readInt("Insira o tamanho do Array 1\n");
        int tam2 = MyIO.readInt("Insira o tamanho do Array 2\n");

        int[] vet1 = new int[tam1];
        int[] vet2 = new int[tam2];

        for (int i = 0; i < tam1; i++) {
            vet1[i] = MyIO.readInt("Insira um numero para preencher o Array 1\n");
        }

        for (int i = 0; i < tam2; i++) {
            vet2[i] = MyIO.readInt("Insira um numero para preencher o Array 2\n");
        }

        if (tam1 > tam2) {
            tamMaior = tam1;
        } else {
            tamMaior = tam2;
        }

        for (int i = 0; i < tamMaior ; i++) {
            if (i < tam1) {
                MyIO.println("vet1["+ vet1[i] +"]");
            }
            if (i < tam2) {
                MyIO.println("vet2["+ vet2[i] +"]");
            }
        }
    }
}
