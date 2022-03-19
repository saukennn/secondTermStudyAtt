/* Faça um método que receba um array de inteiros e um
número inteiro x e retorne um valor booleano informando se o
elemento x está contido no array

----Repita o exercício acima considerando que os elementos do
----array estão ordenados de forma crescente. Uma sugestão
----seria começar a pesquisa pelo meio do array */

import java.util.Arrays;

class ex2slide2 {

    public static boolean retornaBool(int n, int[] vet, int num)  {

        boolean controle = false;

        int inicio = 0;
        int fim = vet.length -1;
        int meio;

        Arrays.sort(vet);

        while (inicio <= fim) {

            meio = (int)(inicio + fim) / 2;

            if (vet[meio] == num) {
                controle = true;
                break;
            }else if (vet[meio] < num){
                inicio = meio + 1;                
            } else {
                fim = meio - 1;
            }
        }   

        return controle;
    }

    public static void main(String[] args) {
        
        int n = MyIO.readInt("Insira quantos numeros\n");
        int[] vet = new int[n];
        int num;
        boolean resp;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = MyIO.readInt("Insira valor para PREENCHER o array\n");
        }

        num = MyIO.readInt("Insira um valor para PESQUISAR no array\n");

        resp = retornaBool(n, vet, num);
        
        MyIO.println(resp);
    }

}
