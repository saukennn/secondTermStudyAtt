//Faça um programa que leia N numeros e mostre-os na tela
class ExemploArray2
{
    public static void main(String[] args)
    {
        int n = 0;

        //Usuario insere tamanho do array
        MyIO.println("Digite o tamanho do array:");
        n = MyIO.readInt();

        int[] vet = new int[n];

        //Usuario insere dados no array
        for (int i = 0; i < n; i++) {
            vet[i] = MyIO.readInt("Insira o elemento " + i + "\n");
        }

        //Elementos do array são mostrados na tela
        for (int i = 0; i < n; i++) {
            MyIO.println("vet[" + i + "] = " + vet[i]);
        }
          
    }
}