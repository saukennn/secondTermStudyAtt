/* Faça um programa para ler um vetor contendo N elementos e outro
contendo M elementos. Em seguida, mostre os elementos de forma
intercalada */

class ExemploArray13 {
    public static void main(String[] args) {

        MyIO.println("\n");
        MyIO.println("OS VETORES DEVEM TER O MESMO TAMANHO!!!!\n");
        int N = MyIO.readInt("Insira tamanho do vetor 1\n");
        int M = MyIO.readInt("Insira tamanho do vetor 2\n");
        int[] vet1 = new int[N];
        int[] vet2 = new int[M];
        int tamanhoVetor3 = N + M;
        int[] vet3 = new int[tamanhoVetor3];
        int j = 0;

        MyIO.println("\n");

        //Preencher vetor 1
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = MyIO.readInt("Insira valor para o vetor 1\n");
        }

        //Preencher vetor 2
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = MyIO.readInt("Insira valor para o vetor 2\n");
        }

        MyIO.println("\n");

        //Intercalando valores no vetor 3

        if (M > N) {
            for (int i = 0; i < M; i++) {
                vet3[j] = vet1[i];
                j++;
                vet3[j] = vet2[i]; 
                j++;
            } 
        }else{
            for (int i = 0; i < N; i++) {
                vet3[j] = vet1[i];
                j++;
                vet3[j] = vet2[i];
                j++;
            }
        }   

        MyIO.println("------------VETORES 1 E 2 INTERCALADOS------------\n");

        for ( j = 0; j < tamanhoVetor3; j++) {
            MyIO.println("Vetor 3[" + j + "] = " + vet3[j]);
        }
            

    }
}